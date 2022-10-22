package aiRisk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	public static int country;
	public static Agent player1Agent;
	public static Agent player2Agent;
	
	public static void main (String[]args)
	{		
		launch (args);		
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

}
