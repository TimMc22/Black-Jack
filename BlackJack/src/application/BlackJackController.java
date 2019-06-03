package application;


import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import lib.ConsoleIO;
import models.Player;
	
	


public class BlackJackController implements Initializable{
	ObservableList<String> options = FXCollections.observableArrayList("1 Player", "2 Players", "3 Players", "4 Players");
	public Player[] players;
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
    private Pane numPlayersPane;
    
    @FXML
    private MenuItem onePlayer;
    
    @FXML
    private MenuItem twoPlayers;
    
    @FXML
    private MenuItem threePlayers;
    
    @FXML
    private MenuItem fourPlayers;

    @FXML
    private ComboBox<String> numPlayersBox;
    
    @FXML
    private TextField text;
    
    
    @FXML
    private void initialized() {
    	numPlayersBox.setItems(options);
    	numPlayersBox.setValue("Select Number of Players");
    }

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
    void clickHit(ActionEvent event) {
    
    }

    @FXML
    void clickLoadGame(ActionEvent event) {
    	Main.players = (Player[]) ConsoleIO.DeSerialize("C:/Users/Public/Desktop/Chips/" + text + ".chp", Main.players);
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
    	ConsoleIO.Serialize("C:/Users/Public/Desktop/Chips/" + text + ".chp", Main.players);
    }

    @FXML
    void clickSplit(ActionEvent event) {

    }

    @FXML
    void selectNumPlayers(ActionEvent event) {

    }

    @FXML
    void stayClick(ActionEvent event) {

    }
    
    @FXML
    void clickOnePlayer(ActionEvent event) {
    	int i = 1;
    	String playerName = JOptionPane.showInputDialog("Please enter your name: ");
    	if(playerName == null || playerName.isEmpty()) {
    		playerName = "Player " + i;
    	}
    	players[0] = new Player(playerName, 100);
    }
    
    @FXML
    void clickTwoPlayers(ActionEvent event) {
    	for(int i = 0; i < 2; i++) {
    		String playerName = JOptionPane.showInputDialog("Please enter your name: ");
    		if(playerName == null || playerName.isEmpty()) {
        		playerName = "Player " + i;
        	}
    		players[i] = new Player(playerName, 100);
    	}
    }
    
    @FXML
    void clickThreePlayers(ActionEvent event) {
    	for(int i = 0; i < 3; i++) {
    		String playerName = JOptionPane.showInputDialog("Please enter your name: ");
    		if(playerName == null || playerName.isEmpty()) {
        		playerName = "Player " + i;
        	}
    		players[i] = new Player(playerName, 100);
    	}
    }
    
    @FXML
    void clickFourPlayers(ActionEvent event) {
    	for(int i = 0; i < 4; i++) {
    		String playerName = JOptionPane.showInputDialog("Please enter your name: ");
    		if(playerName == null || playerName.isEmpty()) {
        		playerName = "Player " + i;
        	}
    		players[i] = new Player(playerName, 100);
    	}
    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		quit.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        System.out.println("Opening Database Connection...");
		    }
		});
	}

}
