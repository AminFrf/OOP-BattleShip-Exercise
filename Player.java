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
        System.out.println("PLEASE ENTER YOUR TARGET (FOR EXAMPLE A5): ");
        String input = scanner.next();
        Coordinate coor = new Coordinate(input);
        int[] xy = coor.coorxy(input);
        int row = xy[0];
        int col = xy[1];

        char[][] opponentShipboard = opponent.getShipboard().getShipboard();
        char[][] myTrackingBoard = this.attackingBoard.getShipboard();

        if (opponentShipboard[row][col] == '~') {
            myTrackingBoard[row][col] = 'O';
            System.out.println("MISS");
        } else if (opponentShipboard[row][col] == '#' || opponentShipboard[row][col] == '@') {
            opponentShipboard[row][col] = '*';
            myTrackingBoard[row][col] = 'X';
            System.out.println("HIT!!!");
        }
    }
}