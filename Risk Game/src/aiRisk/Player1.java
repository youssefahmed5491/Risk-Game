package aiRisk;

public class Player1 extends Player{
	
		    private static Player1 player;

		     private Player1() {
		    	 super(1,1,MainClass.player1Agent);
		    }

		    public static Player1 getPlayer() {
		        if(player==null){
		            player = new Player1();
		        }
		        return  player;
	
	}
}
