package aiRisk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AstarAgent implements Agent {
		
		Queue<State> queue = new LinkedList<>();
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
	                
	                return g2.function-g1.function; 
	            }
	       });
			
			for(int i=0;i<childofstate.size();i++) {
				
				temp = childofstate.get(i);
				for(int j=0;j<temp.adjacentlist.size();j++) {
					
					if(player.color!=temp.adjacentlist.get(j).color) { //we didn't compare with number of army in grandchild 
						temp.heuristic++;
					}
				}
				temp.function = temp.heuristic+temp.gofn;
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
		
		
//		child c;
//		ArrayList<child> children = new  ArrayList<child>();
//
//		public void getchild(child ar,Player player){
//		    ArrayList<State> g ;
//		    boolean childsExist=false;
//		   
//		    for(int i=0;i<ar.statelist.size();i++) {
//		        int j=0;
//		        while(j<ar.statelist.get(i).adjacentlist.size()) {
//		            g = new ArrayList<State>();
//		            for(int m=0;m<ar.statelist.size();m++) {
//		                g.add(ar.statelist.get(m));
//		            }
//		            if(ar.statelist.get(i).color!=ar.statelist.get(i).adjacentlist.get(j).color) {
//		                g.add(ar.statelist.get(i).adjacentlist.get(j));
//		                c=new child(g, ar.statelist, ar.gofn+1);
//		                for(int x =0;x<children.size();x++) {
//		                    if(child.checkChildEquality(c.statelist,children.get(x).statelist)) {
//		                        childsExist = true;
//		                    }
//		                }
//		                    if(!childsExist)
//		                    {
//		                        children.add(c);
//		                    }
//		                    childsExist = false;
//		            }
//		            j++;
//		        }
//		    }
//		}
//
//		public child Astar(Player player, Player player2) {
//			
//			ArrayList<child> Visited = new ArrayList<child>(); 
//			child c = new child(player.teritorylist,null,0);
//			int sa7lab =27;
//			PriorityQueue<child> priorityqueue = new PriorityQueue<>(new Comparator<child>() {
//		    
//				@Override
//				public int compare(child ch1, child ch2) {
//					return ch1.function-ch2.function;
//				}
//			});
//			priorityqueue.add(c);
//			while(sa7lab!=0) {
//				sa7lab--;
//				System.out.println("hhhhhhhhhhhhh");
//				boolean check=false;
//				child root = priorityqueue.remove();
//				if(root.statelist.size() == 27&&MainClass.country==0) {
//					check = true;
////					System.out.println("fffffffffffffffffffffff");
//					Visited.add(root);
//				}
//				if(root.statelist.size() == 48&&MainClass.country==1) {
//					check = true;
//					Visited.add(root);
//				}
//				System.out.println(check);
//				if(check==false&&sa7lab!=0) {
//					boolean check2 = false;
//					for(int i=0;i<Visited.size();i++) {
//						check2 = child.checkChildEquality(root.statelist, Visited.get(i).statelist);
//						if(check2==true) {
//							break;
//						}
//					}
//					if(check2==false) {
//						Visited.add(root);
////						ArrayList<child> children = new ArrayList<child>();
//						children.clear();
//						player.AdditionalArmyNumber(player);
//						getchild(root,player);
//						boolean check3=false;
////						System.out.println("rr"+children.size());
//						for(int i=0;i<children.size();i++) {
//							check3 = false;
//							for(int j=0;j<Visited.size();j++) {
//								check3 = false;
//								check3 = child.checkChildEquality(children.get(i).statelist ,Visited.get(j).statelist);	
//								if(check3==true) {
//									break;
//								}
//							}
//							if(check3==false) {
//								if(priorityqueue.isEmpty()) {
//									priorityqueue.add(children.get(i));
//								}
//								else {
//									boolean check4 = false;
//									for (child item: priorityqueue) {
//										check4 = false;
//										check4=child.checkChildEquality(children.get(i).statelist, item.statelist);
//										if(check4==true) {
//											break;
//										}
//									}
//									if(check4==false) {
//										priorityqueue.add(children.get(i));
//									}
//								}
//							}
//						}
//					}
//				}
//				else {
//					System.out.println("lol");
//					child temp;
//					int x=Visited.size()-1;
//					while(true) {
//						temp=Visited.get(x);
//						if(temp.parent==Visited.get(0).statelist) {
//							break;
//						}
//						for(int j=0;j<Visited.size();j++) {
//							if(Visited.get(j).statelist==temp.parent) {
//								temp=Visited.get(j);
//							}
//						}
//					}
//					return temp;
//				}
//			}
////			System.out.println("null");
//			return null;
//		}
//
//
//		public void PlayStyle(Player player, Player player2) {
//			
//			ArrayList<State> hamo = new ArrayList<State>();
////			ArrayList<State> hamo2 = new ArrayList<State>();
//			c = new child(player.teritorylist,null, 0);
//			player.AdditionalArmyNumber(player);
//			hamo = Astar(player, player2).statelist;
////			int j=0;
////			while(j<player.teritorylist.size()+1) {
////				hamo2.add(hamo.get(j));
////				j++;
////			}
//			int i=0;
//			State temp = new State(0);
//			hamo.get(hamo.size()-1).color = player.color;
//			for(int d=0;d<hamo.size()-1;d++) {
//				if(hamo.get(d).adjacentlist.contains(hamo.get(hamo.size()-1))) {
//					temp =hamo.get(d);
//					break;
//				}
//			}
//			hamo.get(hamo.size()-1).armynumber = temp.armynumber+player.additionalarmy-1;
//			temp.armynumber = 1;
//			player.teritorylist.add(hamo.get(hamo.size()-1));
//			while(i<player.teritorylist.size()) {
//				if(temp.number == player.teritorylist.get(i).number) {
//					player.teritorylist.get(i).armynumber = temp.armynumber;
//					player.teritorylist.get(i).color = temp.color;
//					player.teritorylist.get(i).gofn = temp.gofn;
//					player.teritorylist.get(i).function = temp.function;
//					player.teritorylist.get(i).heuristic = temp.heuristic;
//					
//				}
//				i++;
//			}
//			i=0;
//			while(i<player2.teritorylist.size()) {
//				if(hamo.contains(player2.teritorylist.get(i))) {
//					player2.teritorylist.remove(i);
//				}
//				i++;
//			}
//			
//		}
}