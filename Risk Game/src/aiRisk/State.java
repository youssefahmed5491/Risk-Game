package aiRisk;

import java.util.ArrayList;


public class State {
	
	int number;
	int color;
	int armynumber;
	int heuristic;
	int gofn;
	int function;
	ArrayList<State> adjacentlist = new ArrayList<State>();
	
	public State(int number) {
		this.number = number;
		this.color = 0;
		this.armynumber = 0;
		this.heuristic = 0;
		this.gofn = 0;
		this.function = 0;
	}


	public void setAdjacentlist(ArrayList<State> adjacentlist) {
		this.adjacentlist = adjacentlist;
	}
	
}
