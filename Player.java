import java.util.Scanner;

public class Player {

    private Board attackingBoard;
    Board shipboard;
    private Ship[] ships;
    private int boardsize ;

    public Player(int boardsize) {
        this.boardsize = boardsize;
        this.attackingBoard = new Board(boardsize);
        this.shipboard = new Board(boardsize);
    }//end of constructor

    public Board getShipboard() {
        return shipboard;
    }//end of getter

    public Board getAttackingBoard() {
        return attackingBoard;
    }//end of getter

    public int getBoardsize() {
        return boardsize;
    }//end of getter

    public void attack(Player opponent) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR TARGET (FOR EXAMPLE A5): ");
        String input = scanner.next();
        Coordinate coor = new Coordinate(input);
        boolean nvl = Coordinate.isValidCoordinate(input , opponent.getBoardsize());
        while (!nvl) {
            System.out.println("WRONG INPUT !!! ");
            System.out.println("PLEASE TRY AGAIN : ");
            input = scanner.next();
            nvl = Coordinate.isValidCoordinate(input , opponent.getBoardsize());
        }//end of while
        int[] xy = coor.coorxy(input);
        int row = xy[1];
        int col = xy[0];

        char[][] opponentShipboard = opponent.getShipboard().getShipboard();
        char[][] myTrackingBoard = this.attackingBoard.getShipboard();

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
        }//end of else
    }//end of attack
}//end of class player