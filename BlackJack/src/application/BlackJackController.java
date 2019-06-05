package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import models.Card;
import models.Dealer;
import models.Deck;
import models.Player;

public class BlackJackController implements Initializable {

	private static Player[] players;
	private static Card[] playerCards = new Card[2];
	private static Card[] dealerCards = new Card[52];
	private static Deck deck = new Deck();
	private static Dealer dealer = new Dealer();
	private static int numCard;
	private static int sum;
	private static int cardVal;

	@FXML
	private VBox vBox;

	@FXML
	private MenuBar MenuBar;

	@FXML
	private Menu menu;

	@FXML
	private MenuItem newGame, saveGame;

	@FXML
	private MenuItem loadGame;

	@FXML
	private MenuItem quit;

	@FXML
	private Button stayButton;

	@FXML
	private Button hitButton;

	@FXML
	private Button doubleDownButton;

	@FXML
	private Button splitButton;

	@FXML
	void clickDoubleDown(ActionEvent event) {

	}

	@FXML
	ArrayList<Card> clickHit(ActionEvent event) {
		ArrayList<Card> hand = null;
		Player player;
		Card nextCard = Dealer.dealCard();
		hand.add(nextCard);
//		if (hand.get(0).getValue() + hand.get(1).getValue() + nextCard.getValue() > 21) {
//			bust(player);
//		} else if (hand.get(0).getValue() + hand.get(1).getValue() + nextCard.getValue() == 21) {
//			getBlackjack(player);
//		} else {
//
//		}
		return hand;
	}

	private boolean bust(Player player) {
		boolean isBust = false;
		if (playerCards.length > 21) {
			System.out.println("you have a bust");
			isBust = true;
		}
		return isBust;
	}
	
	private void getBlackjack(Player player) {
		int chipsWon = player.getChips() * 2;

		player.setChips(chipsWon + player.getChips());
	}

	@FXML
	void clickLoadGame(ActionEvent event) {

	}

	@FXML
	void clickMenu(ActionEvent event) {

	}

	@FXML
	void clickNewGame(ActionEvent event) {

	}

	@FXML
	void clickQuit(ActionEvent event) {

	}

	@FXML
	void clickSaveGame(ActionEvent event) {

	}

	@FXML
	void clickSplit(ActionEvent event) {

	}

	@FXML
	void stayClick(ActionEvent event) {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//
	}

}
