package aiRisk;

import java.util.ArrayList;

public class Minimax implements Agent{
	
	child c;
	ArrayList<child> children ;
	child minimaxchild;
	public void getchild(ArrayList<State> ar){
        ArrayList<State> g ;
        boolean childsExist=false;

        for(int i=0;i<ar.size();i++) {
            int j=0;
            while(j<ar.get(i).adjacentlist.size()) {
                g = new ArrayList<State>();
                for(int m=0;m<ar.size();m++) {
                    g.add(ar.get(m));
                }
                if(ar.get(i).color!=ar.get(i).adjacentlist.get(j).color&&
                        ar.get(i).armynumber>=ar.get(i).adjacentlist.get(j).armynumber) {
                    g.add(ar.get(i).adjacentlist.get(j));
                    c=new child(g, ar, 0);
                    for(int x =0;x<children.size();x++) {
                        if(child.checkChildEquality(c.statelist,children.get(x).statelist)) {
                            childsExist = true;
                        }
                    }
                        if(!childsExist)
                        {
                            children.add(c);
                        }
                        childsExist = false;
                }
                j++;
            }
        }
    }
	
	public child minimax(child ar,int depth,int alpha , int beta,boolean Maxplayer) {
		
		if(depth==0||ar.statelist.size()-1==27) {
			return ar;
		}
		else {
			if(Maxplayer==true) {
				int maxEval = Integer.MIN_VALUE;
				children = new  ArrayList<child>();
				getchild(ar.statelist);
				for(int i=0;i<children.size();i++) {
					int eval = minimax(children.get(i), depth-1, alpha, beta, false).hurestic;
					maxEval=Math.max(maxEval,eval);
					alpha=Math.max(alpha, eval);
					if(beta<=alpha) {
						break;
					}
					children.get(i).eval=maxEval;
				}
				for(int r=0;r<children.size();r++) {
					if(children.get(r).eval==maxEval) {
						minimaxchild = children.get(r);
						break;
					}
				}
				return minimaxchild;
			}else if(Maxplayer==false) {
				int minEval = Integer.MAX_VALUE;
				children = new  ArrayList<child>();
				getchild(ar.statelist);
				for(int i=0;i<children.size();i++) {
					int eval = minimax(children.get(i), depth-1, alpha, beta, true).hurestic;
					minEval=Math.min(minEval,eval);
					beta=Math.min(beta, eval);
					if(beta<=alpha) {
						break;
					}
					children.get(i).eval=minEval;
				}
				for(int r=0;r<children.size();r++) {
					if(children.get(r).eval==minEval) {
						minimaxchild = children.get(r);
						break;
					}
				}
				return minimaxchild;
			}
			return null;
		}
	}
	
	public void PlayStyle(Player player, Player player2) {
		
		ArrayList<State> hamo = new ArrayList<State>();
		ArrayList<State> hamo2 = new ArrayList<State>();
		c = new child(player.teritorylist,null, 0);
		player.AdditionalArmyNumber(player);
		hamo = minimax(c, 5, Integer.MIN_VALUE, Integer.MAX_VALUE, true).statelist;
		hamo = minimaxchild.statelist;
		if(children.isEmpty()) {
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
			for(int x=0;x<state.adjacentlist.size();x++) {
				if(state.armynumber>state.adjacentlist.get(x).armynumber&&state.color!=state.adjacentlist.get(x).color) {
					state.adjacentlist.get(x).armynumber = state.armynumber-1;
					state.armynumber = 1;
					state.adjacentlist.get(x).color = state.color;
					while(i<player.teritorylist.size()) {
						if(state.adjacentlist.get(x).number == player.teritorylist.get(i).number) {
							player.teritorylist.get(i).armynumber = state.adjacentlist.get(x).armynumber;
							player.teritorylist.get(i).color = state.adjacentlist.get(x).color;
							player.teritorylist.get(i).gofn = state.adjacentlist.get(x).gofn;
							player.teritorylist.get(i).function = state.adjacentlist.get(x).function;
							player.teritorylist.get(i).heuristic = state.adjacentlist.get(x).heuristic;
						}
						i++;
					}
				}
			}
			i=0;
			while(i<player2.teritorylist.size()) {
				if(hamo2.contains(player2.teritorylist.get(i))) {
					player2.teritorylist.remove(i);
				}
				i++;
			}
			return;	
		}
		int j=0;
		while(j<player.teritorylist.size()+1) {
			hamo2.add(hamo.get(j));
			j++;
		}
		int i=0;
		State temp = new State(0);
		hamo2.get(hamo2.size()-1).color = player.color;
		for(int d=0;d<hamo2.size()-1;d++) {
			if(hamo2.get(d).adjacentlist.contains(hamo2.get(hamo2.size()-1))) {
				temp =hamo2.get(d);
				break;
			}
		}
		hamo2.get(hamo2.size()-1).armynumber = temp.armynumber+player.additionalarmy-1;
		temp.armynumber = 1;
		player.teritorylist.add(hamo2.get(hamo2.size()-1));
		while(i<player.teritorylist.size()) {
			if(temp.number == player.teritorylist.get(i).number) {
				player.teritorylist.get(i).armynumber = temp.armynumber;
				player.teritorylist.get(i).color = temp.color;
				player.teritorylist.get(i).gofn = temp.gofn;
				player.teritorylist.get(i).function = temp.function;
				player.teritorylist.get(i).heuristic = temp.heuristic;
				
			}
			i++;
		}
		i=0;
		while(i<player2.teritorylist.size()) {
			if(hamo2.contains(player2.teritorylist.get(i))) {
				player2.teritorylist.remove(i);
			}
			i++;
		}
	}
}