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

public class MainMenuController {
	
@FXML
Button startButton;


public void onClick(ActionEvent event) throws IOException 
{
	Parent userPage = FXMLLoader.load(getClass().getResource("LevelChoice.fxml"));
	Scene userScene = new Scene(userPage);
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(userScene);
	window.show();
}

}
