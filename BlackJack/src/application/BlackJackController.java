package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class BlackJackController {
    @FXML
    private VBox vBox;

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
    private ComboBox<Integer> numPlayersBox;

    @FXML
    private Button stayButton;

    @FXML
    private Button hitButton;

    @FXML
    private Button doubleDownButton;

    @FXML
    private Button splitButton;
    
    @FXML
    private void init() {
    	
    }

    @FXML
    void clickDoubleDown(ActionEvent event) {

    }

    @FXML
    void clickHit(ActionEvent event) {

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

}
