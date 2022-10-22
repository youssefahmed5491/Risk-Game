package aiRisk;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class EgyptLevelController {

@FXML
ImageView redState1;
@FXML
ImageView redState2;
@FXML
ImageView redState3;
@FXML
ImageView redState4;
@FXML
ImageView redState5;
@FXML
ImageView redState6;
@FXML
ImageView redState7;
@FXML
ImageView redState8;
@FXML
ImageView redState9;
@FXML
ImageView redState10;
@FXML
ImageView redState11;
@FXML
ImageView redState12;
@FXML
ImageView redState13;
@FXML
ImageView redState14;
@FXML
ImageView redState15;
@FXML
ImageView redState16;
@FXML
ImageView redState17;
@FXML
ImageView redState18;
@FXML
ImageView redState19;
@FXML
ImageView redState20;
@FXML
ImageView redState21;
@FXML
ImageView redState22;
@FXML
ImageView redState23;
@FXML
ImageView redState24;
@FXML
ImageView redState25;
@FXML
ImageView redState26;
@FXML
ImageView redState27;

@FXML
ImageView greenState1;
@FXML
ImageView greenState2;
@FXML
ImageView greenState3;
@FXML
ImageView greenState4;
@FXML
ImageView greenState5;
@FXML
ImageView greenState6;
@FXML
ImageView greenState7;
@FXML
ImageView greenState8;
@FXML
ImageView greenState9;
@FXML
ImageView greenState10;
@FXML
ImageView greenState11;
@FXML
ImageView greenState12;
@FXML
ImageView greenState13;
@FXML
ImageView greenState14;
@FXML
ImageView greenState15;
@FXML
ImageView greenState16;
@FXML
ImageView greenState17;
@FXML
ImageView greenState18;
@FXML
ImageView greenState19;
@FXML
ImageView greenState20;
@FXML
ImageView greenState21;
@FXML
ImageView greenState22;
@FXML
ImageView greenState23;
@FXML
ImageView greenState24;
@FXML
ImageView greenState25;
@FXML
ImageView greenState26;
@FXML
ImageView greenState27;

@FXML
Polygon polyState1;
@FXML
Polygon polyState2;
@FXML
Polygon polyState3;
@FXML
Polygon polyState4;
@FXML
Polygon polyState5;
@FXML
Polygon polyState6;
@FXML
Polygon polyState7;
@FXML
Polygon polyState8;
@FXML
Polygon polyState9;
@FXML
Polygon polyState10;
@FXML
Polygon polyState11;
@FXML
Polygon polyState12;
@FXML
Polygon polyState13;
@FXML
Polygon polyState14;
@FXML
Polygon polyState15;
@FXML
Polygon polyState16;
@FXML
Polygon polyState17;
@FXML
Polygon polyState18;
@FXML
Polygon polyState19;
@FXML
Polygon polyState20;
@FXML
Polygon polyState21;
@FXML
Polygon polyState22;
@FXML
Polygon polyState23;
@FXML
Polygon polyState24;
@FXML
Polygon polyState25;
@FXML
Polygon polyState26;
@FXML
Polygon polyState27;

@FXML
Label armyNumberLabelState1;
@FXML
Label armyNumberLabelState2;
@FXML
Label armyNumberLabelState3;
@FXML
Label armyNumberLabelState4;
@FXML
Label armyNumberLabelState5;
@FXML
Label armyNumberLabelState6;
@FXML
Label armyNumberLabelState7;
@FXML
Label armyNumberLabelState8;
@FXML
Label armyNumberLabelState9;
@FXML
Label armyNumberLabelState10;
@FXML
Label armyNumberLabelState11;
@FXML
Label armyNumberLabelState12;
@FXML
Label armyNumberLabelState13;
@FXML
Label armyNumberLabelState14;
@FXML
Label armyNumberLabelState15;
@FXML
Label armyNumberLabelState16;
@FXML
Label armyNumberLabelState17;
@FXML
Label armyNumberLabelState18;
@FXML
Label armyNumberLabelState19;
@FXML
Label armyNumberLabelState20;
@FXML
Label armyNumberLabelState21;
@FXML
Label armyNumberLabelState22;
@FXML
Label armyNumberLabelState23;
@FXML
Label armyNumberLabelState24;
@FXML
Label armyNumberLabelState25;
@FXML
Label armyNumberLabelState26;
@FXML
Label armyNumberLabelState27;

@FXML
Rectangle sideBar;
@FXML
Label stateNumberSideBarLabel;
@FXML
Label armyNumberSideBarLabel;
@FXML
Button addArmySideBarButton;
@FXML
Button attackSideBarButton;
@FXML
TextField armyNumberToAddSideBarTextField;
@FXML
Label additionalarmy;
@FXML
Label choose;
@FXML
ChoiceBox<String> adjacentStatesSideBarChoiceBox;
@FXML
Button AiViewButton;

State state1 = new State(1);
State state2 = new State(2);
State state3 = new State(3);
State state4 = new State(4);
State state5 = new State(5);
State state6 = new State(6);
State state7 = new State(7);
State state8 = new State(8);
State state9 = new State(9);
State state10 = new State(10);
State state11 = new State(11);
State state12 = new State(12);
State state13 = new State(13);
State state14 = new State(14);
State state15 = new State(15);
State state16 = new State(16);
State state17 = new State(17);
State state18 = new State(18);
State state19 = new State(19);
State state20 = new State(20);
State state21 = new State(21);
State state22 = new State(22);
State state23 = new State(23);
State state24 = new State(24);
State state25 = new State(25);
State state26 = new State(26);
State state27 = new State(27);

public void stateStates() {

	ArrayList<State> adjacentlist1 = new ArrayList<State>();
	
	adjacentlist1.add(state2);
	adjacentlist1.add(state3);
	adjacentlist1.add(state14);
	adjacentlist1.add(state21);
	
	state1.setAdjacentlist(adjacentlist1);
	
	ArrayList<State> adjacentlist2 = new ArrayList<State>();
	
	adjacentlist2.add(state1);
	adjacentlist2.add(state3);
	
	state2.setAdjacentlist(adjacentlist2);
	
	ArrayList<State> adjacentlist3 = new ArrayList<State>();
	
	adjacentlist3.add(state2);
	adjacentlist3.add(state1);
	adjacentlist3.add(state4);
	adjacentlist3.add(state9);
	adjacentlist3.add(state10);
	adjacentlist3.add(state14);
	
	state3.setAdjacentlist(adjacentlist3);

	ArrayList<State> adjacentlist4 = new ArrayList<State>();
	
	adjacentlist4.add(state3);
	adjacentlist4.add(state9);
	adjacentlist4.add(state5);
	
	state4.setAdjacentlist(adjacentlist4);
	
	ArrayList<State> adjacentlist5 = new ArrayList<State>();
	
	adjacentlist5.add(state4);
	adjacentlist5.add(state9);
	adjacentlist5.add(state11);
	adjacentlist5.add(state12);
	adjacentlist5.add(state6);
	
	state5.setAdjacentlist(adjacentlist5);
	
	ArrayList<State> adjacentlist6 = new ArrayList<State>();
	
	adjacentlist6.add(state5);
	
	state6.setAdjacentlist(adjacentlist6);
	
	ArrayList<State> adjacentlist7 = new ArrayList<State>();
	
	adjacentlist7.add(state13);
	adjacentlist7.add(state8);
	
	state7.setAdjacentlist(adjacentlist7);
	
	ArrayList<State> adjacentlist8 = new ArrayList<State>();
	
	adjacentlist8.add(state7);
	adjacentlist8.add(state13);
	adjacentlist8.add(state17);
	adjacentlist8.add(state18);
	
	state8.setAdjacentlist(adjacentlist8);
	
	ArrayList<State> adjacentlist9 = new ArrayList<State>();
	
	adjacentlist9.add(state4);
	adjacentlist9.add(state3);
	adjacentlist9.add(state10);
	adjacentlist9.add(state5);
	
	state9.setAdjacentlist(adjacentlist9);
	
	ArrayList<State> adjacentlist10 = new ArrayList<State>();
	
	adjacentlist10.add(state3);
	adjacentlist10.add(state9);
	adjacentlist10.add(state11);
	adjacentlist10.add(state14);
	
	state10.setAdjacentlist(adjacentlist10);
	
	ArrayList<State> adjacentlist11 = new ArrayList<State>();
	
	adjacentlist11.add(state10);
	adjacentlist11.add(state14);
	adjacentlist11.add(state16);
	adjacentlist11.add(state12);
	adjacentlist11.add(state5);
	
	state11.setAdjacentlist(adjacentlist11);
	
	ArrayList<State> adjacentlist12 = new ArrayList<State>();
	
	adjacentlist12.add(state5);
	adjacentlist12.add(state11);
	adjacentlist12.add(state16);
	adjacentlist12.add(state17);
	adjacentlist12.add(state13);
	
	state12.setAdjacentlist(adjacentlist12);
	
	ArrayList<State> adjacentlist13 = new ArrayList<State>();
	
	adjacentlist13.add(state7);
	adjacentlist13.add(state8);
	adjacentlist13.add(state12);
	adjacentlist13.add(state17);
	
	state13.setAdjacentlist(adjacentlist13);
	
	ArrayList<State> adjacentlist14 = new ArrayList<State>();
	
	adjacentlist14.add(state1);
	adjacentlist14.add(state3);
	adjacentlist14.add(state10);
	adjacentlist14.add(state11);
	adjacentlist14.add(state16);
	adjacentlist14.add(state15);
	adjacentlist14.add(state19);
	adjacentlist14.add(state20);
	adjacentlist14.add(state21);
	
	state14.setAdjacentlist(adjacentlist14);
	
	ArrayList<State> adjacentlist15 = new ArrayList<State>();
	
	adjacentlist15.add(state14);
	adjacentlist15.add(state19);
	
	state15.setAdjacentlist(adjacentlist15);
	
	ArrayList<State> adjacentlist16 = new ArrayList<State>();
	
	adjacentlist16.add(state14);
	adjacentlist16.add(state17);
	adjacentlist16.add(state11);
	adjacentlist16.add(state12);
	adjacentlist16.add(state23);
	adjacentlist16.add(state19);
	
	state16.setAdjacentlist(adjacentlist16);

	ArrayList<State> adjacentlist17 = new ArrayList<State>();
	
	adjacentlist17.add(state16);
	adjacentlist17.add(state13);
	adjacentlist17.add(state8);
	adjacentlist17.add(state18);
	adjacentlist17.add(state23);
	
	state17.setAdjacentlist(adjacentlist17);
	
	ArrayList<State> adjacentlist18 = new ArrayList<State>();
	
	adjacentlist18.add(state8);
	adjacentlist18.add(state17);
	
	state18.setAdjacentlist(adjacentlist18);
	
	ArrayList<State> adjacentlist19 = new ArrayList<State>();
	
	adjacentlist19.add(state14);
	adjacentlist19.add(state15);
	adjacentlist19.add(state16);
	adjacentlist19.add(state23);
	adjacentlist19.add(state20);
	
	state19.setAdjacentlist(adjacentlist19);
	
	ArrayList<State> adjacentlist20 = new ArrayList<State>();
	
	adjacentlist20.add(state14);
	adjacentlist20.add(state19);
	adjacentlist20.add(state21);
	adjacentlist20.add(state23);
	adjacentlist20.add(state22);
	
	state20.setAdjacentlist(adjacentlist20);
	
	ArrayList<State> adjacentlist21 = new ArrayList<State>();
	
	adjacentlist21.add(state1);
	adjacentlist21.add(state14);
	adjacentlist21.add(state20);
	adjacentlist21.add(state22);
	adjacentlist21.add(state24);
	adjacentlist21.add(state25);
	adjacentlist21.add(state26);
	adjacentlist21.add(state27);
	
	state21.setAdjacentlist(adjacentlist21);
	
	ArrayList<State> adjacentlist22 = new ArrayList<State>();
	
	adjacentlist22.add(state20);
	adjacentlist22.add(state21);
	adjacentlist22.add(state23);
	adjacentlist22.add(state24);
	
	state22.setAdjacentlist(adjacentlist22);
	
	ArrayList<State> adjacentlist23 = new ArrayList<State>();
	
	adjacentlist23.add(state16);
	adjacentlist23.add(state17);
	adjacentlist23.add(state19);
	adjacentlist23.add(state20);
	adjacentlist23.add(state22);
	adjacentlist23.add(state24);
	adjacentlist23.add(state25);
	adjacentlist23.add(state26);
	adjacentlist23.add(state27);
	
	state23.setAdjacentlist(adjacentlist23);
	
	ArrayList<State> adjacentlist24 = new ArrayList<State>();
	
	adjacentlist24.add(state21);
	adjacentlist24.add(state22);
	adjacentlist24.add(state23);
	adjacentlist24.add(state25);
	
	state24.setAdjacentlist(adjacentlist24);
	
	ArrayList<State> adjacentlist25 = new ArrayList<State>();
	
	adjacentlist25.add(state21);
	adjacentlist25.add(state23);
	adjacentlist25.add(state24);
	adjacentlist25.add(state26);
	
	state25.setAdjacentlist(adjacentlist25);
	
	ArrayList<State> adjacentlist26 = new ArrayList<State>();
	
	adjacentlist26.add(state21);
	adjacentlist26.add(state23);
	adjacentlist26.add(state25);
	adjacentlist26.add(state27);
	
	state26.setAdjacentlist(adjacentlist26);
	
	ArrayList<State> adjacentlist27 = new ArrayList<State>();
	
	adjacentlist27.add(state21);
	adjacentlist27.add(state23);
	adjacentlist27.add(state26);
	
	state27.setAdjacentlist(adjacentlist27);

}

Player1 player1 = Player1.getPlayer();
Player2 player2 = Player2.getPlayer();

public void initialize() {
	stateStates();
	redState1.setVisible(true);
	player1.teritorylist.add(state1);
	armyNumberLabelState1.setText("5");
	state1.armynumber=5;
	state1.color=1;
	greenState27.setVisible(true);
	player2.teritorylist.add(state27);
	armyNumberLabelState27.setText("5");
	state27.armynumber=5;
	state27.color=2;
	greenState23.setVisible(true);
	player2.teritorylist.add(state23);
	armyNumberLabelState23.setText("5");
	state23.armynumber=5;
	state23.color=2;
	if(MainClass.player1Agent instanceof HumanAgent){
		player1.AdditionalArmyNumber(player1);
		additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
	}
	if(!(MainClass.player1Agent instanceof HumanAgent)) {
		AiViewButton.setVisible(true);
	}
}

public void update(int statenumber,int newarmynumber,int color) {

	if(statenumber == 1) {
		state1.armynumber = newarmynumber;
		state1.color = color;
		armyNumberLabelState1.setText(String.valueOf(state1.armynumber));
		if(state1.color==1) {
			redState1.setVisible(true);
			greenState1.setVisible(false);
		}
		else if(state1.color==2) {
			greenState1.setVisible(true);
			redState1.setVisible(false);
		}
	}
	else if(statenumber == 2) {
		state2.armynumber = newarmynumber;
		state2.color = color;
		armyNumberLabelState2.setText(String.valueOf(state2.armynumber));
		if(state2.color==1) {
			redState2.setVisible(true);
			greenState2.setVisible(false);
		}
		else if(state2.color==2) {
			greenState2.setVisible(true);
			redState2.setVisible(false);
		}
	}
	else if(statenumber == 3) {
		state3.armynumber = newarmynumber;
		state3.color = color;
		armyNumberLabelState3.setText(String.valueOf(state3.armynumber));
		if(state3.color==1) {
			redState3.setVisible(true);
			greenState3.setVisible(false);
		}
		else if(state3.color==2) {
			greenState3.setVisible(true);
			redState3.setVisible(false);
		}
	}
	else if(statenumber == 4) {
		state4.armynumber = newarmynumber;
		state4.color = color;
		armyNumberLabelState4.setText(String.valueOf(state4.armynumber));
		if(state4.color==1) {
			redState4.setVisible(true);
			greenState4.setVisible(false);
		}
		else if(state4.color==2) {
			greenState4.setVisible(true);
			redState4.setVisible(false);
		}
	}
	else if(statenumber == 5) {
		state5.armynumber = newarmynumber;
		state5.color = color;
		armyNumberLabelState5.setText(String.valueOf(state5.armynumber));
		if(state5.color==1) {
			redState5.setVisible(true);
			greenState5.setVisible(false);
		}
		else if(state5.color==2) {
			greenState5.setVisible(true);
			redState5.setVisible(false);
		}
	}
	else if(statenumber == 6) {
		state6.armynumber = newarmynumber;
		state6.color = color;
		armyNumberLabelState6.setText(String.valueOf(state6.armynumber));
		if(state6.color==1) {
			redState6.setVisible(true);
			greenState6.setVisible(false);
		}
		else if(state6.color==2) {
			greenState6.setVisible(true);
			redState6.setVisible(false);
		}
	}
	else if(statenumber == 7) {
		state7.armynumber = newarmynumber;
		state7.color = color;
		armyNumberLabelState7.setText(String.valueOf(state7.armynumber));
		if(state7.color==1) {
			redState7.setVisible(true);
			greenState7.setVisible(false);
		}
		else if(state7.color==2) {
			greenState7.setVisible(true);
			redState7.setVisible(false);
		}
	}
	else if(statenumber == 8) {
		state8.armynumber = newarmynumber;
		state8.color = color;
		armyNumberLabelState8.setText(String.valueOf(state8.armynumber));
		if(state8.color==1) {
			redState8.setVisible(true);
			greenState8.setVisible(false);
		}
		else if(state8.color==2) {
			greenState8.setVisible(true);
			redState8.setVisible(false);
		}
	}
	else if(statenumber == 9) {
		state9.armynumber = newarmynumber;
		state9.color = color;
		armyNumberLabelState9.setText(String.valueOf(state9.armynumber));
		if(state9.color==1) {
			redState9.setVisible(true);
			greenState9.setVisible(false);
		}
		else if(state9.color==2) {
			greenState9.setVisible(true);
			redState9.setVisible(false);
		}
	}
	else if(statenumber == 10) {
		state10.armynumber = newarmynumber;
		state10.color = color;
		armyNumberLabelState10.setText(String.valueOf(state10.armynumber));
		if(state10.color==1) {
			redState10.setVisible(true);
			greenState10.setVisible(false);
		}
		else if(state10.color==2) {
			greenState10.setVisible(true);
			redState10.setVisible(false);
		}
	}
	else if(statenumber == 11) {
		state11.armynumber = newarmynumber;
		state11.color = color;
		armyNumberLabelState11.setText(String.valueOf(state11.armynumber));
		if(state11.color==1) {
			redState11.setVisible(true);
			greenState11.setVisible(false);
		}
		else if(state11.color==2) {
			greenState11.setVisible(true);
			redState11.setVisible(false);
		}
	}
	else if(statenumber == 12) {
		state12.armynumber = newarmynumber;
		state12.color = color;
		armyNumberLabelState12.setText(String.valueOf(state12.armynumber));
		if(state12.color==1) {
			redState12.setVisible(true);
			greenState12.setVisible(false);
		}
		else if(state12.color==2) {
			greenState12.setVisible(true);
			redState12.setVisible(false);
		}
	}
	else if(statenumber == 13) {
		state13.armynumber = newarmynumber;
		state13.color = color;
		armyNumberLabelState13.setText(String.valueOf(state13.armynumber));
		if(state13.color==1) {
			redState13.setVisible(true);
			greenState13.setVisible(false);
		}
		else if(state13.color==2) {
			greenState13.setVisible(true);
			redState13.setVisible(false);
		}
	}
	else if(statenumber == 14) {
		state14.armynumber = newarmynumber;
		state14.color = color;
		armyNumberLabelState14.setText(String.valueOf(state14.armynumber));
		if(state14.color==1) {
			redState14.setVisible(true);
			greenState14.setVisible(false);
		}
		else if(state14.color==2) {
			greenState14.setVisible(true);
			redState14.setVisible(false);
		}
	}
	else if(statenumber == 15) {
		state15.armynumber = newarmynumber;
		state15.color = color;
		armyNumberLabelState15.setText(String.valueOf(state15.armynumber));
		if(state15.color==1) {
			redState15.setVisible(true);
			greenState15.setVisible(false);
		}
		else if(state15.color==2) {
			greenState15.setVisible(true);
			redState15.setVisible(false);
		}
	}
	else if(statenumber == 16) {
		state16.armynumber = newarmynumber;
		state16.color = color;
		armyNumberLabelState16.setText(String.valueOf(state16.armynumber));
		if(state16.color==1) {
			redState16.setVisible(true);
			greenState16.setVisible(false);
		}
		else if(state16.color==2) {
			greenState16.setVisible(true);
			redState16.setVisible(false);
		}
	}
	else if(statenumber == 17) {
		state17.armynumber = newarmynumber;
		state17.color = color;
		armyNumberLabelState17.setText(String.valueOf(state17.armynumber));
		if(state17.color==1) {
			redState17.setVisible(true);
			greenState17.setVisible(false);
		}
		else if(state17.color==2) {
			greenState17.setVisible(true);
			redState17.setVisible(false);
		}
	}
	else if(statenumber == 18) {
		state18.armynumber = newarmynumber;
		state18.color = color;
		armyNumberLabelState18.setText(String.valueOf(state18.armynumber));
		if(state18.color==1) {
			redState18.setVisible(true);
			greenState18.setVisible(false);
		}
		else if(state18.color==2) {
			greenState18.setVisible(true);
			redState18.setVisible(false);
		}
	}
	else if(statenumber == 19) {
		state19.armynumber = newarmynumber;
		state19.color = color;
		armyNumberLabelState19.setText(String.valueOf(state19.armynumber));
		if(state19.color==1) {
			redState19.setVisible(true);
			greenState19.setVisible(false);
		}
		else if(state19.color==2) {
			greenState19.setVisible(true);
			redState19.setVisible(false);
		}
	}
	else if(statenumber == 20) {
		state20.armynumber = newarmynumber;
		state20.color = color;
		armyNumberLabelState20.setText(String.valueOf(state20.armynumber));
		if(state20.color==1) {
			redState20.setVisible(true);
			greenState20.setVisible(false);
		}
		else if(state20.color==2) {
			greenState20.setVisible(true);
			redState20.setVisible(false);
		}
	}
	else if(statenumber == 21) {
		state21.armynumber = newarmynumber;
		state21.color = color;
		armyNumberLabelState21.setText(String.valueOf(state21.armynumber));
		if(state21.color==1) {
			redState21.setVisible(true);
			greenState21.setVisible(false);
		}
		else if(state21.color==2) {
			greenState21.setVisible(true);
			redState21.setVisible(false);
		}
	}
	else if(statenumber == 22) {
		state22.armynumber = newarmynumber;
		state22.color = color;
		armyNumberLabelState22.setText(String.valueOf(state22.armynumber));
		if(state22.color==1) {
			redState22.setVisible(true);
			greenState22.setVisible(false);
		}
		else if(state22.color==2) {
			greenState22.setVisible(true);
			redState22.setVisible(false);
		}
	}
	else if(statenumber == 23) {
		state23.armynumber = newarmynumber;
		state23.color = color;
		armyNumberLabelState23.setText(String.valueOf(state23.armynumber));
		if(state23.color==1) {
			redState23.setVisible(true);
			greenState23.setVisible(false);
		}
		else if(state23.color==2) {
			greenState23.setVisible(true);
			redState23.setVisible(false);
		}
	}
	else if(statenumber == 24) {
		state24.armynumber = newarmynumber;
		state24.color = color;
		armyNumberLabelState24.setText(String.valueOf(state24.armynumber));
		if(state24.color==1) {
			redState24.setVisible(true);
			greenState24.setVisible(false);
		}
		else if(state24.color==2) {
			greenState24.setVisible(true);
			redState24.setVisible(false);
		}
	}
	else if(statenumber == 25) {
		state25.armynumber = newarmynumber;
		state25.color = color;
		armyNumberLabelState25.setText(String.valueOf(state25.armynumber));
		if(state25.color==1) {
			redState25.setVisible(true);
			greenState25.setVisible(false);
		}
		else if(state25.color==2) {
			greenState25.setVisible(true);
			redState25.setVisible(false);
		}
	}
	else if(statenumber == 26) {
		state26.armynumber = newarmynumber;
		state26.color = color;
		armyNumberLabelState26.setText(String.valueOf(state26.armynumber));
		if(state26.color==1) {
			redState26.setVisible(true);
			greenState26.setVisible(false);
		}
		else if(state26.color==2) {
			greenState26.setVisible(true);
			redState26.setVisible(false);
		}
	}
	else {
		state27.armynumber = newarmynumber;
		state27.color = color;
		armyNumberLabelState27.setText(String.valueOf(state27.armynumber));
		if(state27.color==1) {
			redState27.setVisible(true);
			greenState27.setVisible(false);
		}
		else if(state27.color==2) {
			greenState27.setVisible(true);
			redState27.setVisible(false);
		}
	}
	
}

public void setvisible(State state) {
	sideBar.setVisible(true);
	stateNumberSideBarLabel.setText("state"+String.valueOf(state.number));
	armyNumberSideBarLabel.setText(String.valueOf(state.armynumber));
	stateNumberSideBarLabel.setVisible(true);
	armyNumberSideBarLabel.setVisible(true);
	addArmySideBarButton.setVisible(true);
	attackSideBarButton.setVisible(true);
	armyNumberToAddSideBarTextField.setVisible(true);
	adjacentStatesSideBarChoiceBox.setVisible(true);
	choose.setVisible(true);
	additionalarmy.setVisible(true);
}

public Label stringtolabel(String s) {
	
	if("state1".equals(s)) {
		return armyNumberLabelState1;
	}
	else if("state2".equals(s)) {
		return armyNumberLabelState2;
	}
	else if("state3".equals(s)) {
		return armyNumberLabelState3;
	}
	else if("state4".equals(s)) {
		return armyNumberLabelState4;
	}
	else if("state5".equals(s)) {
		return armyNumberLabelState5;
	}
	else if("state6".equals(s)) {
		return armyNumberLabelState6;
	}
	else if("state7".equals(s)) {
		return armyNumberLabelState7;
	}
	else if("state8".equals(s)) {
		return armyNumberLabelState8;
	}
	else if("state9".equals(s)) {
		return armyNumberLabelState9;
	}
	else if("state10".equals(s)) {
		return armyNumberLabelState10;
	}
	else if("state11".equals(s)) {
		return armyNumberLabelState11;
	}
	else if("state12".equals(s)) {
		return armyNumberLabelState12;
	}
	else if("state13".equals(s)) {
		return armyNumberLabelState13;
	}
	else if("state14".equals(s)) {
		return armyNumberLabelState14;
	}
	else if("state15".equals(s)) {
		return armyNumberLabelState15;
	}
	else if("state16".equals(s)) {
		return armyNumberLabelState16;
	}
	else if("state17".equals(s)) {
		return armyNumberLabelState17;
	}
	else if("state18".equals(s)) {
		return armyNumberLabelState18;
	}
	else if("state19".equals(s)) {
		return armyNumberLabelState19;
	}
	else if("state20".equals(s)) {
		return armyNumberLabelState20;
	}
	else if("state21".equals(s)) {
		return armyNumberLabelState21;
	}
	else if("state22".equals(s)) {
		return armyNumberLabelState22;
	}
	else if("state23".equals(s)) {
		return armyNumberLabelState23;
	}
	else if("state24".equals(s)) {
		return armyNumberLabelState24;
	}
	else if("state25".equals(s)) {
		return armyNumberLabelState25;
	}
	else if("state26".equals(s)) {
		return armyNumberLabelState26;
	}
	else{
		return armyNumberLabelState27;
	}
	
}

public ImageView stringtoimage(String s) {
	
	if("state1".equals(s)) {
		return redState1;
	}
	else if("state2".equals(s)) {
		return redState2;
	}
	else if("state3".equals(s)) {
		return redState3;
	}
	else if("state4".equals(s)) {
		return redState4;
	}
	else if("state5".equals(s)) {
		return redState5;
	}
	else if("state6".equals(s)) {
		return redState6;
	}
	else if("state7".equals(s)) {
		return redState7;
	}
	else if("state8".equals(s)) {
		return redState8;
	}
	else if("state9".equals(s)) {
		return redState9;
	}
	else if("state10".equals(s)) {
		return redState10;
	}
	else if("state11".equals(s)) {
		return redState11;
	}
	else if("state12".equals(s)) {
		return redState12;
	}
	else if("state13".equals(s)) {
		return redState13;
	}
	else if("state14".equals(s)) {
		return redState14;
	}
	else if("state15".equals(s)) {
		return redState15;
	}
	else if("state16".equals(s)) {
		return redState16;
	}
	else if("state17".equals(s)) {
		return redState17;
	}
	else if("state18".equals(s)) {
		return redState18;
	}
	else if("state19".equals(s)) {
		return redState19;
	}
	else if("state20".equals(s)) {
		return redState20;
	}
	else if("state21".equals(s)) {
		return redState21;
	}
	else if("state22".equals(s)) {
		return redState22;
	}
	else if("state23".equals(s)) {
		return redState23;
	}
	else if("state24".equals(s)) {
		return redState24;
	}
	else if("state25".equals(s)) {
		return redState25;
	}
	else if("state26".equals(s)) {
		return redState26;
	}
	else{
		return redState27;
	}
}

public ImageView enemystringtoimage(String s) {
	
	if("state1".equals(s)) {
		return greenState1;
	}
	else if("state2".equals(s)) {
		return greenState2;
	}
	else if("state3".equals(s)) {
		return greenState3;
	}
	else if("state4".equals(s)) {
		return greenState4;
	}
	else if("state5".equals(s)) {
		return greenState5;
	}
	else if("state6".equals(s)) {
		return greenState6;
	}
	else if("state7".equals(s)) {
		return greenState7;
	}
	else if("state8".equals(s)) {
		return greenState8;
	}
	else if("state9".equals(s)) {
		return greenState9;
	}
	else if("state10".equals(s)) {
		return greenState10;
	}
	else if("state11".equals(s)) {
		return greenState11;
	}
	else if("state12".equals(s)) {
		return redState12;
	}
	else if("state13".equals(s)) {
		return greenState13;
	}
	else if("state14".equals(s)) {
		return greenState14;
	}
	else if("state15".equals(s)) {
		return greenState15;
	}
	else if("state16".equals(s)) {
		return greenState16;
	}
	else if("state17".equals(s)) {
		return greenState17;
	}
	else if("state18".equals(s)) {
		return greenState18;
	}
	else if("state19".equals(s)) {
		return greenState19;
	}
	else if("state20".equals(s)) {
		return greenState20;
	}
	else if("state21".equals(s)) {
		return greenState21;
	}
	else if("state22".equals(s)) {
		return greenState22;
	}
	else if("state23".equals(s)) {
		return greenState23;
	}
	else if("state24".equals(s)) {
		return greenState24;
	}
	else if("state25".equals(s)) {
		return greenState25;
	}
	else if("state26".equals(s)) {
		return greenState26;
	}
	else{
		return greenState27;
	}
	
}

public void onStatePress(javafx.scene.input.MouseEvent event) {
	
	
	if(MainClass.player1Agent instanceof HumanAgent) {
	Polygon poly = (Polygon) event.getSource();
	String polyId = poly.getId();
	List<String> list = new ArrayList<String>();
	ObservableList<String>observableList = FXCollections.observableList(list);
	
	sideBar.setVisible(false);
	stateNumberSideBarLabel.setVisible(false);
	armyNumberSideBarLabel.setVisible(false);
	addArmySideBarButton.setVisible(false);
	attackSideBarButton.setVisible(false);
	armyNumberToAddSideBarTextField.setVisible(false);
	adjacentStatesSideBarChoiceBox.setVisible(false);
	
	observableList.removeAll();
	if("polyState1".equals(polyId)&&redState1.isVisible()==true) {
		if(state1.armynumber>1) {
			for(int i=0; i<state1.adjacentlist.size();i++) {
				if(state1.armynumber >= state1.adjacentlist.get(i).armynumber&&state1.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state1.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state1);
	}
	
	else if("polyState2".equals(polyId)&&redState2.isVisible()==true) {
		if(state2.armynumber>1) {
			for(int i=0; i<state2.adjacentlist.size();i++) {
				if(state2.armynumber >= state2.adjacentlist.get(i).armynumber&&state2.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state2.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state2);
	}
	else if("polyState3".equals(polyId)&&redState3.isVisible()==true) {
		if(state3.armynumber>1) {
			for(int i=0; i<state3.adjacentlist.size();i++) {
				if(state3.armynumber >= state3.adjacentlist.get(i).armynumber&&state3.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state3.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state3);
	}
	else if("polyState4".equals(polyId)&&redState4.isVisible()==true) {
		if(state4.armynumber>1) {
			for(int i=0; i<state4.adjacentlist.size();i++) {
				if(state4.armynumber >= state4.adjacentlist.get(i).armynumber&&state4.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state4.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state4);
	}
	else if("polyState5".equals(polyId)&&redState5.isVisible()==true) {
		if(state5.armynumber>1) {
			for(int i=0; i<state5.adjacentlist.size();i++) {
				if(state5.armynumber >= state5.adjacentlist.get(i).armynumber&&state5.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state5.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state5);
	}
	else if("polyState6".equals(polyId)&&redState6.isVisible()==true) {
		if(state6.armynumber>1) {
			for(int i=0; i<state6.adjacentlist.size();i++) {
				if(state6.armynumber >= state6.adjacentlist.get(i).armynumber&&state6.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state6.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state6);
	}
	else if("polyState7".equals(polyId)&&redState7.isVisible()==true) {
		if(state7.armynumber>1) {
			for(int i=0; i<state7.adjacentlist.size();i++) {
				if(state7.armynumber >= state7.adjacentlist.get(i).armynumber&&state7.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state7.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state7);
	}
	else if("polyState8".equals(polyId)&&redState8.isVisible()==true) {
		if(state8.armynumber>1) {
			for(int i=0; i<state8.adjacentlist.size();i++) {
				if(state8.armynumber >= state8.adjacentlist.get(i).armynumber&&state8.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state8.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state8);
	}
	else if("polyState9".equals(polyId)&&redState9.isVisible()==true) {
		if(state9.armynumber>1) {
			for(int i=0; i<state9.adjacentlist.size();i++) {
				if(state9.armynumber >= state9.adjacentlist.get(i).armynumber&&state9.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state9.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state9);
	}
	else if("polyState10".equals(polyId)&&redState10.isVisible()==true) {
		if(state10.armynumber>1) {
			for(int i=0; i<state10.adjacentlist.size();i++) {
				if(state10.armynumber >= state10.adjacentlist.get(i).armynumber&&state10.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state10.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state10);
	}
	else if("polyState11".equals(polyId)&&redState11.isVisible()==true) {
		if(state11.armynumber>1) {
			for(int i=0; i<state11.adjacentlist.size();i++) {
				if(state11.armynumber >= state11.adjacentlist.get(i).armynumber&&state11.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state11.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state11);
	}
	else if("polyState12".equals(polyId)&&redState12.isVisible()==true) {
		if(state12.armynumber>1) {
			for(int i=0; i<state12.adjacentlist.size();i++) {
				if(state12.armynumber >= state12.adjacentlist.get(i).armynumber&&state12.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state12.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state12);
	}
	else if("polyState13".equals(polyId)&&redState13.isVisible()==true) {
		if(state13.armynumber>1) {
			for(int i=0; i<state13.adjacentlist.size();i++) {
				if(state13.armynumber >= state13.adjacentlist.get(i).armynumber&&state13.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state13.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state13);
	}
	else if("polyState14".equals(polyId)&&redState14.isVisible()==true) {
		if(state14.armynumber>1) {
			for(int i=0; i<state14.adjacentlist.size();i++) {
				if(state14.armynumber >= state14.adjacentlist.get(i).armynumber&&state14.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state14.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state14);
	}
	else if("polyState15".equals(polyId)&&redState15.isVisible()==true) {
		if(state15.armynumber>1) {
			for(int i=0; i<state15.adjacentlist.size();i++) {
				if(state15.armynumber >= state15.adjacentlist.get(i).armynumber&&state15.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state15.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state15);
	}
	else if("polyState16".equals(polyId)&&redState16.isVisible()==true) {
		if(state16.armynumber>1) {
			for(int i=0; i<state16.adjacentlist.size();i++) {
				if(state16.armynumber >= state16.adjacentlist.get(i).armynumber&&state16.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state16.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state16);
	}
	else if("polyState17".equals(polyId)&&redState17.isVisible()==true) {
		if(state17.armynumber>1) {
			for(int i=0; i<state17.adjacentlist.size();i++) {
				if(state17.armynumber >= state17.adjacentlist.get(i).armynumber&&state17.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state17.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state17);
	}
	else if("polyState18".equals(polyId)&&redState18.isVisible()==true) {
		if(state18.armynumber>1) {
			for(int i=0; i<state18.adjacentlist.size();i++) {
				if(state18.armynumber >= state18.adjacentlist.get(i).armynumber&&state18.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state18.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state18);
	}
	else if("polyState19".equals(polyId)&&redState19.isVisible()==true) {
		if(state19.armynumber>1) {
			for(int i=0; i<state19.adjacentlist.size();i++) {
				if(state19.armynumber >= state19.adjacentlist.get(i).armynumber&&state19.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state19.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state19);
	}
	else if("polyState20".equals(polyId)&&redState20.isVisible()==true) {
		if(state20.armynumber>1) {
			for(int i=0; i<state20.adjacentlist.size();i++) {
				if(state20.armynumber >= state20.adjacentlist.get(i).armynumber&&state20.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state20.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state20);
	}
	else if("polyState21".equals(polyId)&&redState21.isVisible()==true) {
		if(state21.armynumber>1) {
			for(int i=0; i<state21.adjacentlist.size();i++) {
				if(state21.armynumber >= state21.adjacentlist.get(i).armynumber&&state21.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state21.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state21);
	}
	else if("polyState22".equals(polyId)&&redState22.isVisible()==true) {
		if(state22.armynumber>1) {
			for(int i=0; i<state22.adjacentlist.size();i++) {
				if(state22.armynumber >= state22.adjacentlist.get(i).armynumber&&state22.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state22.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state22);
	}
	else if("polyState23".equals(polyId)&&redState23.isVisible()==true) {
		if(state23.armynumber>1) {
			for(int i=0; i<state23.adjacentlist.size();i++) {
				if(state23.armynumber >= state23.adjacentlist.get(i).armynumber&&state23.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state23.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state23);
	}
	else if("polyState24".equals(polyId)&&redState24.isVisible()==true) {
		if(state24.armynumber>1) {
			for(int i=0; i<state24.adjacentlist.size();i++) {
				if(state24.armynumber >= state24.adjacentlist.get(i).armynumber&&state24.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state24.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state24);
	}
	else if("polyState25".equals(polyId)&&redState25.isVisible()==true) {
		if(state25.armynumber>1) {
			for(int i=0; i<state25.adjacentlist.size();i++) {
				if(state25.armynumber >= state25.adjacentlist.get(i).armynumber&&state25.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state25.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state25);
	}
	else if("polyState26".equals(polyId)&&redState26.isVisible()==true) {
		if(state26.armynumber>1) {
			for(int i=0; i<state26.adjacentlist.size();i++) {
				if(state26.armynumber >= state26.adjacentlist.get(i).armynumber&&state26.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state26.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state26);
	}
	else if(redState27.isVisible()==true){
		if(state27.armynumber>1) {
			for(int i=0; i<state27.adjacentlist.size();i++) {
				if(state27.armynumber >= state27.adjacentlist.get(i).armynumber&&state27.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state27.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state27);
	}
	
	adjacentStatesSideBarChoiceBox.setItems(observableList);
	
	}
	
}

public void onaddarmyclick(javafx.scene.input.MouseEvent event) {
	
	if(MainClass.player1Agent instanceof HumanAgent) {
	String statename = stateNumberSideBarLabel.getText();
	String addtionalarmynumber = armyNumberToAddSideBarTextField.getText();
	
	List<String> list = new ArrayList<String>();
	ObservableList<String>observableList = FXCollections.observableList(list);
	observableList.removeAll();
	if(Integer.parseInt(addtionalarmynumber)<=player1.additionalarmy) {
		if("state1".equals(statename)) {
			state1.armynumber = state1.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state1.armynumber));
			armyNumberLabelState1.setText(String.valueOf(state1.armynumber));
			for(int i=0; i<state1.adjacentlist.size();i++) {
				if(state1.armynumber >= state1.adjacentlist.get(i).armynumber&&state1.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state1.adjacentlist.get(i).number));
				}
			}
		}
		else if("state2".equals(statename)) {
			state2.armynumber = state2.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state2.armynumber));
			armyNumberLabelState2.setText(String.valueOf(state2.armynumber));
			for(int i=0; i<state2.adjacentlist.size();i++) {
				if(state2.armynumber >= state2.adjacentlist.get(i).armynumber&&state2.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state2.adjacentlist.get(i).number));
				}
			}
		}
		else if("state3".equals(statename)) {
			state3.armynumber = state3.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state3.armynumber));
			armyNumberLabelState3.setText(String.valueOf(state3.armynumber));
			for(int i=0; i<state3.adjacentlist.size();i++) {
				if(state3.armynumber >= state3.adjacentlist.get(i).armynumber&&state3.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state3.adjacentlist.get(i).number));
				}
			}
		}
		else if("state4".equals(statename)) {
			state4.armynumber = state4.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state4.armynumber));
			armyNumberLabelState4.setText(String.valueOf(state4.armynumber));
			for(int i=0; i<state4.adjacentlist.size();i++) {
				if(state4.armynumber >= state4.adjacentlist.get(i).armynumber&&state4.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state4.adjacentlist.get(i).number));
				}
			}
		}
		else if("state5".equals(statename)) {
			state5.armynumber = state5.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state5.armynumber));
			armyNumberLabelState5.setText(String.valueOf(state5.armynumber));
			for(int i=0; i<state5.adjacentlist.size();i++) {
				if(state5.armynumber >= state5.adjacentlist.get(i).armynumber&&state5.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state5.adjacentlist.get(i).number));
				}
			}
		}
		else if("state6".equals(statename)) {
			state6.armynumber = state6.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state6.armynumber));
			armyNumberLabelState6.setText(String.valueOf(state6.armynumber));
			for(int i=0; i<state6.adjacentlist.size();i++) {
				if(state6.armynumber >= state6.adjacentlist.get(i).armynumber&&state6.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state6.adjacentlist.get(i).number));
				}
			}
		}
		else if("state7".equals(statename)) {
			state7.armynumber = state7.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state7.armynumber));
			armyNumberLabelState7.setText(String.valueOf(state7.armynumber));
			for(int i=0; i<state7.adjacentlist.size();i++) {
				if(state7.armynumber >= state7.adjacentlist.get(i).armynumber&&state7.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state7.adjacentlist.get(i).number));
				}
			}
		}
		else if("state8".equals(statename)) {
			state8.armynumber = state8.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state8.armynumber));
			armyNumberLabelState8.setText(String.valueOf(state8.armynumber));
			for(int i=0; i<state8.adjacentlist.size();i++) {
				if(state8.armynumber >= state8.adjacentlist.get(i).armynumber&&state8.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state8.adjacentlist.get(i).number));
				}
			}
		}
		else if("state9".equals(statename)) {
			state9.armynumber = state9.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state9.armynumber));
			armyNumberLabelState9.setText(String.valueOf(state9.armynumber));
			for(int i=0; i<state9.adjacentlist.size();i++) {
				if(state9.armynumber >= state9.adjacentlist.get(i).armynumber&&state9.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state9.adjacentlist.get(i).number));
				}
			}
		}
		else if("state10".equals(statename)) {
			state10.armynumber = state10.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state10.armynumber));
			armyNumberLabelState10.setText(String.valueOf(state10.armynumber));
			for(int i=0; i<state10.adjacentlist.size();i++) {
				if(state10.armynumber >= state10.adjacentlist.get(i).armynumber&&state10.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state10.adjacentlist.get(i).number));
				}
			}
		}
		else if("state11".equals(statename)) {
			state11.armynumber = state11.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state11.armynumber));
			armyNumberLabelState11.setText(String.valueOf(state11.armynumber));
			for(int i=0; i<state11.adjacentlist.size();i++) {
				if(state11.armynumber >= state11.adjacentlist.get(i).armynumber&&state11.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state11.adjacentlist.get(i).number));
				}
			}
		}
		else if("state12".equals(statename)) {
			state12.armynumber = state12.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state12.armynumber));
			armyNumberLabelState12.setText(String.valueOf(state12.armynumber));
			for(int i=0; i<state12.adjacentlist.size();i++) {
				if(state12.armynumber >= state12.adjacentlist.get(i).armynumber&&state12.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state12.adjacentlist.get(i).number));
				}
			}
		}
		else if("state13".equals(statename)) {
			state13.armynumber = state13.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state13.armynumber));
			armyNumberLabelState13.setText(String.valueOf(state13.armynumber));
			for(int i=0; i<state13.adjacentlist.size();i++) {
				if(state13.armynumber >= state13.adjacentlist.get(i).armynumber&&state13.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state13.adjacentlist.get(i).number));
				}
			}
		}
		else if("state14".equals(statename)) {
			state14.armynumber = state14.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state14.armynumber));
			armyNumberLabelState14.setText(String.valueOf(state14.armynumber));
			for(int i=0; i<state14.adjacentlist.size();i++) {
				if(state14.armynumber >= state14.adjacentlist.get(i).armynumber&&state14.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state14.adjacentlist.get(i).number));
				}
			}
		}
		else if("state15".equals(statename)) {
			state15.armynumber = state15.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state15.armynumber));
			armyNumberLabelState15.setText(String.valueOf(state15.armynumber));
			for(int i=0; i<state15.adjacentlist.size();i++) {
				if(state15.armynumber >= state15.adjacentlist.get(i).armynumber&&state15.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state15.adjacentlist.get(i).number));
				}
			}
		}
		else if("state16".equals(statename)) {
			state16.armynumber = state16.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state16.armynumber));
			armyNumberLabelState16.setText(String.valueOf(state16.armynumber));
			for(int i=0; i<state16.adjacentlist.size();i++) {
				if(state16.armynumber >= state16.adjacentlist.get(i).armynumber&&state16.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state16.adjacentlist.get(i).number));
				}
			}
		}
		else if("state17".equals(statename)) {
			state17.armynumber = state17.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state17.armynumber));
			armyNumberLabelState17.setText(String.valueOf(state17.armynumber));
			for(int i=0; i<state17.adjacentlist.size();i++) {
				if(state17.armynumber >= state17.adjacentlist.get(i).armynumber&&state17.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state17.adjacentlist.get(i).number));
				}
			}
		}
		else if("state18".equals(statename)) {
			state18.armynumber = state18.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state18.armynumber));
			armyNumberLabelState18.setText(String.valueOf(state18.armynumber));
			for(int i=0; i<state18.adjacentlist.size();i++) {
				if(state18.armynumber >= state18.adjacentlist.get(i).armynumber&&state18.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state18.adjacentlist.get(i).number));
				}
			}
		}
		else if("state19".equals(statename)) {
			state19.armynumber = state19.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state19.armynumber));
			armyNumberLabelState19.setText(String.valueOf(state19.armynumber));
			for(int i=0; i<state19.adjacentlist.size();i++) {
				if(state19.armynumber >= state19.adjacentlist.get(i).armynumber&&state19.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state19.adjacentlist.get(i).number));
				}
			}
		}
		else if("state20".equals(statename)) {
			state20.armynumber = state20.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state20.armynumber));
			armyNumberLabelState20.setText(String.valueOf(state20.armynumber));
			for(int i=0; i<state20.adjacentlist.size();i++) {
				if(state20.armynumber >= state20.adjacentlist.get(i).armynumber&&state20.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state20.adjacentlist.get(i).number));
				}
			}
		}
		else if("state21".equals(statename)) {
			state21.armynumber = state21.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state21.armynumber));
			armyNumberLabelState21.setText(String.valueOf(state21.armynumber));
			for(int i=0; i<state21.adjacentlist.size();i++) {
				if(state21.armynumber >= state21.adjacentlist.get(i).armynumber&&state21.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state21.adjacentlist.get(i).number));
				}
			}
		}
		else if("state22".equals(statename)) {
			state22.armynumber = state22.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state22.armynumber));
			armyNumberLabelState22.setText(String.valueOf(state22.armynumber));
			for(int i=0; i<state22.adjacentlist.size();i++) {
				if(state22.armynumber >= state22.adjacentlist.get(i).armynumber&&state22.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state22.adjacentlist.get(i).number));
				}
			}
		}
		else if("state23".equals(statename)) {
			state23.armynumber = state23.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state23.armynumber));
			armyNumberLabelState23.setText(String.valueOf(state23.armynumber));
			for(int i=0; i<state23.adjacentlist.size();i++) {
				if(state23.armynumber >= state23.adjacentlist.get(i).armynumber&&state23.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state23.adjacentlist.get(i).number));
				}
			}
		}
		else if("state24".equals(statename)) {
			state24.armynumber = state24.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state24.armynumber));
			armyNumberLabelState24.setText(String.valueOf(state24.armynumber));
			for(int i=0; i<state24.adjacentlist.size();i++) {
				if(state24.armynumber >= state24.adjacentlist.get(i).armynumber&&state24.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state24.adjacentlist.get(i).number));
				}
			}
		}
		else if("state25".equals(statename)) {
			state25.armynumber = state25.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state25.armynumber));
			armyNumberLabelState25.setText(String.valueOf(state25.armynumber));
			for(int i=0; i<state25.adjacentlist.size();i++) {
				if(state25.armynumber >= state25.adjacentlist.get(i).armynumber&&state25.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state25.adjacentlist.get(i).number));
				}
			}
		}
		else if("state26".equals(statename)) {
			state26.armynumber = state26.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state26.armynumber));
			armyNumberLabelState26.setText(String.valueOf(state26.armynumber));
			for(int i=0; i<state26.adjacentlist.size();i++) {
				if(state26.armynumber >= state26.adjacentlist.get(i).armynumber&&state26.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state26.adjacentlist.get(i).number));
				}
			}
		}
		else {
			state27.armynumber = state27.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state27.armynumber));
			armyNumberLabelState27.setText(String.valueOf(state27.armynumber));
			for(int i=0; i<state27.adjacentlist.size();i++) {
				if(state27.armynumber >= state27.adjacentlist.get(i).armynumber&&state27.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state27.adjacentlist.get(i).number));
				}
			}
		}
		adjacentStatesSideBarChoiceBox.setItems(observableList);
		armyNumberToAddSideBarTextField.setText("0");
	}
	else {
		additionalarmy.setText("can't enter more than:  "+String.valueOf(player1.additionalarmy));
	}
	}
}

public void onattackarmyclick(javafx.scene.input.MouseEvent event) {
	
	if(MainClass.player1Agent instanceof HumanAgent) {
	String statename = stateNumberSideBarLabel.getText();
	String attackedstate = adjacentStatesSideBarChoiceBox.getSelectionModel().getSelectedItem().toString();
	Label attackedl = new Label();
	attackedl = stringtolabel(attackedstate);
	List<String> list = new ArrayList<String>();
	ObservableList<String>observableList = FXCollections.observableList(list);
	
	ImageView attackedimage = new ImageView();
	attackedimage = stringtoimage(attackedstate);
	
	ImageView enemyattackedimage = new ImageView();
	enemyattackedimage = enemystringtoimage(attackedstate);
	
	if("state1".equals(statename)) {
		for(int i=0;i<state1.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state1.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state1.adjacentlist.get(i).armynumber = state1.armynumber -1;
				state1.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state1.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state1.adjacentlist.get(i).armynumber));
			}
		}
		state1.armynumber = 1;
		armyNumberLabelState1.setText(String.valueOf(state1.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state1.armynumber));
	}
	else if("state2".equals(statename)) {
		for(int i=0;i<state2.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state2.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state2.adjacentlist.get(i).armynumber = state2.armynumber -1;
				state2.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state2.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state2.adjacentlist.get(i).armynumber));
			}
		}
		state2.armynumber = 1;
		armyNumberLabelState2.setText(String.valueOf(state2.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state2.armynumber));
	}
	else if("state3".equals(statename)) {
		for(int i=0;i<state3.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state3.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state3.adjacentlist.get(i).armynumber = state3.armynumber -1;
				state3.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state3.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state3.adjacentlist.get(i).armynumber));
			}
		}
		state3.armynumber = 1;
		armyNumberLabelState3.setText(String.valueOf(state3.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state3.armynumber));
	}
	else if("state4".equals(statename)) {
		for(int i=0;i<state4.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state4.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state4.adjacentlist.get(i).armynumber = state4.armynumber -1;
				state4.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state4.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state4.adjacentlist.get(i).armynumber));
			}
		}
		state4.armynumber = 1;
		armyNumberLabelState4.setText(String.valueOf(state4.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state4.armynumber));
	}
	else if("state5".equals(statename)) {
		for(int i=0;i<state5.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state5.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state5.adjacentlist.get(i).armynumber = state5.armynumber -1;
				state5.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state5.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state5.adjacentlist.get(i).armynumber));
			}
		}
		state5.armynumber = 1;
		armyNumberLabelState5.setText(String.valueOf(state5.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state5.armynumber));
	}
	else if("state6".equals(statename)) {
		for(int i=0;i<state6.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state6.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state6.adjacentlist.get(i).armynumber = state6.armynumber -1;
				state6.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state6.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state6.adjacentlist.get(i).armynumber));
			}
		}
		state6.armynumber = 1;
		armyNumberLabelState6.setText(String.valueOf(state6.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state6.armynumber));
	}
	else if("state7".equals(statename)) {
		for(int i=0;i<state7.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state7.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state7.adjacentlist.get(i).armynumber = state7.armynumber -1;
				state7.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state7.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state7.adjacentlist.get(i).armynumber));
			}
		}
		state7.armynumber = 1;
		armyNumberLabelState7.setText(String.valueOf(state7.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state7.armynumber));
	}
	else if("state8".equals(statename)) {
		for(int i=0;i<state8.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state8.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state8.adjacentlist.get(i).armynumber = state8.armynumber -1;
				state8.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state8.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state8.adjacentlist.get(i).armynumber));
			}
		}
		state8.armynumber = 1;
		armyNumberLabelState8.setText(String.valueOf(state8.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state8.armynumber));
	}
	else if("state9".equals(statename)) {
		for(int i=0;i<state9.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state9.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state9.adjacentlist.get(i).armynumber = state9.armynumber -1;
				state9.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state9.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state9.adjacentlist.get(i).armynumber));
			}
		}
		state9.armynumber = 1;
		armyNumberLabelState9.setText(String.valueOf(state9.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state9.armynumber));
	}
	else if("state10".equals(statename)) {
		for(int i=0;i<state10.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state10.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state10.adjacentlist.get(i).armynumber = state10.armynumber -1;
				state10.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state10.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state10.adjacentlist.get(i).armynumber));
			}
		}
		state10.armynumber = 1;
		armyNumberLabelState10.setText(String.valueOf(state10.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state10.armynumber));
	}
	else if("state11".equals(statename)) {
		for(int i=0;i<state11.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state11.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state11.adjacentlist.get(i).armynumber = state11.armynumber -1;
				state11.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state11.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state11.adjacentlist.get(i).armynumber));
			}
		}
		state11.armynumber = 1;
		armyNumberLabelState11.setText(String.valueOf(state11.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state11.armynumber));
	}
	else if("state12".equals(statename)) {
		for(int i=0;i<state12.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state12.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state12.adjacentlist.get(i).armynumber = state12.armynumber -1;
				state12.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state12.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state12.adjacentlist.get(i).armynumber));
			}
		}
		state12.armynumber = 1;
		armyNumberLabelState12.setText(String.valueOf(state12.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state12.armynumber));
	}
	else if("state13".equals(statename)) {
		for(int i=0;i<state13.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state13.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state13.adjacentlist.get(i).armynumber = state13.armynumber -1;
				state13.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state13.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state13.adjacentlist.get(i).armynumber));
			}
		}
		state13.armynumber = 1;
		armyNumberLabelState13.setText(String.valueOf(state13.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state13.armynumber));
	}
	else if("state14".equals(statename)) {
		for(int i=0;i<state14.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state14.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state14.adjacentlist.get(i).armynumber = state14.armynumber -1;
				state14.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state14.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state14.adjacentlist.get(i).armynumber));
			}
		}
		state14.armynumber = 1;
		armyNumberLabelState14.setText(String.valueOf(state14.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state14.armynumber));
	}
	else if("state15".equals(statename)) {
		for(int i=0;i<state15.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state15.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state15.adjacentlist.get(i).armynumber = state15.armynumber -1;
				state15.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state15.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state15.adjacentlist.get(i).armynumber));
			}
		}
		state15.armynumber = 1;
		armyNumberLabelState15.setText(String.valueOf(state15.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state15.armynumber));
	}
	else if("state16".equals(statename)) {
		for(int i=0;i<state16.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state16.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state16.adjacentlist.get(i).armynumber = state16.armynumber -1;
				state16.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state16.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state16.adjacentlist.get(i).armynumber));
			}
		}
		state16.armynumber = 1;
		armyNumberLabelState16.setText(String.valueOf(state16.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state16.armynumber));
	}
	else if("state17".equals(statename)) {
		for(int i=0;i<state17.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state17.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state17.adjacentlist.get(i).armynumber = state17.armynumber -1;
				state17.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state17.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state17.adjacentlist.get(i).armynumber));
			}
		}
		state17.armynumber = 1;
		armyNumberLabelState17.setText(String.valueOf(state17.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state17.armynumber));
	}
	else if("state18".equals(statename)) {
		for(int i=0;i<state18.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state18.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state18.adjacentlist.get(i).armynumber = state18.armynumber -1;
				state18.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state18.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state18.adjacentlist.get(i).armynumber));
			}
		}
		state18.armynumber = 1;
		armyNumberLabelState18.setText(String.valueOf(state18.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state18.armynumber));
	}
	else if("state19".equals(statename)) {
		for(int i=0;i<state19.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state19.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state19.adjacentlist.get(i).armynumber = state19.armynumber -1;
				state19.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state19.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state19.adjacentlist.get(i).armynumber));
			}
		}
		state19.armynumber = 1;
		armyNumberLabelState19.setText(String.valueOf(state19.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state19.armynumber));
	}
	else if("state20".equals(statename)) {
		for(int i=0;i<state20.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state20.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state20.adjacentlist.get(i).armynumber = state20.armynumber -1;
				state20.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state20.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state20.adjacentlist.get(i).armynumber));
			}
		}
		state20.armynumber = 1;
		armyNumberLabelState20.setText(String.valueOf(state20.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state20.armynumber));
	}
	else if("state21".equals(statename)) {
		for(int i=0;i<state21.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state21.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state21.adjacentlist.get(i).armynumber = state21.armynumber -1;
				state21.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state21.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state21.adjacentlist.get(i).armynumber));
			}
		}
		state21.armynumber = 1;
		armyNumberLabelState21.setText(String.valueOf(state21.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state21.armynumber));
	}
	else if("state22".equals(statename)) {
		for(int i=0;i<state22.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state22.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state22.adjacentlist.get(i).armynumber = state22.armynumber -1;
				state22.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state22.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state22.adjacentlist.get(i).armynumber));
			}
		}
		state22.armynumber = 1;
		armyNumberLabelState22.setText(String.valueOf(state22.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state22.armynumber));
	}
	else if("state23".equals(statename)) {
		for(int i=0;i<state23.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state23.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state23.adjacentlist.get(i).armynumber = state23.armynumber -1;
				state23.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state23.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state23.adjacentlist.get(i).armynumber));
			}
		}
		state23.armynumber = 1;
		armyNumberLabelState23.setText(String.valueOf(state23.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state23.armynumber));
	}
	else if("state24".equals(statename)) {
		for(int i=0;i<state24.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state24.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state24.adjacentlist.get(i).armynumber = state24.armynumber -1;
				state24.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state24.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state24.adjacentlist.get(i).armynumber));
			}
		}
		state24.armynumber = 1;
		armyNumberLabelState24.setText(String.valueOf(state24.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state24.armynumber));
	}
	else if("state25".equals(statename)) {
		for(int i=0;i<state25.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state25.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state25.adjacentlist.get(i).armynumber = state25.armynumber -1;
				state25.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state25.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state25.adjacentlist.get(i).armynumber));
			}
		}
		state25.armynumber = 1;
		armyNumberLabelState25.setText(String.valueOf(state25.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state25.armynumber));
	}
	else if("state26".equals(statename)) {
		for(int i=0;i<state26.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state26.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state26.adjacentlist.get(i).armynumber = state26.armynumber -1;
				state26.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state26.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state26.adjacentlist.get(i).armynumber));
			}
		}
		state26.armynumber = 1;
		armyNumberLabelState26.setText(String.valueOf(state26.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state26.armynumber));
	}
	else{
		for(int i=0;i<state27.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state27.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state27.adjacentlist.get(i).armynumber = state27.armynumber -1;
				state27.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state27.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state27.adjacentlist.get(i).armynumber));
			}
		}
		state27.armynumber = 1;
		armyNumberLabelState27.setText(String.valueOf(state27.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state27.armynumber));
	}
	player1.AdditionalArmyNumber(player1);
	additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
	observableList.removeAll();
	adjacentStatesSideBarChoiceBox.setItems(observableList);
	}
	
	int i=0;
	while(i<player1.teritorylist.size()) {
		update(player1.teritorylist.get(i).number,player1.teritorylist.get(i).armynumber,player1.teritorylist.get(i).color);
		i++;
	}
	i=0;
	while(i<player2.teritorylist.size()) {
		update(player2.teritorylist.get(i).number,player2.teritorylist.get(i).armynumber,player2.teritorylist.get(i).color);
		i++;
	}
	if(player2.teritorylist.size()==0) {
		System.out.println("gameover");
	}
	else {
		player2.agentType.PlayStyle(player2, player1);
		i=0;
		while(i<player1.teritorylist.size()) {
			update(player1.teritorylist.get(i).number,player1.teritorylist.get(i).armynumber,player1.teritorylist.get(i).color);
			i++;
		}
		i=0;
		while(i<player2.teritorylist.size()) {
			update(player2.teritorylist.get(i).number,player2.teritorylist.get(i).armynumber,player2.teritorylist.get(i).color);
			i++;
		}
	}
	
}
int x=1;
public void aiview(javafx.scene.input.MouseEvent event) {
	if(!(MainClass.player1Agent instanceof HumanAgent)) {
		int i=0;
		while(i<player1.teritorylist.size()) {
			update(player1.teritorylist.get(i).number,player1.teritorylist.get(i).armynumber,player1.teritorylist.get(i).color);
			i++;
		}
		i=0;
		while(i<player2.teritorylist.size()) {
			update(player2.teritorylist.get(i).number,player2.teritorylist.get(i).armynumber,player2.teritorylist.get(i).color);
			i++;
		}
		if(player2.teritorylist.size()==0) {
			if(player1.teritorylist.size()==27) {
				System.out.println("red player has won");
			}
			else {
				player1.agentType.PlayStyle(player1, player2);
				System.out.println("green player has no teritory");
			}
		
		}
		else if(player1.teritorylist.size()==0){
			if(player2.teritorylist.size()==27) {
				System.out.println("green player has won");
			}
			else {
				System.out.println("red player has no teritory");
				player2.agentType.PlayStyle(player2, player1);
			}
		}
		else if(x==1) {
			player1.agentType.PlayStyle(player1, player2);
			x=0;
		}
		else {
			player2.agentType.PlayStyle(player2, player1);
			x=1;
		}
			i=0;
			while(i<player1.teritorylist.size()) {
				update(player1.teritorylist.get(i).number,player1.teritorylist.get(i).armynumber,player1.teritorylist.get(i).color);
				i++;
			}
			i=0;
			while(i<player2.teritorylist.size()) {
				update(player2.teritorylist.get(i).number,player2.teritorylist.get(i).armynumber,player2.teritorylist.get(i).color);
				i++;
			}
		
		
	}
}

}
