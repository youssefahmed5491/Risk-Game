package aiRisk;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LevelChoiceController {
	@FXML
	Button egyptButton;
	@FXML
	Button americaButton;
	public void onClickEgypt(ActionEvent event) throws IOException 
	{
		MainClass.country=0;
		Parent userPage = FXMLLoader.load(getClass().getResource("PlayerChoice.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
	public void onClickAmerica(ActionEvent event) throws IOException 
	{
		MainClass.country=1;
		Parent userPage = FXMLLoader.load(getClass().getResource("PlayerChoice.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
	}
}
