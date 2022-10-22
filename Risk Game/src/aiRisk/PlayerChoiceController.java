package aiRisk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class PlayerChoiceController {
@FXML 
ChoiceBox<String> player1ChoiceBox;
@FXML 
ChoiceBox<String> player2ChoiceBox;



public void initialize() 
{
	List<String> list1 = new ArrayList<String>();
	ObservableList<String> p1List = FXCollections.observableList(list1);
	p1List.add("Human Agent");
	p1List.add("Aggressive Agent");
	p1List.add("Completely Passive Agent");
	p1List.add("Greedy Agent");
	p1List.add("Nearly Pacifist Agent");
	p1List.add("Astar Agent");
	p1List.add("Minimax Agent");
	player1ChoiceBox.setItems(p1List);
	
	List<String> list2 = new ArrayList<String>();
	ObservableList<String> p2List = FXCollections.observableList(list2);
	p2List.add("Aggressive Agent");
	p2List.add("Completely Passive Agent");
	p2List.add("Greedy Agent");
	p2List.add("Nearly Pacifist Agent");
	p2List.add("Astar Agent");
	p2List.add("Minimax Agent");
	player2ChoiceBox.setItems(p2List);
	
}

public void onClickStart(ActionEvent event) throws IOException
{
	setPlayers();
	System.out.println(MainClass.country);
	if(MainClass.country==0) {
	Parent userPage = FXMLLoader.load(getClass().getResource("EgyptLevel.fxml"));
	Scene userScene = new Scene(userPage);
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(userScene);
	window.show();
	}
	if(MainClass.country==1) {
		Parent userPage = FXMLLoader.load(getClass().getResource("AmericaLevel.fxml"));
		Scene userScene = new Scene(userPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(userScene);
		window.show();
		}
}


public void setPlayers()
{
	if(player1ChoiceBox.getSelectionModel().getSelectedItem()=="Human Agent")
	{
		MainClass.player1Agent= new HumanAgent();
	}
	if(player1ChoiceBox.getSelectionModel().getSelectedItem()=="Aggressive Agent")
	{
		MainClass.player1Agent = new AggressiveAgent();
	}
	if(player1ChoiceBox.getSelectionModel().getSelectedItem()=="Completely Passive Agent")
	{
		MainClass.player1Agent = new CompletelyPassiveAgent();
	}
	if(player1ChoiceBox.getSelectionModel().getSelectedItem()=="Greedy Agent")
	{
		MainClass.player1Agent = new GreedyAgent();
	}
	if(player1ChoiceBox.getSelectionModel().getSelectedItem()=="Nearly Pacifist Agent")
	{
		MainClass.player1Agent = new NearlyPacifistAgent();
	}
	if(player1ChoiceBox.getSelectionModel().getSelectedItem()=="Astar Agent") {
		MainClass.player1Agent = new AstarAgent();
	}
	if(player1ChoiceBox.getSelectionModel().getSelectedItem()=="Minimax Agent") {
		MainClass.player1Agent = new Minimax();
	}
	if(player2ChoiceBox.getSelectionModel().getSelectedItem()=="Aggressive Agent")
	{
		MainClass.player2Agent = new AggressiveAgent();
	}
	if(player2ChoiceBox.getSelectionModel().getSelectedItem()=="Completely Passive Agent")
	{
		MainClass.player2Agent = new CompletelyPassiveAgent();
	}
	if(player2ChoiceBox.getSelectionModel().getSelectedItem()=="Greedy Agent")
	{
		MainClass.player2Agent = new GreedyAgent();
	}
	if(player2ChoiceBox.getSelectionModel().getSelectedItem()=="Nearly Pacifist Agent")
	{
		MainClass.player2Agent = new NearlyPacifistAgent();
	}
	if(player2ChoiceBox.getSelectionModel().getSelectedItem()=="Astar Agent") {
		MainClass.player2Agent = new AstarAgent();
	}
	if(player2ChoiceBox.getSelectionModel().getSelectedItem()=="Minimax Agent") {
		MainClass.player2Agent = new Minimax();
	}
}

}
