package aiRisk;

public class Player2 extends Player {
	
	 private static Player2 player;

     private Player2() {
    	 super(2,2,MainClass.player2Agent);
    }

    public static Player2 getPlayer() {
        if(player==null){
            player = new Player2();
        }
        return  player;
    }
}
