import java.util.Random;
import java.util.Scanner;

public class AIPlayer extends Player {


    public AIPlayer(int boardsize){
     super(boardsize);
    }//end of constructor

    public String makeMove() {
        Random rand = new Random();
        return "" + (char) ('A' + rand.nextInt(getBoardsize())) + rand.nextInt(getBoardsize());
    }//end of makemove

    public void aiattack(Player opponent) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR TARGET (FOR EXAMPLE A5): ");
        String input = makeMove();
        Coordinate coor = new Coordinate(input);
        boolean nvl = Coordinate.isValidCoordinate(input , opponent.getBoardsize());
        while (!nvl) {
            System.out.println("WRONG INPUT !!! ");
            System.out.println("PLEASE TRY AGAIN : ");
            input = makeMove();
            nvl = Coordinate.isValidCoordinate(input , opponent.getBoardsize());
        }//end of while
        int[] xy = coor.coorxy(input);
        int row = xy[1];
        int col = xy[0];

        char[][] opponentShipboard = opponent.getShipboard().getShipboard();
        char[][] myTrackingBoard =getAttackingBoard().getShipboard();

        if (opponentShipboard[row][col] == '~') {
            myTrackingBoard[row][col] = 'O';
            System.out.println("MISS");
        }//end of if
        else if (opponentShipboard[row][col] == '#' || opponentShipboard[row][col] == '@') {
            opponentShipboard[row][col] = '*';
            myTrackingBoard[row][col] = 'X';
            System.out.println("HIT!!!");
        }// end of else if
        else if  (myTrackingBoard[row][col] == 'X' || myTrackingBoard[row][col] == 'O') {
            System.out.println("DUPLICATE COORDINATES!!!");
            System.out.println("YOU LOST YOUR TURN :( ");
            System.out.println();
        }//end of else if

    }//end of aiattack

}//end of class aiplayer
