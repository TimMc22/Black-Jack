package application;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.Card;
import models.Dealer;
import models.Deck;
import models.Player;

public class Main extends Application {
	public static Player[] players;
	public static Deck deck = new Deck();
	public static Dealer dealer = new Dealer();

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
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
		// info from dropdown menu
		for (int i = 0; i < numPlayers; i++) {
			
			// ask for name
			String name = "Name";
			
			Player player = new Player(name);
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
		}
		int stayCount = 0;
		boolean[] stay = new boolean[players.length];
		for (int i = 0; i < players.length; i++) {
			do {
				if (stay[i]) {
					stayCount++;
				}
				// ask each player to choose hit, stay, split, or double down
			} while (stayCount < players.length);
		}
		dealerPlay();
	}

	public static int askForBet(Player player) {
		int bet = 0;
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

	public static Card[] dealCards() {
		Card[] hand = new Card[2];
		return hand;
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

	
	public static HashMap<Card, Card> splitHand(ArrayList<Card> hand, Player player) {
		HashMap<Card, Card> hands = new HashMap<>();
		hands.put(hand.get(0), Dealer.dealCard());
		hands.put(hand.get(1), Dealer.dealCard());
		return hands;
	}

	public static boolean doubleDown() {
		boolean wantDoubleD = false;
		return wantDoubleD;
	}

	public static void bust(Player player) {
		int chips = player.getChips();
		// add odds here
		int odds = 1;
		player.setChips(chips = player.getBet() * odds);
	}

	public static void win(Player player) {
		int chips = player.getChips();
		// add odds here
		int odds = 1;
		player.setChips(chips = player.getBet() * odds);
	}

	public static void lose(Player player) {
		int chips = player.getChips();

		// add odds here
		int odds = 1;
		player.setChips(chips = player.getBet() * odds);

	}

	public static void getBlackjack(Player player) {
		int chips = player.getChips();
		// multiply odds here
		int odds = 1;

		player.setChips(chips + player.getBet() * odds);
	}

	public static void saveChips() {
		
	}

	public static void loadChips() {

	}
}
