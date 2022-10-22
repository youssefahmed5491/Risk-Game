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

public class AmericaLevelController {
	
	@FXML
	ImageView blueMap1;
	@FXML
	ImageView blueMap2;
	@FXML
	ImageView blueMap3;
	@FXML
	ImageView blueMap4;
	@FXML
	ImageView blueMap5;
	@FXML
	ImageView blueMap6;
	@FXML
	ImageView blueMap7;
	@FXML
	ImageView blueMap8;
	@FXML
	ImageView blueMap9;
	@FXML
	ImageView blueMap10;
	@FXML
	ImageView blueMap11;
	@FXML
	ImageView blueMap12;
	@FXML
	ImageView blueMap13;
	@FXML
	ImageView blueMap14;
	@FXML
	ImageView blueMap15;
	@FXML
	ImageView blueMap16;
	@FXML
	ImageView blueMap17;
	@FXML
	ImageView blueMap18;
	@FXML
	ImageView blueMap19;
	@FXML
	ImageView blueMap20;
	@FXML
	ImageView blueMap21;
	@FXML
	ImageView blueMap22;
	@FXML
	ImageView blueMap23;
	@FXML
	ImageView blueMap24;
	@FXML
	ImageView blueMap25;
	@FXML
	ImageView blueMap26;
	@FXML
	ImageView blueMap27;
	@FXML
	ImageView blueMap28;
	@FXML
	ImageView blueMap29;
	@FXML
	ImageView blueMap30;
	@FXML
	ImageView blueMap31;
	@FXML
	ImageView blueMap32;
	@FXML
	ImageView blueMap33;
	@FXML
	ImageView blueMap34;
	@FXML
	ImageView blueMap35;
	@FXML
	ImageView blueMap36;
	@FXML
	ImageView blueMap37;
	@FXML
	ImageView blueMap38;
	@FXML
	ImageView blueMap39;
	@FXML
	ImageView blueMap40;
	@FXML
	ImageView blueMap41;
	@FXML
	ImageView blueMap42;
	@FXML
	ImageView blueMap43;
	@FXML
	ImageView blueMap44;
	@FXML
	ImageView blueMap45;
	@FXML
	ImageView blueMap46;
	@FXML
	ImageView blueMap47;
	@FXML
	ImageView blueMap48;
	@FXML
	ImageView blueMap49;
	@FXML
	ImageView blueMap50;
	
	@FXML
	ImageView redMap1;
	@FXML
	ImageView redMap2;
	@FXML
	ImageView redMap3;
	@FXML
	ImageView redMap4;
	@FXML
	ImageView redMap5;
	@FXML
	ImageView redMap6;
	@FXML
	ImageView redMap7;
	@FXML
	ImageView redMap8;
	@FXML
	ImageView redMap9;
	@FXML
	ImageView redMap10;
	@FXML
	ImageView redMap11;
	@FXML
	ImageView redMap12;
	@FXML
	ImageView redMap13;
	@FXML
	ImageView redMap14;
	@FXML
	ImageView redMap15;
	@FXML
	ImageView redMap16;
	@FXML
	ImageView redMap17;
	@FXML
	ImageView redMap18;
	@FXML
	ImageView redMap19;
	@FXML
	ImageView redMap20;
	@FXML
	ImageView redMap21;
	@FXML
	ImageView redMap22;
	@FXML
	ImageView redMap23;
	@FXML
	ImageView redMap24;
	@FXML
	ImageView redMap25;
	@FXML
	ImageView redMap26;
	@FXML
	ImageView redMap27;
	@FXML
	ImageView redMap28;
	@FXML
	ImageView redMap29;
	@FXML
	ImageView redMap30;
	@FXML
	ImageView redMap31;
	@FXML
	ImageView redMap32;
	@FXML
	ImageView redMap33;
	@FXML
	ImageView redMap34;
	@FXML
	ImageView redMap35;
	@FXML
	ImageView redMap36;
	@FXML
	ImageView redMap37;
	@FXML
	ImageView redMap38;
	@FXML
	ImageView redMap39;
	@FXML
	ImageView redMap40;
	@FXML
	ImageView redMap41;
	@FXML
	ImageView redMap42;
	@FXML
	ImageView redMap43;
	@FXML
	ImageView redMap44;
	@FXML
	ImageView redMap45;
	@FXML
	ImageView redMap46;
	@FXML
	ImageView redMap47;
	@FXML
	ImageView redMap48;
	@FXML
	ImageView redMap49;
	@FXML
	ImageView redMap50;
	
	@FXML
	Label armyNumberLabel1;
	@FXML
	Label armyNumberLabel2;
	@FXML
	Label armyNumberLabel3;
	@FXML
	Label armyNumberLabel4;
	@FXML
	Label armyNumberLabel5;
	@FXML
	Label armyNumberLabel6;
	@FXML
	Label armyNumberLabel7;
	@FXML
	Label armyNumberLabel8;
	@FXML
	Label armyNumberLabel9;
	@FXML
	Label armyNumberLabel10;
	@FXML
	Label armyNumberLabel11;
	@FXML
	Label armyNumberLabel12;
	@FXML
	Label armyNumberLabel13;
	@FXML
	Label armyNumberLabel14;
	@FXML
	Label armyNumberLabel15;
	@FXML
	Label armyNumberLabel16;
	@FXML
	Label armyNumberLabel17;
	@FXML
	Label armyNumberLabel18;
	@FXML
	Label armyNumberLabel19;
	@FXML
	Label armyNumberLabel20;
	@FXML
	Label armyNumberLabel21;
	@FXML
	Label armyNumberLabel22;
	@FXML
	Label armyNumberLabel23;
	@FXML
	Label armyNumberLabel24;
	@FXML
	Label armyNumberLabel25;
	@FXML
	Label armyNumberLabel26;
	@FXML
	Label armyNumberLabel27;
	@FXML
	Label armyNumberLabel28;
	@FXML
	Label armyNumberLabel29;
	@FXML
	Label armyNumberLabel30;
	@FXML
	Label armyNumberLabel31;
	@FXML
	Label armyNumberLabel32;
	@FXML
	Label armyNumberLabel33;
	@FXML
	Label armyNumberLabel34;
	@FXML
	Label armyNumberLabel35;
	@FXML
	Label armyNumberLabel36;
	@FXML
	Label armyNumberLabel37;
	@FXML
	Label armyNumberLabel38;
	@FXML
	Label armyNumberLabel39;
	@FXML
	Label armyNumberLabel40;
	@FXML
	Label armyNumberLabel41;
	@FXML
	Label armyNumberLabel42;
	@FXML
	Label armyNumberLabel43;
	@FXML
	Label armyNumberLabel44;
	@FXML
	Label armyNumberLabel45;
	@FXML
	Label armyNumberLabel46;
	@FXML
	Label armyNumberLabel47;
	@FXML
	Label armyNumberLabel48;
	@FXML
	Label armyNumberLabel49;
	@FXML
	Label armyNumberLabel50;
	
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
	Polygon polyState28;
	@FXML
	Polygon polyState29;
	@FXML
	Polygon polyState30;
	@FXML
	Polygon polyState31;
	@FXML
	Polygon polyState32;
	@FXML
	Polygon polyState33;
	@FXML
	Polygon polyState34;
	@FXML
	Polygon polyState35;
	@FXML
	Polygon polyState36;
	@FXML
	Polygon polyState37;
	@FXML
	Polygon polyState38;
	@FXML
	Polygon polyState39;
	@FXML
	Polygon polyState40;
	@FXML
	Polygon polyState41;
	@FXML
	Polygon polyState42;
	@FXML
	Polygon polyState43;
	@FXML
	Polygon polyState44;
	@FXML
	Polygon polyState45;
	@FXML
	Polygon polyState46;
	@FXML
	Polygon polyState47;
	@FXML
	Polygon polyState48;
	@FXML
	Polygon polyState49;
	@FXML
	Polygon polyState50;
	
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
	State state28 = new State(28);
	State state29 = new State(29);
	State state30 = new State(30);
	State state31 = new State(31);
	State state32 = new State(32);
	State state33 = new State(33);
	State state34 = new State(34);
	State state35 = new State(35);
	State state36 = new State(36);
	State state37 = new State(37);
	State state38 = new State(39);
	State state39 = new State(39);
	State state40 = new State(40);
	State state41 = new State(41);
	State state42 = new State(42);
	State state43 = new State(43);
	State state44 = new State(44);
	State state45 = new State(45);
	State state46 = new State(46);
	State state47 = new State(47);
	State state48 = new State(48);
	State state49 = new State(49);
	State state50 = new State(50);
	
	public void stateStates() {

		ArrayList<State> adjacentlist1 = new ArrayList<State>();
		
		adjacentlist1.add(state2);
		adjacentlist1.add(state5);
		
		state1.setAdjacentlist(adjacentlist1);
		
		ArrayList<State> adjacentlist2 = new ArrayList<State>();
		
		adjacentlist2.add(state1);
		adjacentlist2.add(state3);
		adjacentlist2.add(state4);
		adjacentlist2.add(state5);
		
		state2.setAdjacentlist(adjacentlist2);
		
		ArrayList<State> adjacentlist3 = new ArrayList<State>();
		
		adjacentlist3.add(state2);
		adjacentlist3.add(state4);
		adjacentlist3.add(state9);
		
		state3.setAdjacentlist(adjacentlist3);

		ArrayList<State> adjacentlist4 = new ArrayList<State>();
		
		adjacentlist4.add(state2);
		adjacentlist4.add(state8);
		adjacentlist4.add(state3);
		adjacentlist4.add(state9);
		adjacentlist4.add(state5);
		
		state4.setAdjacentlist(adjacentlist4);
		
		ArrayList<State> adjacentlist5 = new ArrayList<State>();
		
		adjacentlist5.add(state4);
		adjacentlist5.add(state1);
		adjacentlist5.add(state2);
		adjacentlist5.add(state8);
		adjacentlist5.add(state6);
		adjacentlist5.add(state7);
		
		state5.setAdjacentlist(adjacentlist5);
		
		ArrayList<State> adjacentlist6 = new ArrayList<State>();
		
		adjacentlist6.add(state5);
		adjacentlist6.add(state7);
		adjacentlist6.add(state17);
		adjacentlist6.add(state16);
		
		state6.setAdjacentlist(adjacentlist6);
		
		ArrayList<State> adjacentlist7 = new ArrayList<State>();
		
		adjacentlist7.add(state5);
		adjacentlist7.add(state6);
		adjacentlist7.add(state16);
		adjacentlist7.add(state15);
		adjacentlist7.add(state10);
		adjacentlist7.add(state8);
		
		state7.setAdjacentlist(adjacentlist7);
		
		ArrayList<State> adjacentlist8 = new ArrayList<State>();
		
		adjacentlist8.add(state7);
		adjacentlist8.add(state5);
		adjacentlist8.add(state10);
		adjacentlist8.add(state9);
		adjacentlist8.add(state4);
		
		state8.setAdjacentlist(adjacentlist8);
		
		ArrayList<State> adjacentlist9 = new ArrayList<State>();
		
		adjacentlist9.add(state4);
		adjacentlist9.add(state3);
		adjacentlist9.add(state8);
		adjacentlist9.add(state11);
		
		state9.setAdjacentlist(adjacentlist9);
		
		ArrayList<State> adjacentlist10 = new ArrayList<State>();
		
		adjacentlist10.add(state8);
		adjacentlist10.add(state7);
		adjacentlist10.add(state15);
		adjacentlist10.add(state13);
		adjacentlist10.add(state11);
		adjacentlist10.add(state14);
		
		state10.setAdjacentlist(adjacentlist10);
		
		ArrayList<State> adjacentlist11 = new ArrayList<State>();
		
		adjacentlist11.add(state10);
		adjacentlist11.add(state9);
		adjacentlist11.add(state13);
		adjacentlist11.add(state12);
		
		state11.setAdjacentlist(adjacentlist11);
		
		ArrayList<State> adjacentlist12 = new ArrayList<State>();
		
		adjacentlist12.add(state21);
		adjacentlist12.add(state11);
		adjacentlist12.add(state22);
		adjacentlist12.add(state13);
		
		state12.setAdjacentlist(adjacentlist12);
		
		ArrayList<State> adjacentlist13 = new ArrayList<State>();
		
		adjacentlist13.add(state11);
		adjacentlist13.add(state10);
		adjacentlist13.add(state14);
		adjacentlist13.add(state12);
		adjacentlist13.add(state21);
		adjacentlist13.add(state20);
		
		state13.setAdjacentlist(adjacentlist13);
		
		ArrayList<State> adjacentlist14 = new ArrayList<State>();
		
		adjacentlist14.add(state13);
		adjacentlist14.add(state10);
		adjacentlist14.add(state15);
		adjacentlist14.add(state20);
		
		state14.setAdjacentlist(adjacentlist14);
		
		ArrayList<State> adjacentlist15 = new ArrayList<State>();
		
		adjacentlist15.add(state14);
		adjacentlist15.add(state19);
		adjacentlist15.add(state7);
		adjacentlist15.add(state16);
		adjacentlist15.add(state20);
		
		state15.setAdjacentlist(adjacentlist15);
		
		ArrayList<State> adjacentlist16 = new ArrayList<State>();
		
		adjacentlist16.add(state18);
		adjacentlist16.add(state17);
		adjacentlist16.add(state6);
		adjacentlist16.add(state15);
		adjacentlist16.add(state7);
		adjacentlist16.add(state19);
		
		state16.setAdjacentlist(adjacentlist16);

		ArrayList<State> adjacentlist17 = new ArrayList<State>();
		
		adjacentlist17.add(state16);
		adjacentlist17.add(state6);
		adjacentlist17.add(state18);
		
		state17.setAdjacentlist(adjacentlist17);
		
		ArrayList<State> adjacentlist18 = new ArrayList<State>();
		
		adjacentlist18.add(state16);
		adjacentlist18.add(state19);
		adjacentlist18.add(state34);
		adjacentlist18.add(state17);
		
		state18.setAdjacentlist(adjacentlist18);
		
		ArrayList<State> adjacentlist19 = new ArrayList<State>();
		
		adjacentlist19.add(state18);
		adjacentlist19.add(state15);
		adjacentlist19.add(state16);
		adjacentlist19.add(state33);
		adjacentlist19.add(state34);
		adjacentlist19.add(state20);
		
		state19.setAdjacentlist(adjacentlist19);
		
		ArrayList<State> adjacentlist20 = new ArrayList<State>();
		
		adjacentlist20.add(state14);
		adjacentlist20.add(state19);
		adjacentlist20.add(state21);
		adjacentlist20.add(state13);
		adjacentlist20.add(state15);
		adjacentlist20.add(state31);
		adjacentlist20.add(state32);
		adjacentlist20.add(state33);
		
		state20.setAdjacentlist(adjacentlist20);
		
		ArrayList<State> adjacentlist21 = new ArrayList<State>();
		
		adjacentlist21.add(state12);
		adjacentlist21.add(state13);
		adjacentlist21.add(state20);
		adjacentlist21.add(state22);
		adjacentlist21.add(state23);
		adjacentlist21.add(state31);
		
		state21.setAdjacentlist(adjacentlist21);
		
		ArrayList<State> adjacentlist22 = new ArrayList<State>();
		
		adjacentlist22.add(state12);
		adjacentlist22.add(state21);
		adjacentlist22.add(state23);
		
		state22.setAdjacentlist(adjacentlist22);
		
		ArrayList<State> adjacentlist23 = new ArrayList<State>();
		
		adjacentlist23.add(state31);
		adjacentlist23.add(state21);
		adjacentlist23.add(state22);
		adjacentlist23.add(state24);
		
		state23.setAdjacentlist(adjacentlist23);
		
		ArrayList<State> adjacentlist24 = new ArrayList<State>();
		
		adjacentlist24.add(state31);
		adjacentlist24.add(state26);
		adjacentlist24.add(state23);
		adjacentlist24.add(state25);
		
		state24.setAdjacentlist(adjacentlist24);
		
		ArrayList<State> adjacentlist25 = new ArrayList<State>();
		
		adjacentlist25.add(state24);
		adjacentlist25.add(state26);
		
		state25.setAdjacentlist(adjacentlist25);
		
		ArrayList<State> adjacentlist26 = new ArrayList<State>();
		
		adjacentlist26.add(state28);
		adjacentlist26.add(state24);
		adjacentlist26.add(state25);
		adjacentlist26.add(state27);
		adjacentlist26.add(state31);
		
		state26.setAdjacentlist(adjacentlist26);
		
		ArrayList<State> adjacentlist27 = new ArrayList<State>();
		
		adjacentlist27.add(state28);
		adjacentlist27.add(state26);
		
		state27.setAdjacentlist(adjacentlist27);
		
		ArrayList<State> adjacentlist28 = new ArrayList<State>();
		
		adjacentlist28.add(state27);
		adjacentlist28.add(state26);
		adjacentlist28.add(state31);
		adjacentlist28.add(state29);
		
		state28.setAdjacentlist(adjacentlist28);
		
		ArrayList<State> adjacentlist29 = new ArrayList<State>();
		
		adjacentlist29.add(state28);
		adjacentlist29.add(state31);
		adjacentlist29.add(state32);
		adjacentlist29.add(state30);
		adjacentlist29.add(state48);
		
		state29.setAdjacentlist(adjacentlist29);
		
		ArrayList<State> adjacentlist30 = new ArrayList<State>();
		
		adjacentlist30.add(state29);
		adjacentlist30.add(state32);
		adjacentlist30.add(state37);
		adjacentlist30.add(state38);
		adjacentlist30.add(state48);
		
		state30.setAdjacentlist(adjacentlist30);
		
		ArrayList<State> adjacentlist31 = new ArrayList<State>();
		
		adjacentlist31.add(state20);
		adjacentlist31.add(state21);
		adjacentlist31.add(state23);
		adjacentlist31.add(state24);
		adjacentlist31.add(state26);
		adjacentlist31.add(state28);
		adjacentlist31.add(state29);
		adjacentlist31.add(state32);
		
		state31.setAdjacentlist(adjacentlist31);
		
		ArrayList<State> adjacentlist32 = new ArrayList<State>();
		
		adjacentlist32.add(state31);
		adjacentlist32.add(state20);
		adjacentlist32.add(state33);
		adjacentlist32.add(state35);
		adjacentlist32.add(state37);
		adjacentlist32.add(state30);
		adjacentlist32.add(state29);
		
		state32.setAdjacentlist(adjacentlist32);
		
		ArrayList<State> adjacentlist33 = new ArrayList<State>();
		
		adjacentlist33.add(state20);
		adjacentlist33.add(state34);
		adjacentlist33.add(state19);
		adjacentlist33.add(state35);
		adjacentlist33.add(state32);
		
		state33.setAdjacentlist(adjacentlist33);
		
		ArrayList<State> adjacentlist34 = new ArrayList<State>();
		
		adjacentlist34.add(state18);
		adjacentlist34.add(state19);
		adjacentlist34.add(state33);
		
		state34.setAdjacentlist(adjacentlist34);
		
		ArrayList<State> adjacentlist35 = new ArrayList<State>();
		
		adjacentlist35.add(state33);
		adjacentlist35.add(state36);
		adjacentlist35.add(state37);
		adjacentlist35.add(state32);
		
		state35.setAdjacentlist(adjacentlist35);
		
		ArrayList<State> adjacentlist36 = new ArrayList<State>();
		
		adjacentlist36.add(state35);
		adjacentlist36.add(state37);
		
		state36.setAdjacentlist(adjacentlist36);
		
		ArrayList<State> adjacentlist37 = new ArrayList<State>();
		
		adjacentlist37.add(state36);
		adjacentlist37.add(state35);
		adjacentlist37.add(state32);
		adjacentlist37.add(state30);
		adjacentlist37.add(state38);
		
		state37.setAdjacentlist(adjacentlist37);
		
		ArrayList<State> adjacentlist38 = new ArrayList<State>();
		
		adjacentlist38.add(state37);
		adjacentlist38.add(state30);
		adjacentlist38.add(state48);
		adjacentlist38.add(state47);
		adjacentlist38.add(state46);
		adjacentlist38.add(state39);
		
		state38.setAdjacentlist(adjacentlist38);
		
		ArrayList<State> adjacentlist39 = new ArrayList<State>();
		
		adjacentlist39.add(state40);
		adjacentlist39.add(state46);
		adjacentlist39.add(state38);
		adjacentlist39.add(state43);
		adjacentlist39.add(state45);
		
		state39.setAdjacentlist(adjacentlist39);
		
		ArrayList<State> adjacentlist40 = new ArrayList<State>();
		
		adjacentlist40.add(state41);
		adjacentlist40.add(state43);
		adjacentlist40.add(state39);
		
		state40.setAdjacentlist(adjacentlist40);

		ArrayList<State> adjacentlist41 = new ArrayList<State>();
		
		adjacentlist41.add(state43);
		adjacentlist41.add(state42);
		adjacentlist41.add(state40);
		
		state41.setAdjacentlist(adjacentlist41);
		
		ArrayList<State> adjacentlist42 = new ArrayList<State>();
		
		adjacentlist42.add(state41);
		
		state42.setAdjacentlist(adjacentlist42);
		
		ArrayList<State> adjacentlist43 = new ArrayList<State>();
		
		adjacentlist43.add(state45);
		adjacentlist43.add(state44);
		adjacentlist43.add(state39);
		adjacentlist43.add(state41);
		adjacentlist43.add(state40);
		
		state43.setAdjacentlist(adjacentlist43);
		
		ArrayList<State> adjacentlist44 = new ArrayList<State>();
		
		adjacentlist44.add(state45);
		adjacentlist44.add(state43);
		
		state44.setAdjacentlist(adjacentlist44);
		
		ArrayList<State> adjacentlist45 = new ArrayList<State>();
		
		adjacentlist45.add(state43);
		adjacentlist45.add(state44);
		adjacentlist45.add(state39);
		adjacentlist45.add(state46);
		
		state45.setAdjacentlist(adjacentlist45);
		
		ArrayList<State> adjacentlist46 = new ArrayList<State>();
		
		adjacentlist46.add(state45);
		adjacentlist46.add(state39);
		adjacentlist46.add(state38);
		adjacentlist46.add(state47);
		
		state46.setAdjacentlist(adjacentlist46);
		
		ArrayList<State> adjacentlist47 = new ArrayList<State>();
		
		adjacentlist47.add(state46);
		adjacentlist47.add(state48);
		adjacentlist47.add(state38);
		
		state47.setAdjacentlist(adjacentlist47);
		
		ArrayList<State> adjacentlist48 = new ArrayList<State>();
		
		adjacentlist48.add(state47);
		adjacentlist48.add(state38);
		adjacentlist48.add(state30);
		adjacentlist48.add(state29);
		
		state4.setAdjacentlist(adjacentlist4);
		
		ArrayList<State> adjacentlist49 = new ArrayList<State>();
		
		state49.setAdjacentlist(adjacentlist49);
		
		ArrayList<State> adjacentlist50 = new ArrayList<State>();
		
		state50.setAdjacentlist(adjacentlist50);

	}

	Player1 player1 = Player1.getPlayer();
	Player2 player2 = Player2.getPlayer();

	public void initialize() {
		stateStates();
		redMap1.setVisible(true);
		player1.teritorylist.add(state1);
		armyNumberLabel1.setText("5");
		state1.armynumber=5;
		state1.color=1;
		blueMap27.setVisible(true);
		player2.teritorylist.add(state27);
		armyNumberLabel27.setText("5");
		state27.armynumber=5;
		state27.color=2;
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
		armyNumberLabel1.setText(String.valueOf(state1.armynumber));
		if(state1.color==1) {
			redMap1.setVisible(true);
			blueMap1.setVisible(false);
		}
		else if(state1.color==2) {
			blueMap1.setVisible(true);
			redMap1.setVisible(false);
		}
	}
	else if(statenumber == 2) {
		state2.armynumber = newarmynumber;
		state2.color = color;
		armyNumberLabel2.setText(String.valueOf(state2.armynumber));
		if(state2.color==1) {
			redMap2.setVisible(true);
			blueMap2.setVisible(false);
		}
		else if(state2.color==2) {
			blueMap2.setVisible(true);
			redMap2.setVisible(false);
		}
	}
	else if(statenumber == 3) {
		state3.armynumber = newarmynumber;
		state3.color = color;
		armyNumberLabel3.setText(String.valueOf(state3.armynumber));
		if(state3.color==1) {
			redMap3.setVisible(true);
			blueMap3.setVisible(false);
		}
		else if(state3.color==2) {
			blueMap3.setVisible(true);
			redMap3.setVisible(false);
		}
	}
	else if(statenumber == 4) {
		state4.armynumber = newarmynumber;
		state4.color = color;
		armyNumberLabel4.setText(String.valueOf(state4.armynumber));
		if(state4.color==1) {
			redMap4.setVisible(true);
			blueMap4.setVisible(false);
		}
		else if(state4.color==2) {
			blueMap4.setVisible(true);
			redMap4.setVisible(false);
		}
	}
	else if(statenumber == 5) {
		state5.armynumber = newarmynumber;
		state5.color = color;
		armyNumberLabel5.setText(String.valueOf(state5.armynumber));
		if(state5.color==1) {
			redMap5.setVisible(true);
			blueMap5.setVisible(false);
		}
		else if(state5.color==2) {
			blueMap5.setVisible(true);
			redMap5.setVisible(false);
		}
	}
	else if(statenumber == 6) {
		state6.armynumber = newarmynumber;
		state6.color = color;
		armyNumberLabel6.setText(String.valueOf(state6.armynumber));
		if(state6.color==1) {
			redMap6.setVisible(true);
			blueMap6.setVisible(false);
		}
		else if(state6.color==2) {
			blueMap6.setVisible(true);
			redMap6.setVisible(false);
		}
	}
	else if(statenumber == 7) {
		state7.armynumber = newarmynumber;
		state7.color = color;
		armyNumberLabel7.setText(String.valueOf(state7.armynumber));
		if(state7.color==1) {
			redMap7.setVisible(true);
			blueMap7.setVisible(false);
		}
		else if(state7.color==2) {
			blueMap7.setVisible(true);
			redMap7.setVisible(false);
		}
	}
	else if(statenumber == 8) {
		state8.armynumber = newarmynumber;
		state8.color = color;
		armyNumberLabel8.setText(String.valueOf(state8.armynumber));
		if(state8.color==1) {
			redMap8.setVisible(true);
			blueMap8.setVisible(false);
		}
		else if(state8.color==2) {
			blueMap8.setVisible(true);
			redMap8.setVisible(false);
		}
	}
	else if(statenumber == 9) {
		state9.armynumber = newarmynumber;
		state9.color = color;
		armyNumberLabel9.setText(String.valueOf(state9.armynumber));
		if(state9.color==1) {
			redMap9.setVisible(true);
			blueMap9.setVisible(false);
		}
		else if(state9.color==2) {
			blueMap9.setVisible(true);
			redMap9.setVisible(false);
		}
	}
	else if(statenumber == 10) {
		state10.armynumber = newarmynumber;
		state10.color = color;
		armyNumberLabel10.setText(String.valueOf(state10.armynumber));
		if(state10.color==1) {
			redMap10.setVisible(true);
			blueMap10.setVisible(false);
		}
		else if(state10.color==2) {
			blueMap10.setVisible(true);
			redMap10.setVisible(false);
		}
	}
	else if(statenumber == 11) {
		state11.armynumber = newarmynumber;
		state11.color = color;
		armyNumberLabel11.setText(String.valueOf(state11.armynumber));
		if(state11.color==1) {
			redMap11.setVisible(true);
			blueMap11.setVisible(false);
		}
		else if(state11.color==2) {
			blueMap11.setVisible(true);
			redMap11.setVisible(false);
		}
	}
	else if(statenumber == 12) {
		state12.armynumber = newarmynumber;
		state12.color = color;
		armyNumberLabel12.setText(String.valueOf(state12.armynumber));
		if(state12.color==1) {
			redMap12.setVisible(true);
			blueMap12.setVisible(false);
		}
		else if(state12.color==2) {
			blueMap12.setVisible(true);
			redMap12.setVisible(false);
		}
	}
	else if(statenumber == 13) {
		state13.armynumber = newarmynumber;
		state13.color = color;
		armyNumberLabel13.setText(String.valueOf(state13.armynumber));
		if(state13.color==1) {
			redMap13.setVisible(true);
			blueMap13.setVisible(false);
		}
		else if(state13.color==2) {
			blueMap13.setVisible(true);
			redMap13.setVisible(false);
		}
	}
	else if(statenumber == 14) {
		state14.armynumber = newarmynumber;
		state14.color = color;
		armyNumberLabel14.setText(String.valueOf(state14.armynumber));
		if(state14.color==1) {
			redMap14.setVisible(true);
			blueMap14.setVisible(false);
		}
		else if(state14.color==2) {
			blueMap14.setVisible(true);
			redMap14.setVisible(false);
		}
	}
	else if(statenumber == 15) {
		state15.armynumber = newarmynumber;
		state15.color = color;
		armyNumberLabel15.setText(String.valueOf(state15.armynumber));
		if(state15.color==1) {
			redMap15.setVisible(true);
			blueMap15.setVisible(false);
		}
		else if(state15.color==2) {
			blueMap15.setVisible(true);
			redMap15.setVisible(false);
		}
	}
	else if(statenumber == 16) {
		state16.armynumber = newarmynumber;
		state16.color = color;
		armyNumberLabel16.setText(String.valueOf(state16.armynumber));
		if(state16.color==1) {
			redMap16.setVisible(true);
			blueMap16.setVisible(false);
		}
		else if(state16.color==2) {
			blueMap16.setVisible(true);
			redMap16.setVisible(false);
		}
	}
	else if(statenumber == 17) {
		state17.armynumber = newarmynumber;
		state17.color = color;
		armyNumberLabel17.setText(String.valueOf(state17.armynumber));
		if(state17.color==1) {
			redMap17.setVisible(true);
			blueMap17.setVisible(false);
		}
		else if(state17.color==2) {
			blueMap17.setVisible(true);
			redMap17.setVisible(false);
		}
	}
	else if(statenumber == 18) {
		state18.armynumber = newarmynumber;
		state18.color = color;
		armyNumberLabel18.setText(String.valueOf(state18.armynumber));
		if(state18.color==1) {
			redMap18.setVisible(true);
			blueMap18.setVisible(false);
		}
		else if(state18.color==2) {
			blueMap18.setVisible(true);
			redMap18.setVisible(false);
		}
	}
	else if(statenumber == 19) {
		state19.armynumber = newarmynumber;
		state19.color = color;
		armyNumberLabel19.setText(String.valueOf(state19.armynumber));
		if(state19.color==1) {
			redMap19.setVisible(true);
			blueMap19.setVisible(false);
		}
		else if(state19.color==2) {
			blueMap19.setVisible(true);
			redMap19.setVisible(false);
		}
	}
	else if(statenumber == 20) {
		state20.armynumber = newarmynumber;
		state20.color = color;
		armyNumberLabel20.setText(String.valueOf(state20.armynumber));
		if(state20.color==1) {
			redMap20.setVisible(true);
			blueMap20.setVisible(false);
		}
		else if(state20.color==2) {
			blueMap20.setVisible(true);
			redMap20.setVisible(false);
		}
	}
	else if(statenumber == 21) {
		state21.armynumber = newarmynumber;
		state21.color = color;
		armyNumberLabel21.setText(String.valueOf(state21.armynumber));
		if(state21.color==1) {
			redMap21.setVisible(true);
			blueMap21.setVisible(false);
		}
		else if(state21.color==2) {
			blueMap21.setVisible(true);
			redMap21.setVisible(false);
		}
	}
	else if(statenumber == 22) {
		state22.armynumber = newarmynumber;
		state22.color = color;
		armyNumberLabel22.setText(String.valueOf(state22.armynumber));
		if(state22.color==1) {
			redMap22.setVisible(true);
			blueMap22.setVisible(false);
		}
		else if(state22.color==2) {
			blueMap22.setVisible(true);
			redMap22.setVisible(false);
		}
	}
	else if(statenumber == 23) {
		state23.armynumber = newarmynumber;
		state23.color = color;
		armyNumberLabel23.setText(String.valueOf(state23.armynumber));
		if(state23.color==1) {
			redMap23.setVisible(true);
			blueMap23.setVisible(false);
		}
		else if(state23.color==2) {
			blueMap23.setVisible(true);
			redMap23.setVisible(false);
		}
	}
	else if(statenumber == 24) {
		state24.armynumber = newarmynumber;
		state24.color = color;
		armyNumberLabel24.setText(String.valueOf(state24.armynumber));
		if(state24.color==1) {
			redMap24.setVisible(true);
			blueMap24.setVisible(false);
		}
		else if(state24.color==2) {
			blueMap24.setVisible(true);
			redMap24.setVisible(false);
		}
	}
	else if(statenumber == 25) {
		state25.armynumber = newarmynumber;
		state25.color = color;
		armyNumberLabel25.setText(String.valueOf(state25.armynumber));
		if(state25.color==1) {
			redMap25.setVisible(true);
			blueMap25.setVisible(false);
		}
		else if(state25.color==2) {
			blueMap25.setVisible(true);
			redMap25.setVisible(false);
		}
	}
	else if(statenumber == 26) {
		state26.armynumber = newarmynumber;
		state26.color = color;
		armyNumberLabel26.setText(String.valueOf(state26.armynumber));
		if(state26.color==1) {
			redMap26.setVisible(true);
			blueMap26.setVisible(false);
		}
		else if(state26.color==2) {
			blueMap26.setVisible(true);
			redMap26.setVisible(false);
		}
	}
	else if(statenumber == 27){
		state27.armynumber = newarmynumber;
		state27.color = color;
		armyNumberLabel27.setText(String.valueOf(state27.armynumber));
		if(state27.color==1) {
			redMap27.setVisible(true);
			blueMap27.setVisible(false);
		}
		else if(state27.color==2) {
			blueMap27.setVisible(true);
			redMap27.setVisible(false);
		}
	}
	else if(statenumber == 28){
		state28.armynumber = newarmynumber;
		state28.color = color;
		armyNumberLabel28.setText(String.valueOf(state28.armynumber));
		if(state28.color==1) {
			redMap28.setVisible(true);
			blueMap28.setVisible(false);
		}
		else if(state28.color==2) {
			blueMap28.setVisible(true);
			redMap28.setVisible(false);
		}
	}
	else if(statenumber == 29){
		state29.armynumber = newarmynumber;
		state29.color = color;
		armyNumberLabel29.setText(String.valueOf(state29.armynumber));
		if(state29.color==1) {
			redMap29.setVisible(true);
			blueMap29.setVisible(false);
		}
		else if(state29.color==2) {
			blueMap29.setVisible(true);
			redMap29.setVisible(false);
		}
	}
	else if(statenumber == 30) {
		state30.armynumber = newarmynumber;
		state30.color = color;
		armyNumberLabel30.setText(String.valueOf(state30.armynumber));
		if(state30.color==1) {
			redMap30.setVisible(true);
			blueMap30.setVisible(false);
		}
		else if(state30.color==2) {
			blueMap30.setVisible(true);
			redMap30.setVisible(false);
		}
	}
	else if(statenumber == 31) {
		state31.armynumber = newarmynumber;
		state31.color = color;
		armyNumberLabel31.setText(String.valueOf(state31.armynumber));
		if(state31.color==1) {
			redMap31.setVisible(true);
			blueMap31.setVisible(false);
		}
		else if(state31.color==2) {
			blueMap31.setVisible(true);
			redMap31.setVisible(false);
		}
	}
	else if(statenumber == 32) {
		state32.armynumber = newarmynumber;
		state32.color = color;
		armyNumberLabel32.setText(String.valueOf(state32.armynumber));
		if(state32.color==1) {
			redMap32.setVisible(true);
			blueMap32.setVisible(false);
		}
		else if(state32.color==2) {
			blueMap32.setVisible(true);
			redMap32.setVisible(false);
		}
	}
	else if(statenumber == 33) {
		state33.armynumber = newarmynumber;
		state33.color = color;
		armyNumberLabel33.setText(String.valueOf(state33.armynumber));
		if(state33.color==1) {
			redMap33.setVisible(true);
			blueMap33.setVisible(false);
		}
		else if(state33.color==2) {
			blueMap33.setVisible(true);
			redMap33.setVisible(false);
		}
	}
	else if(statenumber == 34) {
		state34.armynumber = newarmynumber;
		state34.color = color;
		armyNumberLabel34.setText(String.valueOf(state34.armynumber));
		if(state34.color==1) {
			redMap34.setVisible(true);
			blueMap34.setVisible(false);
		}
		else if(state34.color==2) {
			blueMap34.setVisible(true);
			redMap34.setVisible(false);
		}
	}
	else if(statenumber == 35) {
		state35.armynumber = newarmynumber;
		state35.color = color;
		armyNumberLabel35.setText(String.valueOf(state35.armynumber));
		if(state35.color==1) {
			redMap35.setVisible(true);
			blueMap35.setVisible(false);
		}
		else if(state35.color==2) {
			blueMap35.setVisible(true);
			redMap35.setVisible(false);
		}
	}
	else if(statenumber == 36) {
		state36.armynumber = newarmynumber;
		state36.color = color;
		armyNumberLabel36.setText(String.valueOf(state36.armynumber));
		if(state36.color==1) {
			redMap36.setVisible(true);
			blueMap36.setVisible(false);
		}
		else if(state36.color==2) {
			blueMap36.setVisible(true);
			redMap36.setVisible(false);
		}
	}
	else if(statenumber == 37) {
		state37.armynumber = newarmynumber;
		state37.color = color;
		armyNumberLabel37.setText(String.valueOf(state37.armynumber));
		if(state37.color==1) {
			redMap37.setVisible(true);
			blueMap37.setVisible(false);
		}
		else if(state37.color==2) {
			blueMap37.setVisible(true);
			redMap37.setVisible(false);
		}
	}
	else if(statenumber == 38) {
		state38.armynumber = newarmynumber;
		state38.color = color;
		armyNumberLabel38.setText(String.valueOf(state38.armynumber));
		if(state38.color==1) {
			redMap38.setVisible(true);
			blueMap38.setVisible(false);
		}
		else if(state38.color==2) {
			blueMap38.setVisible(true);
			redMap38.setVisible(false);
		}
	}
	else if(statenumber == 39) {
		state39.armynumber = newarmynumber;
		state39.color = color;
		armyNumberLabel39.setText(String.valueOf(state39.armynumber));
		if(state39.color==1) {
			redMap39.setVisible(true);
			blueMap39.setVisible(false);
		}
		else if(state39.color==2) {
			blueMap39.setVisible(true);
			redMap39.setVisible(false);
		}
	}
	else if(statenumber == 40) {
		state40.armynumber = newarmynumber;
		state40.color = color;
		armyNumberLabel40.setText(String.valueOf(state40.armynumber));
		if(state40.color==1) {
			redMap40.setVisible(true);
			blueMap40.setVisible(false);
		}
		else if(state40.color==2) {
			blueMap40.setVisible(true);
			redMap40.setVisible(false);
		}
	}
	else if(statenumber == 41) {
		state41.armynumber = newarmynumber;
		state41.color = color;
		armyNumberLabel41.setText(String.valueOf(state41.armynumber));
		if(state41.color==1) {
			redMap41.setVisible(true);
			blueMap41.setVisible(false);
		}
		else if(state41.color==2) {
			blueMap41.setVisible(true);
			redMap41.setVisible(false);
		}
	}
	else if(statenumber == 42) {
		state42.armynumber = newarmynumber;
		state42.color = color;
		armyNumberLabel42.setText(String.valueOf(state42.armynumber));
		if(state42.color==1) {
			redMap42.setVisible(true);
			blueMap42.setVisible(false);
		}
		else if(state42.color==2) {
			blueMap42.setVisible(true);
			redMap42.setVisible(false);
		}
	}
	else if(statenumber == 43) {
		state43.armynumber = newarmynumber;
		state43.color = color;
		armyNumberLabel43.setText(String.valueOf(state43.armynumber));
		if(state43.color==1) {
			redMap43.setVisible(true);
			blueMap43.setVisible(false);
		}
		else if(state43.color==2) {
			blueMap43.setVisible(true);
			redMap43.setVisible(false);
		}
	}
	else if(statenumber == 44) {
		state44.armynumber = newarmynumber;
		state44.color = color;
		armyNumberLabel44.setText(String.valueOf(state44.armynumber));
		if(state44.color==1) {
			redMap44.setVisible(true);
			blueMap44.setVisible(false);
		}
		else if(state44.color==2) {
			blueMap44.setVisible(true);
			redMap44.setVisible(false);
		}
	}
	else if(statenumber == 45) {
		state45.armynumber = newarmynumber;
		state45.color = color;
		armyNumberLabel45.setText(String.valueOf(state45.armynumber));
		if(state45.color==1) {
			redMap45.setVisible(true);
			blueMap45.setVisible(false);
		}
		else if(state45.color==2) {
			blueMap45.setVisible(true);
			redMap45.setVisible(false);
		}
	}
	else if(statenumber == 46) {
		state46.armynumber = newarmynumber;
		state46.color = color;
		armyNumberLabel46.setText(String.valueOf(state46.armynumber));
		if(state46.color==1) {
			redMap46.setVisible(true);
			blueMap46.setVisible(false);
		}
		else if(state46.color==2) {
			blueMap46.setVisible(true);
			redMap46.setVisible(false);
		}
	}
	else if(statenumber == 47) {
		state47.armynumber = newarmynumber;
		state47.color = color;
		armyNumberLabel47.setText(String.valueOf(state47.armynumber));
		if(state47.color==1) {
			redMap47.setVisible(true);
			blueMap47.setVisible(false);
		}
		else if(state47.color==2) {
			blueMap47.setVisible(true);
			redMap47.setVisible(false);
		}
	}
	else if(statenumber == 48) {
		state48.armynumber = newarmynumber;
		state48.color = color;
		armyNumberLabel48.setText(String.valueOf(state48.armynumber));
		if(state48.color==1) {
			redMap48.setVisible(true);
			blueMap48.setVisible(false);
		}
		else if(state48.color==2) {
			blueMap48.setVisible(true);
			redMap48.setVisible(false);
		}
	}
	else if(statenumber == 49) {
		state49.armynumber = newarmynumber;
		state49.color = color;
		armyNumberLabel49.setText(String.valueOf(state49.armynumber));
		if(state49.color==1) {
			redMap49.setVisible(true);
			blueMap49.setVisible(false);
		}
		else if(state49.color==2) {
			blueMap49.setVisible(true);
			redMap49.setVisible(false);
		}
	}
	else {
		state50.armynumber = newarmynumber;
		state50.color = color;
		armyNumberLabel50.setText(String.valueOf(state50.armynumber));
		if(state50.color==1) {
			redMap50.setVisible(true);
			blueMap50.setVisible(false);
		}
		else if(state50.color==2) {
			blueMap50.setVisible(true);
			redMap50.setVisible(false);
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
		return armyNumberLabel1;
	}
	else if("state2".equals(s)) {
		return armyNumberLabel2;
	}
	else if("state3".equals(s)) {
		return armyNumberLabel3;
	}
	else if("state4".equals(s)) {
		return armyNumberLabel4;
	}
	else if("state5".equals(s)) {
		return armyNumberLabel5;
	}
	else if("state6".equals(s)) {
		return armyNumberLabel6;
	}
	else if("state7".equals(s)) {
		return armyNumberLabel7;
	}
	else if("state8".equals(s)) {
		return armyNumberLabel8;
	}
	else if("state9".equals(s)) {
		return armyNumberLabel9;
	}
	else if("state10".equals(s)) {
		return armyNumberLabel10;
	}
	else if("state11".equals(s)) {
		return armyNumberLabel11;
	}
	else if("state12".equals(s)) {
		return armyNumberLabel12;
	}
	else if("state13".equals(s)) {
		return armyNumberLabel13;
	}
	else if("state14".equals(s)) {
		return armyNumberLabel14;
	}
	else if("state15".equals(s)) {
		return armyNumberLabel15;
	}
	else if("state16".equals(s)) {
		return armyNumberLabel16;
	}
	else if("state17".equals(s)) {
		return armyNumberLabel17;
	}
	else if("state18".equals(s)) {
		return armyNumberLabel18;
	}
	else if("state19".equals(s)) {
		return armyNumberLabel19;
	}
	else if("state20".equals(s)) {
		return armyNumberLabel20;
	}
	else if("state21".equals(s)) {
		return armyNumberLabel21;
	}
	else if("state22".equals(s)) {
		return armyNumberLabel22;
	}
	else if("state23".equals(s)) {
		return armyNumberLabel23;
	}
	else if("state24".equals(s)) {
		return armyNumberLabel24;
	}
	else if("state25".equals(s)) {
		return armyNumberLabel25;
	}
	else if("state26".equals(s)) {
		return armyNumberLabel26;
	}
	else if("state27".equals(s)){
		return armyNumberLabel27;
	}
	else if("state28".equals(s)) {
		return armyNumberLabel28;
	}
	else if("state29".equals(s)) {
		return armyNumberLabel29;
	}
	else if("state30".equals(s)) {
		return armyNumberLabel30;
	}
	else if("state31".equals(s)) {
		return armyNumberLabel31;
	}
	else if("state32".equals(s)) {
		return armyNumberLabel32;
	}
	else if("state33".equals(s)) {
		return armyNumberLabel33;
	}
	else if("state34".equals(s)) {
		return armyNumberLabel34;
	}
	else if("state35".equals(s)) {
		return armyNumberLabel35;
	}
	else if("state36".equals(s)) {
		return armyNumberLabel36;
	}
	else if("state37".equals(s)) {
		return armyNumberLabel37;
	}
	else if("state38".equals(s)) {
		return armyNumberLabel38;
	}
	else if("state39".equals(s)) {
		return armyNumberLabel39;
	}
	else if("state40".equals(s)) {
		return armyNumberLabel40;
	}
	else if("state41".equals(s)) {
		return armyNumberLabel41;
	}
	else if("state42".equals(s)) {
		return armyNumberLabel42;
	}
	else if("state43".equals(s)) {
		return armyNumberLabel43;
	}
	else if("state44".equals(s)) {
		return armyNumberLabel44;
	}
	else if("state45".equals(s)) {
		return armyNumberLabel45;
	}
	else if("state46".equals(s)) {
		return armyNumberLabel46;
	}
	else if("state47".equals(s)) {
		return armyNumberLabel47;
	}
	else if("state48".equals(s)) {
		return armyNumberLabel48;
	}
	else if("state49".equals(s)) {
		return armyNumberLabel49;
	}
	else {
		return armyNumberLabel50;
	}
}

public ImageView stringtoimage(String s) {
	
	if("state1".equals(s)) {
		return redMap1;
	}
	else if("state2".equals(s)) {
		return redMap2;
	}
	else if("state3".equals(s)) {
		return redMap3;
	}
	else if("state4".equals(s)) {
		return redMap4;
	}
	else if("state5".equals(s)) {
		return redMap5;
	}
	else if("state6".equals(s)) {
		return redMap6;
	}
	else if("state7".equals(s)) {
		return redMap7;
	}
	else if("state8".equals(s)) {
		return redMap8;
	}
	else if("state9".equals(s)) {
		return redMap9;
	}
	else if("state10".equals(s)) {
		return redMap10;
	}
	else if("state11".equals(s)) {
		return redMap11;
	}
	else if("state12".equals(s)) {
		return redMap12;
	}
	else if("state13".equals(s)) {
		return redMap13;
	}
	else if("state14".equals(s)) {
		return redMap14;
	}
	else if("state15".equals(s)) {
		return redMap15;
	}
	else if("state16".equals(s)) {
		return redMap16;
	}
	else if("state17".equals(s)) {
		return redMap17;
	}
	else if("state18".equals(s)) {
		return redMap18;
	}
	else if("state19".equals(s)) {
		return redMap19;
	}
	else if("state20".equals(s)) {
		return redMap20;
	}
	else if("state21".equals(s)) {
		return redMap21;
	}
	else if("state22".equals(s)) {
		return redMap22;
	}
	else if("state23".equals(s)) {
		return redMap23;
	}
	else if("state24".equals(s)) {
		return redMap24;
	}
	else if("state25".equals(s)) {
		return redMap25;
	}
	else if("state26".equals(s)) {
		return redMap26;
	}
	else if("state27".equals(s)){
		return redMap27;
	}
	else if("state28".equals(s)) {
		return redMap28;
	}
	else if("state29".equals(s)) {
		return redMap29;
	}
	else if("state30".equals(s)) {
		return redMap30;
	}
	else if("state31".equals(s)) {
		return redMap31;
	}
	else if("state32".equals(s)) {
		return redMap32;
	}
	else if("state33".equals(s)) {
		return redMap33;
	}
	else if("state34".equals(s)) {
		return redMap34;
	}
	else if("state35".equals(s)) {
		return redMap35;
	}
	else if("state36".equals(s)) {
		return redMap36;
	}
	else if("state37".equals(s)) {
		return redMap37;
	}
	else if("state38".equals(s)) {
		return redMap38;
	}
	else if("state39".equals(s)) {
		return redMap39;
	}
	else if("state40".equals(s)) {
		return redMap40;
	}
	else if("state41".equals(s)) {
		return redMap41;
	}
	else if("state42".equals(s)) {
		return redMap42;
	}
	else if("state43".equals(s)) {
		return redMap43;
	}
	else if("state44".equals(s)) {
		return redMap44;
	}
	else if("state45".equals(s)) {
		return redMap45;
	}
	else if("state46".equals(s)) {
		return redMap46;
	}
	else if("state47".equals(s)) {
		return redMap47;
	}
	else if("state48".equals(s)) {
		return redMap48;
	}
	else if("state49".equals(s)) {
		return redMap49;
	}
	else {
		return redMap50;
	}
}

public ImageView enemystringtoimage(String s) {
	
	if("state1".equals(s)) {
		return blueMap1;
	}
	else if("state2".equals(s)) {
		return blueMap2;
	}
	else if("state3".equals(s)) {
		return blueMap3;
	}
	else if("state4".equals(s)) {
		return blueMap4;
	}
	else if("state5".equals(s)) {
		return blueMap5;
	}
	else if("state6".equals(s)) {
		return blueMap6;
	}
	else if("state7".equals(s)) {
		return blueMap7;
	}
	else if("state8".equals(s)) {
		return blueMap8;
	}
	else if("state9".equals(s)) {
		return blueMap9;
	}
	else if("state10".equals(s)) {
		return blueMap10;
	}
	else if("state11".equals(s)) {
		return blueMap11;
	}
	else if("state12".equals(s)) {
		return blueMap12;
	}
	else if("state13".equals(s)) {
		return blueMap13;
	}
	else if("state14".equals(s)) {
		return blueMap14;
	}
	else if("state15".equals(s)) {
		return blueMap15;
	}
	else if("state16".equals(s)) {
		return blueMap16;
	}
	else if("state17".equals(s)) {
		return blueMap17;
	}
	else if("state18".equals(s)) {
		return blueMap18;
	}
	else if("state19".equals(s)) {
		return blueMap19;
	}
	else if("state20".equals(s)) {
		return blueMap20;
	}
	else if("state21".equals(s)) {
		return blueMap21;
	}
	else if("state22".equals(s)) {
		return blueMap22;
	}
	else if("state23".equals(s)) {
		return blueMap23;
	}
	else if("state24".equals(s)) {
		return blueMap24;
	}
	else if("state25".equals(s)) {
		return blueMap25;
	}
	else if("state26".equals(s)) {
		return blueMap26;
	}
	else if("state27".equals(s)){
		return blueMap27;
	}
	else if("state28".equals(s)) {
		return blueMap28;
	}
	else if("state29".equals(s)) {
		return blueMap29;
	}
	else if("state30".equals(s)) {
		return blueMap30;
	}
	else if("state31".equals(s)) {
		return blueMap31;
	}
	else if("state32".equals(s)) {
		return blueMap32;
	}
	else if("state33".equals(s)) {
		return blueMap33;
	}
	else if("state34".equals(s)) {
		return blueMap34;
	}
	else if("state35".equals(s)) {
		return blueMap35;
	}
	else if("state36".equals(s)) {
		return blueMap36;
	}
	else if("state37".equals(s)) {
		return blueMap37;
	}
	else if("state38".equals(s)) {
		return blueMap38;
	}
	else if("state39".equals(s)) {
		return blueMap39;
	}
	else if("state40".equals(s)) {
		return blueMap40;
	}
	else if("state41".equals(s)) {
		return blueMap41;
	}
	else if("state42".equals(s)) {
		return blueMap42;
	}
	else if("state43".equals(s)) {
		return blueMap43;
	}
	else if("state44".equals(s)) {
		return blueMap44;
	}
	else if("state45".equals(s)) {
		return blueMap45;
	}
	else if("state46".equals(s)) {
		return blueMap46;
	}
	else if("state47".equals(s)) {
		return blueMap47;
	}
	else if("state48".equals(s)) {
		return blueMap48;
	}
	else if("state49".equals(s)) {
		return blueMap49;
	}
	else {
		return blueMap50;
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
	if("polyState1".equals(polyId)&&redMap1.isVisible()==true) {
		if(state1.armynumber>1) {
			for(int i=0; i<state1.adjacentlist.size();i++) {
				if(state1.armynumber >= state1.adjacentlist.get(i).armynumber&&state1.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state1.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state1);
	}
	
	else if("polyState2".equals(polyId)&&redMap2.isVisible()==true) {
		if(state2.armynumber>1) {
			for(int i=0; i<state2.adjacentlist.size();i++) {
				if(state2.armynumber >= state2.adjacentlist.get(i).armynumber&&state2.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state2.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state2);
	}
	else if("polyState3".equals(polyId)&&redMap3.isVisible()==true) {
		if(state3.armynumber>1) {
			for(int i=0; i<state3.adjacentlist.size();i++) {
				if(state3.armynumber >= state3.adjacentlist.get(i).armynumber&&state3.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state3.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state3);
	}
	else if("polyState4".equals(polyId)&&redMap4.isVisible()==true) {
		if(state4.armynumber>1) {
			for(int i=0; i<state4.adjacentlist.size();i++) {
				if(state4.armynumber >= state4.adjacentlist.get(i).armynumber&&state4.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state4.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state4);
	}
	else if("polyState5".equals(polyId)&&redMap5.isVisible()==true) {
		if(state5.armynumber>1) {
			for(int i=0; i<state5.adjacentlist.size();i++) {
				if(state5.armynumber >= state5.adjacentlist.get(i).armynumber&&state5.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state5.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state5);
	}
	else if("polyState6".equals(polyId)&&redMap6.isVisible()==true) {
		if(state6.armynumber>1) {
			for(int i=0; i<state6.adjacentlist.size();i++) {
				if(state6.armynumber >= state6.adjacentlist.get(i).armynumber&&state6.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state6.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state6);
	}
	else if("polyState7".equals(polyId)&&redMap7.isVisible()==true) {
		if(state7.armynumber>1) {
			for(int i=0; i<state7.adjacentlist.size();i++) {
				if(state7.armynumber >= state7.adjacentlist.get(i).armynumber&&state7.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state7.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state7);
	}
	else if("polyState8".equals(polyId)&&redMap8.isVisible()==true) {
		if(state8.armynumber>1) {
			for(int i=0; i<state8.adjacentlist.size();i++) {
				if(state8.armynumber >= state8.adjacentlist.get(i).armynumber&&state8.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state8.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state8);
	}
	else if("polyState9".equals(polyId)&&redMap9.isVisible()==true) {
		if(state9.armynumber>1) {
			for(int i=0; i<state9.adjacentlist.size();i++) {
				if(state9.armynumber >= state9.adjacentlist.get(i).armynumber&&state9.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state9.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state9);
	}
	else if("polyState10".equals(polyId)&&redMap10.isVisible()==true) {
		if(state10.armynumber>1) {
			for(int i=0; i<state10.adjacentlist.size();i++) {
				if(state10.armynumber >= state10.adjacentlist.get(i).armynumber&&state10.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state10.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state10);
	}
	else if("polyState11".equals(polyId)&&redMap11.isVisible()==true) {
		if(state11.armynumber>1) {
			for(int i=0; i<state11.adjacentlist.size();i++) {
				if(state11.armynumber >= state11.adjacentlist.get(i).armynumber&&state11.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state11.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state11);
	}
	else if("polyState12".equals(polyId)&&redMap12.isVisible()==true) {
		if(state12.armynumber>1) {
			for(int i=0; i<state12.adjacentlist.size();i++) {
				if(state12.armynumber >= state12.adjacentlist.get(i).armynumber&&state12.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state12.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state12);
	}
	else if("polyState13".equals(polyId)&&redMap13.isVisible()==true) {
		if(state13.armynumber>1) {
			for(int i=0; i<state13.adjacentlist.size();i++) {
				if(state13.armynumber >= state13.adjacentlist.get(i).armynumber&&state13.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state13.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state13);
	}
	else if("polyState14".equals(polyId)&&redMap14.isVisible()==true) {
		if(state14.armynumber>1) {
			for(int i=0; i<state14.adjacentlist.size();i++) {
				if(state14.armynumber >= state14.adjacentlist.get(i).armynumber&&state14.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state14.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state14);
	}
	else if("polyState15".equals(polyId)&&redMap15.isVisible()==true) {
		if(state15.armynumber>1) {
			for(int i=0; i<state15.adjacentlist.size();i++) {
				if(state15.armynumber >= state15.adjacentlist.get(i).armynumber&&state15.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state15.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state15);
	}
	else if("polyState16".equals(polyId)&&redMap16.isVisible()==true) {
		if(state16.armynumber>1) {
			for(int i=0; i<state16.adjacentlist.size();i++) {
				if(state16.armynumber >= state16.adjacentlist.get(i).armynumber&&state16.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state16.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state16);
	}
	else if("polyState17".equals(polyId)&&redMap17.isVisible()==true) {
		if(state17.armynumber>1) {
			for(int i=0; i<state17.adjacentlist.size();i++) {
				if(state17.armynumber >= state17.adjacentlist.get(i).armynumber&&state17.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state17.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state17);
	}
	else if("polyState18".equals(polyId)&&redMap18.isVisible()==true) {
		if(state18.armynumber>1) {
			for(int i=0; i<state18.adjacentlist.size();i++) {
				if(state18.armynumber >= state18.adjacentlist.get(i).armynumber&&state18.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state18.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state18);
	}
	else if("polyState19".equals(polyId)&&redMap19.isVisible()==true) {
		if(state19.armynumber>1) {
			for(int i=0; i<state19.adjacentlist.size();i++) {
				if(state19.armynumber >= state19.adjacentlist.get(i).armynumber&&state19.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state19.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state19);
	}
	else if("polyState20".equals(polyId)&&redMap20.isVisible()==true) {
		if(state20.armynumber>1) {
			for(int i=0; i<state20.adjacentlist.size();i++) {
				if(state20.armynumber >= state20.adjacentlist.get(i).armynumber&&state20.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state20.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state20);
	}
	else if("polyState21".equals(polyId)&&redMap21.isVisible()==true) {
		if(state21.armynumber>1) {
			for(int i=0; i<state21.adjacentlist.size();i++) {
				if(state21.armynumber >= state21.adjacentlist.get(i).armynumber&&state21.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state21.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state21);
	}
	else if("polyState22".equals(polyId)&&redMap22.isVisible()==true) {
		if(state22.armynumber>1) {
			for(int i=0; i<state22.adjacentlist.size();i++) {
				if(state22.armynumber >= state22.adjacentlist.get(i).armynumber&&state22.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state22.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state22);
	}
	else if("polyState23".equals(polyId)&&redMap23.isVisible()==true) {
		if(state23.armynumber>1) {
			for(int i=0; i<state23.adjacentlist.size();i++) {
				if(state23.armynumber >= state23.adjacentlist.get(i).armynumber&&state23.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state23.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state23);
	}
	else if("polyState24".equals(polyId)&&redMap24.isVisible()==true) {
		if(state24.armynumber>1) {
			for(int i=0; i<state24.adjacentlist.size();i++) {
				if(state24.armynumber >= state24.adjacentlist.get(i).armynumber&&state24.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state24.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state24);
	}
	else if("polyState25".equals(polyId)&&redMap25.isVisible()==true) {
		if(state25.armynumber>1) {
			for(int i=0; i<state25.adjacentlist.size();i++) {
				if(state25.armynumber >= state25.adjacentlist.get(i).armynumber&&state25.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state25.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state25);
	}
	else if("polyState26".equals(polyId)&&redMap26.isVisible()==true) {
		if(state26.armynumber>1) {
			for(int i=0; i<state26.adjacentlist.size();i++) {
				if(state26.armynumber >= state26.adjacentlist.get(i).armynumber&&state26.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state26.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state26);
	}
	else if("polyState27".equals(polyId)&&redMap27.isVisible()==true){
		if(state27.armynumber>1) {
			for(int i=0; i<state27.adjacentlist.size();i++) {
				if(state27.armynumber >= state27.adjacentlist.get(i).armynumber&&state27.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state27.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state27);
	}
	else if("polyState28".equals(polyId)&&redMap2.isVisible()==true) {
		if(state28.armynumber>1) {
			for(int i=0; i<state28.adjacentlist.size();i++) {
				if(state28.armynumber >= state28.adjacentlist.get(i).armynumber&&state28.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state28.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state28);
	}
	else if("polyState29".equals(polyId)&&redMap2.isVisible()==true) {
		if(state29.armynumber>1) {
			for(int i=0; i<state29.adjacentlist.size();i++) {
				if(state29.armynumber >= state29.adjacentlist.get(i).armynumber&&state29.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state29.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state29);
	}
	else if("polyState30".equals(polyId)&&redMap30.isVisible()==true) {
		if(state30.armynumber>1) {
			for(int i=0; i<state30.adjacentlist.size();i++) {
				if(state30.armynumber >= state30.adjacentlist.get(i).armynumber&&state30.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state30.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state30);
	}
	else if("polyState31".equals(polyId)&&redMap31.isVisible()==true) {
		if(state31.armynumber>1) {
			for(int i=0; i<state31.adjacentlist.size();i++) {
				if(state31.armynumber >= state31.adjacentlist.get(i).armynumber&&state31.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state31.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state31);
	}
	else if("polyState32".equals(polyId)&&redMap32.isVisible()==true) {
		if(state32.armynumber>1) {
			for(int i=0; i<state32.adjacentlist.size();i++) {
				if(state32.armynumber >= state32.adjacentlist.get(i).armynumber&&state32.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state32.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state32);
	}
	else if("polyState33".equals(polyId)&&redMap33.isVisible()==true) {
		if(state33.armynumber>1) {
			for(int i=0; i<state33.adjacentlist.size();i++) {
				if(state33.armynumber >= state33.adjacentlist.get(i).armynumber&&state33.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state33.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state33);
	}
	else if("polyState34".equals(polyId)&&redMap34.isVisible()==true) {
		if(state34.armynumber>1) {
			for(int i=0; i<state34.adjacentlist.size();i++) {
				if(state34.armynumber >= state34.adjacentlist.get(i).armynumber&&state34.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state34.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state34);
	}
	else if("polyState35".equals(polyId)&&redMap35.isVisible()==true) {
		if(state35.armynumber>1) {
			for(int i=0; i<state35.adjacentlist.size();i++) {
				if(state35.armynumber >= state35.adjacentlist.get(i).armynumber&&state35.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state35.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state35);
	}
	else if("polyState36".equals(polyId)&&redMap36.isVisible()==true) {
		if(state36.armynumber>1) {
			for(int i=0; i<state36.adjacentlist.size();i++) {
				if(state36.armynumber >= state36.adjacentlist.get(i).armynumber&&state36.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state36.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state36);
	}
	else if("polyState37".equals(polyId)&&redMap37.isVisible()==true) {
		if(state37.armynumber>1) {
			for(int i=0; i<state37.adjacentlist.size();i++) {
				if(state37.armynumber >= state37.adjacentlist.get(i).armynumber&&state37.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state37.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state37);
	}
	else if("polyState38".equals(polyId)&&redMap38.isVisible()==true) {
		if(state38.armynumber>1) {
			for(int i=0; i<state38.adjacentlist.size();i++) {
				if(state38.armynumber >= state38.adjacentlist.get(i).armynumber&&state38.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state38.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state38);
	}
	else if("polyState39".equals(polyId)&&redMap39.isVisible()==true) {
		if(state39.armynumber>1) {
			for(int i=0; i<state39.adjacentlist.size();i++) {
				if(state39.armynumber >= state39.adjacentlist.get(i).armynumber&&state39.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state39.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state39);
	}
	else if("polyState40".equals(polyId)&&redMap40.isVisible()==true) {
		if(state40.armynumber>1) {
			for(int i=0; i<state40.adjacentlist.size();i++) {
				if(state40.armynumber >= state40.adjacentlist.get(i).armynumber&&state40.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state40.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state40);
	}
	else if("polyState41".equals(polyId)&&redMap41.isVisible()==true) {
		if(state41.armynumber>1) {
			for(int i=0; i<state41.adjacentlist.size();i++) {
				if(state41.armynumber >= state41.adjacentlist.get(i).armynumber&&state41.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state41.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state41);
	}
	else if("polyState42".equals(polyId)&&redMap42.isVisible()==true) {
		if(state42.armynumber>1) {
			for(int i=0; i<state42.adjacentlist.size();i++) {
				if(state42.armynumber >= state42.adjacentlist.get(i).armynumber&&state42.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state42.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state42);
	}
	else if("polyState43".equals(polyId)&&redMap43.isVisible()==true) {
		if(state43.armynumber>1) {
			for(int i=0; i<state43.adjacentlist.size();i++) {
				if(state43.armynumber >= state43.adjacentlist.get(i).armynumber&&state43.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state43.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state43);
	}
	else if("polyState44".equals(polyId)&&redMap44.isVisible()==true) {
		if(state44.armynumber>1) {
			for(int i=0; i<state44.adjacentlist.size();i++) {
				if(state44.armynumber >= state44.adjacentlist.get(i).armynumber&&state44.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state44.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state44);
	}
	else if("polyState45".equals(polyId)&&redMap45.isVisible()==true) {
		if(state45.armynumber>1) {
			for(int i=0; i<state45.adjacentlist.size();i++) {
				if(state45.armynumber >= state45.adjacentlist.get(i).armynumber&&state45.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state45.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state45);
	}
	else if("polyState46".equals(polyId)&&redMap46.isVisible()==true) {
		if(state46.armynumber>1) {
			for(int i=0; i<state46.adjacentlist.size();i++) {
				if(state46.armynumber >= state46.adjacentlist.get(i).armynumber&&state46.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state46.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state46);
	}
	else if("polyState47".equals(polyId)&&redMap47.isVisible()==true) {
		if(state47.armynumber>1) {
			for(int i=0; i<state47.adjacentlist.size();i++) {
				if(state47.armynumber >= state47.adjacentlist.get(i).armynumber&&state47.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state47.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state47);
	}
	else if("polyState48".equals(polyId)&&redMap48.isVisible()==true) {
		if(state48.armynumber>1) {
			for(int i=0; i<state48.adjacentlist.size();i++) {
				if(state48.armynumber >= state48.adjacentlist.get(i).armynumber&&state48.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state48.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state48);
	}
	else if("polyState49".equals(polyId)&&redMap49.isVisible()==true) {
		if(state49.armynumber>1) {
			for(int i=0; i<state49.adjacentlist.size();i++) {
				if(state49.armynumber >= state49.adjacentlist.get(i).armynumber&&state49.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state49.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state49);
	}
	else if(redMap50.isVisible()==true) {
		if(state50.armynumber>1) {
			for(int i=0; i<state50.adjacentlist.size();i++) {
				if(state50.armynumber >= state50.adjacentlist.get(i).armynumber&&state50.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state50.adjacentlist.get(i).number));
				}
			}
		}
		setvisible(state50);
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
			armyNumberLabel1.setText(String.valueOf(state1.armynumber));
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
			armyNumberLabel2.setText(String.valueOf(state2.armynumber));
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
			armyNumberLabel3.setText(String.valueOf(state3.armynumber));
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
			armyNumberLabel4.setText(String.valueOf(state4.armynumber));
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
			armyNumberLabel5.setText(String.valueOf(state5.armynumber));
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
			armyNumberLabel6.setText(String.valueOf(state6.armynumber));
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
			armyNumberLabel7.setText(String.valueOf(state7.armynumber));
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
			armyNumberLabel8.setText(String.valueOf(state8.armynumber));
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
			armyNumberLabel9.setText(String.valueOf(state9.armynumber));
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
			armyNumberLabel10.setText(String.valueOf(state10.armynumber));
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
			armyNumberLabel11.setText(String.valueOf(state11.armynumber));
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
			armyNumberLabel12.setText(String.valueOf(state12.armynumber));
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
			armyNumberLabel13.setText(String.valueOf(state13.armynumber));
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
			armyNumberLabel14.setText(String.valueOf(state14.armynumber));
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
			armyNumberLabel15.setText(String.valueOf(state15.armynumber));
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
			armyNumberLabel16.setText(String.valueOf(state16.armynumber));
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
			armyNumberLabel17.setText(String.valueOf(state17.armynumber));
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
			armyNumberLabel18.setText(String.valueOf(state18.armynumber));
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
			armyNumberLabel19.setText(String.valueOf(state19.armynumber));
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
			armyNumberLabel20.setText(String.valueOf(state20.armynumber));
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
			armyNumberLabel21.setText(String.valueOf(state21.armynumber));
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
			armyNumberLabel22.setText(String.valueOf(state22.armynumber));
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
			armyNumberLabel23.setText(String.valueOf(state23.armynumber));
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
			armyNumberLabel24.setText(String.valueOf(state24.armynumber));
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
			armyNumberLabel25.setText(String.valueOf(state25.armynumber));
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
			armyNumberLabel26.setText(String.valueOf(state26.armynumber));
			for(int i=0; i<state26.adjacentlist.size();i++) {
				if(state26.armynumber >= state26.adjacentlist.get(i).armynumber&&state26.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state26.adjacentlist.get(i).number));
				}
			}
		}
		else if("state27".equals(statename)){
			state27.armynumber = state27.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state27.armynumber));
			armyNumberLabel27.setText(String.valueOf(state27.armynumber));
			for(int i=0; i<state27.adjacentlist.size();i++) {
				if(state27.armynumber >= state27.adjacentlist.get(i).armynumber&&state27.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state27.adjacentlist.get(i).number));
				}
			}
		}
		else if("state28".equals(statename)) {
			state28.armynumber = state28.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state28.armynumber));
			armyNumberLabel28.setText(String.valueOf(state28.armynumber));
			for(int i=0; i<state28.adjacentlist.size();i++) {
				if(state28.armynumber >= state28.adjacentlist.get(i).armynumber&&state28.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state28.adjacentlist.get(i).number));
				}
			}
		}
		else if("state29".equals(statename)) {
			state29.armynumber = state29.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state29.armynumber));
			armyNumberLabel29.setText(String.valueOf(state29.armynumber));
			for(int i=0; i<state29.adjacentlist.size();i++) {
				if(state29.armynumber >= state29.adjacentlist.get(i).armynumber&&state29.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state29.adjacentlist.get(i).number));
				}
			}
		}
		else if("state30".equals(statename)) {
			state30.armynumber = state30.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state30.armynumber));
			armyNumberLabel30.setText(String.valueOf(state30.armynumber));
			for(int i=0; i<state30.adjacentlist.size();i++) {
				if(state30.armynumber >= state30.adjacentlist.get(i).armynumber&&state30.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state30.adjacentlist.get(i).number));
				}
			}
		}
		else if("state31".equals(statename)) {
			state31.armynumber = state31.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state31.armynumber));
			armyNumberLabel31.setText(String.valueOf(state31.armynumber));
			for(int i=0; i<state31.adjacentlist.size();i++) {
				if(state31.armynumber >= state31.adjacentlist.get(i).armynumber&&state31.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state31.adjacentlist.get(i).number));
				}
			}
		}
		else if("state32".equals(statename)) {
			state32.armynumber = state32.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state32.armynumber));
			armyNumberLabel32.setText(String.valueOf(state32.armynumber));
			for(int i=0; i<state32.adjacentlist.size();i++) {
				if(state32.armynumber >= state32.adjacentlist.get(i).armynumber&&state32.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state32.adjacentlist.get(i).number));
				}
			}
		}
		else if("state33".equals(statename)) {
			state33.armynumber = state33.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state33.armynumber));
			armyNumberLabel33.setText(String.valueOf(state33.armynumber));
			for(int i=0; i<state33.adjacentlist.size();i++) {
				if(state33.armynumber >= state33.adjacentlist.get(i).armynumber&&state33.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state33.adjacentlist.get(i).number));
				}
			}
		}
		else if("state34".equals(statename)) {
			state34.armynumber = state34.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state34.armynumber));
			armyNumberLabel34.setText(String.valueOf(state34.armynumber));
			for(int i=0; i<state34.adjacentlist.size();i++) {
				if(state34.armynumber >= state34.adjacentlist.get(i).armynumber&&state34.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state34.adjacentlist.get(i).number));
				}
			}
		}
		else if("state35".equals(statename)) {
			state35.armynumber = state35.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state35.armynumber));
			armyNumberLabel35.setText(String.valueOf(state35.armynumber));
			for(int i=0; i<state35.adjacentlist.size();i++) {
				if(state35.armynumber >= state35.adjacentlist.get(i).armynumber&&state35.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state35.adjacentlist.get(i).number));
				}
			}
		}
		else if("state36".equals(statename)) {
			state36.armynumber = state36.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state36.armynumber));
			armyNumberLabel36.setText(String.valueOf(state36.armynumber));
			for(int i=0; i<state36.adjacentlist.size();i++) {
				if(state36.armynumber >= state36.adjacentlist.get(i).armynumber&&state36.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state36.adjacentlist.get(i).number));
				}
			}
		}
		else if("state37".equals(statename)) {
			state37.armynumber = state37.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state37.armynumber));
			armyNumberLabel37.setText(String.valueOf(state37.armynumber));
			for(int i=0; i<state37.adjacentlist.size();i++) {
				if(state37.armynumber >= state37.adjacentlist.get(i).armynumber&&state37.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state37.adjacentlist.get(i).number));
				}
			}
		}
		else if("state38".equals(statename)) {
			state38.armynumber = state38.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state38.armynumber));
			armyNumberLabel38.setText(String.valueOf(state38.armynumber));
			for(int i=0; i<state38.adjacentlist.size();i++) {
				if(state38.armynumber >= state38.adjacentlist.get(i).armynumber&&state38.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state38.adjacentlist.get(i).number));
				}
			}
		}
		else if("state39".equals(statename)) {
			state39.armynumber = state39.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state39.armynumber));
			armyNumberLabel39.setText(String.valueOf(state39.armynumber));
			for(int i=0; i<state39.adjacentlist.size();i++) {
				if(state39.armynumber >= state39.adjacentlist.get(i).armynumber&&state39.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state39.adjacentlist.get(i).number));
				}
			}
		}
		else if("state40".equals(statename)) {
			state40.armynumber = state40.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state40.armynumber));
			armyNumberLabel40.setText(String.valueOf(state40.armynumber));
			for(int i=0; i<state40.adjacentlist.size();i++) {
				if(state40.armynumber >= state40.adjacentlist.get(i).armynumber&&state40.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state40.adjacentlist.get(i).number));
				}
			}
		}
		else if("state41".equals(statename)) {
			state41.armynumber = state41.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state41.armynumber));
			armyNumberLabel41.setText(String.valueOf(state41.armynumber));
			for(int i=0; i<state41.adjacentlist.size();i++) {
				if(state41.armynumber >= state41.adjacentlist.get(i).armynumber&&state41.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state41.adjacentlist.get(i).number));
				}
			}
		}
		else if("state42".equals(statename)) {
			state42.armynumber = state42.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state42.armynumber));
			armyNumberLabel42.setText(String.valueOf(state42.armynumber));
			for(int i=0; i<state42.adjacentlist.size();i++) {
				if(state42.armynumber >= state42.adjacentlist.get(i).armynumber&&state42.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state42.adjacentlist.get(i).number));
				}
			}
		}
		else if("state43".equals(statename)) {
			state43.armynumber = state43.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state43.armynumber));
			armyNumberLabel43.setText(String.valueOf(state43.armynumber));
			for(int i=0; i<state43.adjacentlist.size();i++) {
				if(state43.armynumber >= state43.adjacentlist.get(i).armynumber&&state43.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state43.adjacentlist.get(i).number));
				}
			}
		}
		else if("state44".equals(statename)) {
			state44.armynumber = state44.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state44.armynumber));
			armyNumberLabel44.setText(String.valueOf(state44.armynumber));
			for(int i=0; i<state44.adjacentlist.size();i++) {
				if(state44.armynumber >= state44.adjacentlist.get(i).armynumber&&state44.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state44.adjacentlist.get(i).number));
				}
			}
		}
		else if("state45".equals(statename)) {
			state45.armynumber = state45.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state45.armynumber));
			armyNumberLabel45.setText(String.valueOf(state45.armynumber));
			for(int i=0; i<state45.adjacentlist.size();i++) {
				if(state45.armynumber >= state45.adjacentlist.get(i).armynumber&&state45.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state45.adjacentlist.get(i).number));
				}
			}
		}
		else if("state46".equals(statename)) {
			state46.armynumber = state46.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state46.armynumber));
			armyNumberLabel46.setText(String.valueOf(state46.armynumber));
			for(int i=0; i<state46.adjacentlist.size();i++) {
				if(state46.armynumber >= state46.adjacentlist.get(i).armynumber&&state46.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state46.adjacentlist.get(i).number));
				}
			}
		}
		else if("state47".equals(statename)) {
			state47.armynumber = state47.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state47.armynumber));
			armyNumberLabel47.setText(String.valueOf(state47.armynumber));
			for(int i=0; i<state47.adjacentlist.size();i++) {
				if(state47.armynumber >= state47.adjacentlist.get(i).armynumber&&state47.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state47.adjacentlist.get(i).number));
				}
			}
		}
		else if("state48".equals(statename)) {
			state48.armynumber = state48.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state48.armynumber));
			armyNumberLabel48.setText(String.valueOf(state48.armynumber));
			for(int i=0; i<state48.adjacentlist.size();i++) {
				if(state48.armynumber >= state48.adjacentlist.get(i).armynumber&&state48.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state48.adjacentlist.get(i).number));
				}
			}
		}
		else if("state49".equals(statename)) {
			state49.armynumber = state49.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state49.armynumber));
			armyNumberLabel49.setText(String.valueOf(state49.armynumber));
			for(int i=0; i<state49.adjacentlist.size();i++) {
				if(state49.armynumber >= state49.adjacentlist.get(i).armynumber&&state49.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state49.adjacentlist.get(i).number));
				}
			}
		}
		else {
			state50.armynumber = state50.armynumber+Integer.parseInt(addtionalarmynumber);
			player1.additionalarmy = player1.additionalarmy - Integer.parseInt(addtionalarmynumber);
			additionalarmy.setText("Additional army is:   "+String.valueOf(player1.additionalarmy));
			armyNumberSideBarLabel.setText(String.valueOf(state50.armynumber));
			armyNumberLabel50.setText(String.valueOf(state50.armynumber));
			for(int i=0; i<state50.adjacentlist.size();i++) {
				if(state50.armynumber >= state50.adjacentlist.get(i).armynumber&&state50.adjacentlist.get(i).color!=1) {
					observableList.add("state"+String.valueOf(state50.adjacentlist.get(i).number));
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
		armyNumberLabel1.setText(String.valueOf(state1.armynumber));
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
		armyNumberLabel2.setText(String.valueOf(state2.armynumber));
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
		armyNumberLabel3.setText(String.valueOf(state3.armynumber));
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
		armyNumberLabel4.setText(String.valueOf(state4.armynumber));
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
		armyNumberLabel5.setText(String.valueOf(state5.armynumber));
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
		armyNumberLabel6.setText(String.valueOf(state6.armynumber));
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
		armyNumberLabel7.setText(String.valueOf(state7.armynumber));
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
		armyNumberLabel8.setText(String.valueOf(state8.armynumber));
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
		armyNumberLabel9.setText(String.valueOf(state9.armynumber));
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
		armyNumberLabel10.setText(String.valueOf(state10.armynumber));
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
		armyNumberLabel11.setText(String.valueOf(state11.armynumber));
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
		armyNumberLabel12.setText(String.valueOf(state12.armynumber));
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
		armyNumberLabel13.setText(String.valueOf(state13.armynumber));
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
		armyNumberLabel14.setText(String.valueOf(state14.armynumber));
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
		armyNumberLabel15.setText(String.valueOf(state15.armynumber));
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
		armyNumberLabel16.setText(String.valueOf(state16.armynumber));
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
		armyNumberLabel17.setText(String.valueOf(state17.armynumber));
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
		armyNumberLabel18.setText(String.valueOf(state18.armynumber));
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
		armyNumberLabel19.setText(String.valueOf(state19.armynumber));
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
		armyNumberLabel20.setText(String.valueOf(state20.armynumber));
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
		armyNumberLabel21.setText(String.valueOf(state21.armynumber));
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
		armyNumberLabel22.setText(String.valueOf(state22.armynumber));
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
		armyNumberLabel23.setText(String.valueOf(state23.armynumber));
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
		armyNumberLabel24.setText(String.valueOf(state24.armynumber));
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
		armyNumberLabel25.setText(String.valueOf(state25.armynumber));
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
		armyNumberLabel26.setText(String.valueOf(state26.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state26.armynumber));
	}
	else if("state27".equals(statename)) {
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
		armyNumberLabel27.setText(String.valueOf(state27.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state27.armynumber));
	}
	else if("state28".equals(statename)) {
		for(int i=0;i<state28.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state28.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state28.adjacentlist.get(i).armynumber = state28.armynumber -1;
				state28.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state28.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state28.adjacentlist.get(i).armynumber));
			}
		}
		state28.armynumber = 1;
		armyNumberLabel28.setText(String.valueOf(state28.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state28.armynumber));
	}
	else if("state29".equals(statename)) {
		for(int i=0;i<state29.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state29.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state29.adjacentlist.get(i).armynumber = state29.armynumber -1;
				state29.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state29.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state29.adjacentlist.get(i).armynumber));
			}
		}
		state29.armynumber = 1;
		armyNumberLabel29.setText(String.valueOf(state29.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state29.armynumber));
	}
	else if("state30".equals(statename)) {
		for(int i=0;i<state30.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state30.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state30.adjacentlist.get(i).armynumber = state30.armynumber -1;
				state30.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state30.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state30.adjacentlist.get(i).armynumber));
			}
		}
		state30.armynumber = 1;
		armyNumberLabel30.setText(String.valueOf(state30.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state30.armynumber));
	}
	else if("state31".equals(statename)) {
		for(int i=0;i<state31.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state31.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state31.adjacentlist.get(i).armynumber = state31.armynumber -1;
				state31.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state31.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state31.adjacentlist.get(i).armynumber));
			}
		}
		state31.armynumber = 1;
		armyNumberLabel31.setText(String.valueOf(state31.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state31.armynumber));
	}
	else if("state32".equals(statename)) {
		for(int i=0;i<state32.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state32.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state32.adjacentlist.get(i).armynumber = state32.armynumber -1;
				state32.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state32.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state32.adjacentlist.get(i).armynumber));
			}
		}
		state32.armynumber = 1;
		armyNumberLabel32.setText(String.valueOf(state32.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state32.armynumber));
	}
	else if("state33".equals(statename)) {
		for(int i=0;i<state33.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state33.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state33.adjacentlist.get(i).armynumber = state33.armynumber -1;
				state33.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state33.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state33.adjacentlist.get(i).armynumber));
			}
		}
		state33.armynumber = 1;
		armyNumberLabel33.setText(String.valueOf(state33.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state33.armynumber));
	}
	else if("state34".equals(statename)) {
		for(int i=0;i<state34.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state34.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state34.adjacentlist.get(i).armynumber = state34.armynumber -1;
				state34.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state34.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state34.adjacentlist.get(i).armynumber));
			}
		}
		state34.armynumber = 1;
		armyNumberLabel34.setText(String.valueOf(state34.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state34.armynumber));
	}
	else if("state35".equals(statename)) {
		for(int i=0;i<state35.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state35.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state35.adjacentlist.get(i).armynumber = state35.armynumber -1;
				state35.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state35.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state35.adjacentlist.get(i).armynumber));
			}
		}
		state35.armynumber = 1;
		armyNumberLabel35.setText(String.valueOf(state35.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state35.armynumber));
	}
	else if("state36".equals(statename)) {
		for(int i=0;i<state36.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state36.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state36.adjacentlist.get(i).armynumber = state36.armynumber -1;
				state36.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state36.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state36.adjacentlist.get(i).armynumber));
			}
		}
		state36.armynumber = 1;
		armyNumberLabel36.setText(String.valueOf(state36.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state36.armynumber));
	}
	else if("state37".equals(statename)) {
		for(int i=0;i<state37.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state37.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state37.adjacentlist.get(i).armynumber = state37.armynumber -1;
				state37.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state37.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state37.adjacentlist.get(i).armynumber));
			}
		}
		state37.armynumber = 1;
		armyNumberLabel37.setText(String.valueOf(state37.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state37.armynumber));
	}
	else if("state38".equals(statename)) {
		for(int i=0;i<state38.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state38.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state38.adjacentlist.get(i).armynumber = state38.armynumber -1;
				state38.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state38.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state38.adjacentlist.get(i).armynumber));
			}
		}
		state38.armynumber = 1;
		armyNumberLabel38.setText(String.valueOf(state38.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state38.armynumber));
	}
	else if("state39".equals(statename)) {
		for(int i=0;i<state39.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state39.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state39.adjacentlist.get(i).armynumber = state39.armynumber -1;
				state39.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state39.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state39.adjacentlist.get(i).armynumber));
			}
		}
		state39.armynumber = 1;
		armyNumberLabel39.setText(String.valueOf(state39.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state39.armynumber));
	}
	else if("state40".equals(statename)) {
		for(int i=0;i<state40.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state40.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state40.adjacentlist.get(i).armynumber = state40.armynumber -1;
				state40.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state40.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state40.adjacentlist.get(i).armynumber));
			}
		}
		state40.armynumber = 1;
		armyNumberLabel40.setText(String.valueOf(state40.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state40.armynumber));
	}
	else if("state41".equals(statename)) {
		for(int i=0;i<state41.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state41.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state41.adjacentlist.get(i).armynumber = state41.armynumber -1;
				state41.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state41.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state41.adjacentlist.get(i).armynumber));
			}
		}
		state41.armynumber = 1;
		armyNumberLabel41.setText(String.valueOf(state41.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state41.armynumber));
	}
	else if("state42".equals(statename)) {
		for(int i=0;i<state42.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state42.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state42.adjacentlist.get(i).armynumber = state42.armynumber -1;
				state42.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state42.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state42.adjacentlist.get(i).armynumber));
			}
		}
		state42.armynumber = 1;
		armyNumberLabel42.setText(String.valueOf(state42.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state42.armynumber));
	}
	else if("state43".equals(statename)) {
		for(int i=0;i<state43.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state43.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state43.adjacentlist.get(i).armynumber = state43.armynumber -1;
				state43.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state43.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state43.adjacentlist.get(i).armynumber));
			}
		}
		state43.armynumber = 1;
		armyNumberLabel43.setText(String.valueOf(state43.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state43.armynumber));
	}
	else if("state44".equals(statename)) {
		for(int i=0;i<state44.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state44.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state44.adjacentlist.get(i).armynumber = state44.armynumber -1;
				state44.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state44.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state44.adjacentlist.get(i).armynumber));
			}
		}
		state44.armynumber = 1;
		armyNumberLabel44.setText(String.valueOf(state44.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state44.armynumber));
	}
	else if("state45".equals(statename)) {
		for(int i=0;i<state45.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state45.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state45.adjacentlist.get(i).armynumber = state45.armynumber -1;
				state45.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state45.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state45.adjacentlist.get(i).armynumber));
			}
		}
		state45.armynumber = 1;
		armyNumberLabel45.setText(String.valueOf(state45.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state45.armynumber));
	}
	else if("state46".equals(statename)) {
		for(int i=0;i<state46.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state46.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state46.adjacentlist.get(i).armynumber = state46.armynumber -1;
				state46.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state46.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state46.adjacentlist.get(i).armynumber));
			}
		}
		state46.armynumber = 1;
		armyNumberLabel46.setText(String.valueOf(state46.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state46.armynumber));
	}
	else if("state47".equals(statename)) {
		for(int i=0;i<state47.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state47.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state47.adjacentlist.get(i).armynumber = state47.armynumber -1;
				state47.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state47.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state47.adjacentlist.get(i).armynumber));
			}
		}
		state47.armynumber = 1;
		armyNumberLabel47.setText(String.valueOf(state47.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state47.armynumber));
	}
	else if("state48".equals(statename)) {
		for(int i=0;i<state48.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state48.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state48.adjacentlist.get(i).armynumber = state48.armynumber -1;
				state48.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state48.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state48.adjacentlist.get(i).armynumber));
			}
		}
		state48.armynumber = 1;
		armyNumberLabel48.setText(String.valueOf(state48.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state48.armynumber));
	}
	else if("state49".equals(statename)) {
		for(int i=0;i<state49.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state49.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state49.adjacentlist.get(i).armynumber = state49.armynumber -1;
				state49.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state49.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state49.adjacentlist.get(i).armynumber));
			}
		}
		state49.armynumber = 1;
		armyNumberLabel49.setText(String.valueOf(state49.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state49.armynumber));
	}
	else {
		for(int i=0;i<state50.adjacentlist.size();i++) {
			if(("state"+String.valueOf(state50.adjacentlist.get(i).number)).equals(attackedstate)) {
				if(enemyattackedimage.isVisible()) {
					enemyattackedimage.setVisible(false);
					for(int j=0;j<player2.teritorylist.size();j++) {
						if(("state"+String.valueOf(player2.teritorylist.get(j).number)).equals(attackedstate)) {
							player2.teritorylist.remove(j);
						}
					}
				}
				attackedimage.setVisible(true);
				state50.adjacentlist.get(i).armynumber = state50.armynumber -1;
				state50.adjacentlist.get(i).color=1;
				player1.teritorylist.add(state50.adjacentlist.get(i));
				attackedl.setText(String.valueOf(state50.adjacentlist.get(i).armynumber));
			}
		}
		state50.armynumber = 1;
		armyNumberLabel50.setText(String.valueOf(state50.armynumber));
		armyNumberSideBarLabel.setText(String.valueOf(state50.armynumber));
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
			if(player1.teritorylist.size()==48) {
				System.out.println("red player has won");
			}
			else {
				player1.agentType.PlayStyle(player1, player2);
				System.out.println("green player has no teritory");
			}
		
		}
		else if(player1.teritorylist.size()==0){
			if(player2.teritorylist.size()==48) {
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
