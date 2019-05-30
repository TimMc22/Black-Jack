package application;
	
import javax.swing.JButton;
import javax.swing.JPanel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.Card;
import models.Deck;
import models.Player;


public class Main extends Application {
	
	public static Player[] players;
	public static Card[] playerCards = new Card[2];
	public static Card[] dealerCards = new Card[52];
	public static Deck deck = new Deck();
	public static int numCard;  
    public static int sum;   
    public static int cardVal;
	
    public static JButton hitButton = new JButton("Hit");
    public static JButton stayButton = new JButton("Hit");
    public static JPanel panel = new JPanel();

    
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
		
		panel.add(hitButton);
		panel.add(stayButton); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public static Player[] makePlayers() {
		return players;
	}
	
	public static int getPlayerCards() {
		numCard = 0;  
        while(playerCards[numCard]!=null)
        numCard++;
        return numCard;

	}
	
	public static int getDealerCards() {
		numCard = 0; 
		
        while(dealerCards[numCard]!=null)
        numCard++;
        return numCard;

		
	}
	
	public static int getPlayerPoints() {
		numCard = 0;
		sum = 0;    
		cardVal = 0;
	    while(playerCards[numCard]!=null){
	        cardVal = playerCards[numCard].getCardValue();
	        if(cardVal == 1 && sum <= 10)
	                cardVal = 11;
	        else if(cardVal == 11)
	                cardVal = 10;
	        else if(cardVal == 12)
	                cardVal = 10;
	        else if(cardVal == 13)
	                cardVal = 10;
	        sum += cardVal;
	        numCard++;
	    }  
	    return sum;

	}
	
	public static int getDealerPoints() {
		numCard = 0;
		sum = 0;    
		cardVal = 0;
	    while(playerCards[numCard]!=null){
	        cardVal = dealerCards[numCard].getCardValue();
	        if(cardVal == 1 && sum <= 10)
	                cardVal = 11;
	        else if(cardVal == 11)
	                cardVal = 10;
	        else if(cardVal == 12)
	                cardVal = 10;
	        else if(cardVal == 13)
	                cardVal = 10;
	        sum += cardVal;
	        numCard++;
	    }  
	    return sum;
	}

	public static int makeBet() {
		int bet = 0;
		
		
		return bet;
	}
	
	public static boolean doubleDown() {
		boolean wantDoubleD = false;
		return wantDoubleD;
	}
	
	public static boolean bust() {
		boolean isBust = false;
		if(playerCards.length > 21) {
			System.out.println("you have a bust");
			isBust = true;
		}
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
