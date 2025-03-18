import java.util.Scanner;

public class Game {


    public void start(Player p1 , Player p2 ) {
        boolean playAgain;
        do {
            playGame(p1 , p2);
            playAgain = askReplay();
        } while (playAgain);
    }//end of start

    public boolean isgameover(char[][] player1board, char[][] player2board) {
        return (Ship.allshipssunk(player1board) || Ship.allshipssunk(player2board) );
    }//end of isgameover

    private boolean askReplay() {
        System.out.println("Play again? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().equalsIgnoreCase("yes");
    }//end of askreplay

    private void playGame(Player p1, Player p2) {
        System.out.println("Game logic here...");
        boolean player1turn = true ;
        while(!isgameover(p1.getShipboard().getBoardArray(), p2.getShipboard().getBoardArray())) {
        if(player1turn){
            System.out.println("PLAYER 1'S TURN : ");
            Board.printboard(p2.getAttackingBoard().getBoardArray());
            p1.attack(p2);
        }//end of if
            else{
                System.out.println("PLAYER 2'S TURN : ");
                Board.printboard(p1.getAttackingBoard().getBoardArray());
                p2.attack(p1);
        }//end of else
            player1turn = !player1turn;
        }//end of while
    }//end of playgame

}//end of class game
