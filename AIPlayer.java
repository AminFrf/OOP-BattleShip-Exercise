import java.util.Random;

public class AIPlayer extends Player {

    public String makeMove() {
        Random rand = new Random();
        return "" + (char) ('A' + rand.nextInt(10)) + rand.nextInt(10);
    }//end of makemove

}//end of class aiplayer
