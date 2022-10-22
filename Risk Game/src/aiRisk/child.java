package aiRisk;

import java.util.ArrayList;

public class child {
	ArrayList<State> statelist = new ArrayList<State>();
	int hurestic;
	ArrayList<State> parent = new ArrayList<State>();
	int eval;
	int function;
	int gofn;
	public child(ArrayList<State> g, ArrayList<State> parent,int go) {
		
		this.statelist=g;
		this.parent=parent;
		this.hurestic=heuresticforall(this.statelist);
		this.gofn=go;
		this.function=this.gofn+this.hurestic;
		
	}
	public int heuresticforall(ArrayList<State> h) {
		
		int sum=0;
		for(int i=0;i<h.size();i++) {
			sum=sum+heursticforoneelement(h.get(i));
		}
		
		return sum;
	}
	public int heursticforoneelement(State state) {
		
		int sum=0;
		for(int j=0;j<state.adjacentlist.size();j++) {

			if(state.color!=state.adjacentlist.get(j).color&&state.armynumber>=state.adjacentlist.get(j).armynumber) { 
				sum++;
			}
		}
		return sum;
		
	}
	public static boolean checkChildEquality (ArrayList<State> list1,ArrayList<State> list2) 
	{
	    int i=0;
	    int j=0;
	    int x=0;
	    if(list1.size()!=list2.size())
	    {
	        return false;
	    }
	    for(i=0;i<list1.size();i++) {
	        for(j=0;j<list2.size();j++) {
	            if(list1.get(i)==list2.get(j)) {
	                x++;
	            }
	        }
	    }
	    if(x==list1.size()) {
	        return true;
	    }
	    return false;
	}
}
