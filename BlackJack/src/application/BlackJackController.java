package application;

import java.net.URL;
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

public class BlackJackController implements Initializable {

	@FXML
	private VBox vBox;

	@FXML
	private MenuBar MenuBar;
	
	@FXML
	private MenuBar numPlayersPane;

	@FXML
	private Menu menu;
	
	@FXML
	private Menu numPlayersMenu;

	@FXML
	private MenuItem newGame, saveGame;

	@FXML
	private MenuItem loadGame;

	@FXML
	private MenuItem quit;

	@FXML
	private MenuItem onePlayer;

	@FXML
	private MenuItem twoPlayers;

	@FXML
	private MenuItem threePlayers;

	@FXML
	private MenuItem fourPlayers;


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
	void selectNumPlayers(ActionEvent event) {

	}

	@FXML
	void stayClick(ActionEvent event) {

	}

	@FXML
	void clickOnePlayer(ActionEvent event) {

	}

	@FXML
	void clickTwoPlayes(ActionEvent event) {

	}

	@FXML
	void clickThreePlayers(ActionEvent event) {

	}

	@FXML
	void clickFourPlayers(ActionEvent event) {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		quit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Opening Database Connection...");
			}
		});
	}

}
