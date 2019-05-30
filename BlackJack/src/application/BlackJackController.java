package application;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;



public class BlackJackController extends Main{
	
	
	ObservableList<String> options = FXCollections.observableArrayList("1 Player", "2 Players", "3 Players", "4 Players");

	
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
    private ComboBox<String> numPlayersBox;
    
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
