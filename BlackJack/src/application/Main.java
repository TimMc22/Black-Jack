package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.Card;
import models.Deck;
import models.Player;


public class Main extends Application {
	public static Player[] players;
	public static Deck deck = new Deck();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public static Player[] makePlayers() {
		return players;
	}
	
	public static void gameStart() {
		
	}
	
	public static void gamePlay() {
		
	}
	
	public static void dealerPlay() {
		
	}

	public static int makeBet() {
		int bet = 0;
		return bet;
	}
	
	public static Card[] dealCards() {
		Card[] hand = new Card[2];
		return hand;
	}
	
	public static boolean askForHit() {
		boolean wantHit = false;
		return wantHit;
	}
	
	public static boolean askForStay() {
		boolean wantStay = false;
		return wantStay;
	}
	
	public static boolean splitHand() {
		boolean wantSplit = false;
		return wantSplit;
	}
	
	public static boolean doubleDown() {
		boolean wantDoubleD = false;
		return wantDoubleD;
	}
	
	public static boolean bust() {
		boolean isBust = false;
		return isBust;
	}
	
	public static boolean winCheck() {
		boolean isWin = false;
		return isWin;
	}
	
	public static void betOdds() {
		
	}
	
	public static void saveChips() {
		
	}
	
	public static void loadChips() {
		
	}
}
