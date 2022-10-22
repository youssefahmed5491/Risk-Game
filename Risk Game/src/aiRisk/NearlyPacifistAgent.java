package aiRisk;

import java.util.ArrayList;

public class NearlyPacifistAgent implements Agent {
public State territorywiththefewestarmy(Player player) {
		
		State state = new State(0);
		state = player.teritorylist.get(0);
		State temp = new State(0);
		
		for(int i=1 ; i<player.teritorylist.size();i++) {
			
			temp = player.teritorylist.get(i);
			if(temp.armynumber<state.armynumber) {
				
				state = temp;
				
			}
		}
		return state;
	}

	public void PlayStyle(Player player,Player player2) {
		
		State state = new State(0);
		state = territorywiththefewestarmy(player);
		player.AdditionalArmyNumber(player);
		state.armynumber = state.armynumber + player.additionalarmy;
		State temp = new State(0);
		ArrayList<State> arr = new ArrayList<State>();
		for(int i=0;i<state.adjacentlist.size();i++) {
			
			temp = state.adjacentlist.get(i);
			if(state.armynumber>=temp.armynumber&&state.color!=temp.color) {
				arr.add(temp);
			}
		}
		if(arr.isEmpty()) {
			return;
		}
		State attackedstate = new State(0);
		attackedstate = arr.get(0);
		for(int i=1;i<arr.size();i++) {
			
			if(attackedstate.armynumber>=arr.get(i).armynumber) {
				
				attackedstate=arr.get(i);
			}
		}
		attackedstate.color=state.color;
		attackedstate.gofn++;
		attackedstate.armynumber=state.armynumber-1;
		state.armynumber=1;
		player.teritorylist.add(attackedstate);
		int i=0;
		while(i<player.teritorylist.size()) {
			if(state.number == player.teritorylist.get(i).number) {
				player.teritorylist.get(i).armynumber = state.armynumber;
				player.teritorylist.get(i).color = state.color;
				player.teritorylist.get(i).gofn = state.gofn;
				player.teritorylist.get(i).function = state.function;
				player.teritorylist.get(i).heuristic = state.heuristic;
			}
			i++;
		}
		i=0;
		while(i<player2.teritorylist.size()) {
			if(attackedstate.number == player2.teritorylist.get(i).number) {
				player2.teritorylist.remove(i);
			}
			i++;
		}
		
	}
}
