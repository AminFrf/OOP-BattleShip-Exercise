import java.util.Random;

public class AIPlayer extends Player {


    public AIPlayer(int boardsize){
     super(boardsize);
    }//end of constructor

    public String makeMove() {
        Random rand = new Random();
        return "" + (char) ('A' + rand.nextInt(getBoardsize())) + rand.nextInt(getBoardsize());
    }//end of makemove

}//end of class aiplayer
