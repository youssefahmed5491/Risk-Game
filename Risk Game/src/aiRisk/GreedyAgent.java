package aiRisk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class GreedyAgent implements Agent {

public void PlayStyle(Player player,Player player2) {
		
		State parent = new State(0);
		ArrayList<State> childofstate = new ArrayList<State>();
		player.AdditionalArmyNumber(player);
		for(int i=0;i<player.teritorylist.size();i++) {
			
			parent = player.teritorylist.get(i);
			for(int j=0;j<parent.adjacentlist.size();j++) {
				
				if(parent.color!=parent.adjacentlist.get(j).color&&!childofstate.contains(parent.adjacentlist.get(j))&&
					parent.armynumber+player.additionalarmy-1>=parent.adjacentlist.get(j).armynumber) {
					
					childofstate.add(parent.adjacentlist.get(j));
				}
			}			
		}
		State temp = new State(0);
		PriorityQueue<State> arr = new PriorityQueue<>(new Comparator<State>() {
            
            @Override
            public int compare(State g1, State g2) {
                
                return g2.heuristic-g1.heuristic; 
            }
       });
		
		for(int i=0;i<childofstate.size();i++) {
			
			temp = childofstate.get(i);
			for(int j=0;j<temp.adjacentlist.size();j++) {

				if(player.color!=temp.adjacentlist.get(j).color) { 
					
					temp.heuristic++;
					
				}
			}
			arr.add(temp);
		}
		State choosenchild = new State(0);
		if(arr.isEmpty()) {
			State state = new State(0);
			state = player.teritorylist.get(0);
			State temp2 = new State(0);
			int i=1;
			while(i<player.teritorylist.size()) {
				temp2 = player.teritorylist.get(i);
				for(int j=0;j<temp2.adjacentlist.size();j++) {
					if(temp2.adjacentlist.get(j).color==player2.color) {
						state = temp2;
					}
				}
				i++;
			}
			state.armynumber = state.armynumber + player.additionalarmy;
			return;
		}
		choosenchild = arr.remove();
		for(int i=0;i<childofstate.size();i++) {
			temp=childofstate.get(i);
			temp.heuristic=0;
		}
		State choosenparent = new State(0);
		ArrayList<State> qualifiedasparent = new ArrayList<State>();
		for(int i=0;i<choosenchild.adjacentlist.size();i++) {
			choosenparent = choosenchild.adjacentlist.get(i);
			if(player.teritorylist.contains(choosenparent)&&choosenparent.armynumber+player.additionalarmy>choosenchild.armynumber) {
				qualifiedasparent.add(choosenparent);
			}
		}
		
		choosenparent=qualifiedasparent.get(0);
		for(int i=1;i<qualifiedasparent.size();i++) {
			if(choosenparent.armynumber<=qualifiedasparent.get(i).armynumber) {
				choosenparent=qualifiedasparent.get(i);
			}
		}
		
		choosenparent.armynumber = choosenparent.armynumber + player.additionalarmy;
		choosenchild.color=choosenparent.color;
		choosenchild.gofn++;
		choosenchild.armynumber=choosenparent.armynumber-1;
		choosenparent.armynumber=1;
		player.teritorylist.add(choosenchild);
		int i=0;
		while(i<player.teritorylist.size()) {
			if(choosenparent.number == player.teritorylist.get(i).number) {
				player.teritorylist.get(i).armynumber = choosenparent.armynumber;
				player.teritorylist.get(i).color = choosenparent.color;
				player.teritorylist.get(i).gofn = choosenparent.gofn;
				player.teritorylist.get(i).function = choosenparent.function;
				player.teritorylist.get(i).heuristic = choosenparent.heuristic;
			}
			i++;
		}
		i=0;
		while(i<player2.teritorylist.size()) {
			if(choosenchild.number == player2.teritorylist.get(i).number) {
				player2.teritorylist.remove(i);
			}
			i++;
		}
		
	}
}
