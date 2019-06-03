package application;

import java.util.ArrayList;
import java.util.HashMap;

//import javax.swing.JButton;
//import javax.swing.JPanel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import models.Card;
import models.Dealer;
import models.Deck;
import models.Player;

public class Main extends Application {
	public static Player[] players;
	public static Card[] playerCards = new Card[2];
	public static Card[] dealerCards = new Card[52];
	public static Deck deck = new Deck();
	public static Dealer dealer = new Dealer();
	public static int numCard;
	public static int sum;
	public static int cardVal;

	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox) FXMLLoader.load(getClass().getResource("/application/blackjackSceneBuilder.fxml"));
//			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 1000, 1000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	
	public static void makePlayers() {
		// need to populate the dropdown menu with 1,2,3,4
		// ask players for name
		// populate players into array accordingly
		int numPlayers = 3;
		for (int i = 0; i < numPlayers; i++) {
			// ask for name
			String name = "Name";
			if(name == "") {
				name = "Player " + i;
			}

			//ask for num chips
			Player player = new Player(name, 100);
			players[i] = player;
		}
		gameStart(players);
	}

	public static void gameStart(Player[] players) {
		for (int i = 0; i < players.length; i++) {
			int bet = askForBet(players[i]);
			if (bet > 0) {
				Player.placeBet(bet);
			} else {
				Player.placeBet(0);
			}
		}
		gamePlay(players);
	}

	public static void gamePlay(Player[] players) {
		for (int i = 0; i < players.length; i++) {
			Dealer.dealHand();
			boolean canSplit = checkForSplit(players[i]);
			
			// tell gui to ask for split here
			if (canSplit) {
				splitHand(players[i].getHand(), players[i]);
			} else {
				getPlayerPoints(players[i]);
			}

		}
		
		int stayCount = 0;
		boolean[] stay = new boolean[players.length];
		for (int i = 0; i < players.length; i++) {
			do {
				if (stay[i]) {
					stayCount++;
				}
				// ask each player to choose hit, stay, split, or double down
			} while (stayCount != players.length);
		}
		dealerPlay();
	}

	public static boolean checkForSplit(Player player) {
		ArrayList<Card> hand = player.getHand();
		if (hand.get(0) == hand.get(1)) {
			return true;
		} else {
			return false;
		}
	}

	public static int getPlayerCards() {
		numCard = 0;
		while (playerCards[numCard] != null)
			numCard++;
		return numCard;

	}

	public static int getDealerCards() {
		numCard = 0;

		while (dealerCards[numCard] != null)
			numCard++;
		return numCard;

	}

	public static int getPlayerPoints(Player player) {
		ArrayList<Card> hand = player.getHand();
		int totalValue = hand.get(0).getRank().value + hand.get(1).getRank().value;
		if (hand.get(0).getRank().value == 1 && sum <= 10) {
			totalValue = hand.get(1).getRank().value + 11;
		} else if (hand.get(1).getRank().value == 1 && sum <= 10) {
			totalValue = hand.get(0).getRank().value + 11;
		}
		return totalValue;
	}

	public static int getDealerPoints() {
		ArrayList<Card> hand = dealer.getHand();
		int totalValue = hand.get(0).getRank().value + hand.get(1).getRank().value;
		if (hand.get(0).getRank().value == 1 && sum <= 10) {
			totalValue = hand.get(1).getRank().value + 11;
		} else if (hand.get(1).getRank().value == 1 && sum <= 10) {
			totalValue = hand.get(0).getRank().value + 11;
		}
		return totalValue;
	}

	public static int askForBet(Player player) {
		// need logic for betting to communicate with the GUI
		boolean betValid = false;
		int bet = 10;
		do {
			// ask for bet
			if (bet < player.getChips()) {
				bet = 10;
				player.setBet(bet);
				betValid = true;
			} else {
				// message saying bet is invalid
			}
		} while (!betValid);
		return bet;
	}

	public static int dealerPlay() {
		Card[] hand = Dealer.dealHand();
		int handValue = hand[0].getValue() + hand[1].getValue();
		do {
			if (handValue < 17) {
				Card hit = Dealer.dealCard();
				handValue += hit.getValue();
			}
		} while (handValue < 17);

		return handValue;
	}


	public static ArrayList<Card> askForHit(ArrayList<Card> hand, Player player) {
		Card nextCard = Dealer.dealCard();
		hand.add(nextCard);
		if (hand.get(0).getValue() + hand.get(1).getValue() + nextCard.getValue() > 21) {
			bust(player);
		} else if (hand.get(0).getValue() + hand.get(1).getValue() + nextCard.getValue() == 21) {
			getBlackjack(player);
		} else {

		}
		return hand;
	}

	public static boolean askForHit(Player player) {
		boolean wantHit = false;
		return wantHit;
	}

	public static boolean askForStay(Player player) {
		boolean wantStay = false;
		return wantStay;
	}

	public static HashMap<Card, Card> splitHand(ArrayList<Card> hand, Player player) {
		HashMap<Card, Card> hands = new HashMap<>();
		hands.put(hand.get(0), Dealer.dealCard());
		hands.put(hand.get(1), Dealer.dealCard());
		return hands;
	}

	public static int makeBet() {
		int bet = 0;
		return bet;
	}

	public static boolean doubleDown() {
		boolean wantDoubleD = false;
		return wantDoubleD;
	}

	public static void win(Player player) {
		getBlackjack(player);
	}

	// needs fixed
	public static boolean bust(Player player) {
		boolean isBust = false;
		if (playerCards.length > 21) {
			System.out.println("you have a bust");
			isBust = true;
		}
		return isBust;
	}

	public static void lose(Player player) {
		int chipsLost = player.getBet();
		player.setChips(player.getChips() - chipsLost);

	}

	public static void push(Player player) {
		player.setChips(player.getChips());
	}

	public static void getBlackjack(Player player) {
		int chipsWon = player.getChips() * 2;

		player.setChips(chipsWon + player.getChips());
	}

}
