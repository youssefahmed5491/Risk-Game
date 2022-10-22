package aiRisk;

public class CompletelyPassiveAgent implements Agent {
public State territorywiththefewestarmy(Player player) {
		
		State state = new State(0);
		System.out.println(player.teritorylist.size());
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
		if(player.teritorylist.size()==0) {
			return;
		}
		state = territorywiththefewestarmy(player);
		player.AdditionalArmyNumber(player);
		state.armynumber = state.armynumber + player.additionalarmy;
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
		
	}
}