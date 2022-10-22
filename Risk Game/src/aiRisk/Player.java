package aiRisk;

import java.util.ArrayList;
public class Player {
	ArrayList<State> teritorylist = new ArrayList<State>();
	int number;
	int additionalarmy;
	int color;
	Agent agentType;
	
	public Player(int number,int color,Agent agType) {
		
		this.number = number;
		this.color = color;
		this.agentType = agType;
		
	}
	
	public void AdditionalArmyNumber(Player player) {
		
		int count = player.teritorylist.size() ;
		int conditin = count/3;
		if(conditin<=3) {
			player.additionalarmy = 3;
		}
		else {
			player.additionalarmy = conditin;
		}
	}
}
