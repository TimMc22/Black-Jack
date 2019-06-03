package application;


import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

	
	

public class BlackJackController implements Initializable {

	public int numOfPlayers() {

		int numberPlayer = 0;
		String playerName = "";

		while (numberPlayer <= 0) {
			try {
				numberPlayer = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of player: "));
			} catch (NumberFormatException ex) {
				numberPlayer = 0;
			}

			for (int i = 0; i < numberPlayer; i++) {
				playerName = JOptionPane.showInputDialog("Please enter the player name: ");
				if (playerName == null || playerName.isEmpty()) {
					playerName = "Player " + i;
				}
			}
		}
		return numberPlayer;
	}
	
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
    private void initialized() {
    	
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
		System.out.println("Hit clicket");
	}


    @FXML
    void clickLoadGame(ActionEvent event) {
//    	Main.players = (Player[]) ConsoleIO.DeSerialize("C:/Users/Public/Desktop/Chips/" + text + ".chp", Main.players);
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
//    	ConsoleIO.Serialize("C:/Users/Public/Desktop/Chips/" + text + ".chp", Main.players);
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
    void clicPlayer(ActionEvent event) {
    	int players = numOfPlayers();

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
