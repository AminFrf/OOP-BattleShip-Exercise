import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {


    public void start(Player p1 , Player p2 ) {
        boolean playAgain;
        do {
            playGame(p1 , p2);
            playAgain = askReplay();
        } while (playAgain);
    }//end of start

    public void aistart(Player p1 , AIPlayer p2 ) {
        boolean playAgain;
        do {
            aiplayGame(p1 , p2);
            playAgain = askReplay();
        } while (playAgain);
    }//end of aistart


    public boolean isgameover(char[][] player1board, char[][] player2board) {
        return (Ship.allshipssunk(player1board) || Ship.allshipssunk(player2board) );
    }//end of isgameover

    private boolean askReplay() {
        System.out.println("PLAY AGAIN? (YES/NO)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().equalsIgnoreCase("YES");
    }//end of askreplay

    private void playGame(Player p1, Player p2) {
        System.out.println("*********************");
        System.out.println("  GAME LOGIC HERE...  ");
        System.out.println("*********************");
        System.out.println();
        System.out.println();
        boolean player1turn = true ;
        while(!isgameover(p1.getShipboard().getBoardArray(), p2.getShipboard().getBoardArray())) {
        if(player1turn){
            System.out.println("PLAYER 1'S TURN : ");
            Board.printboard(p1.getAttackingBoard().getBoardArray());
            p1.attack(p2);
        }//end of if
            else{
                System.out.println("PLAYER 2'S TURN : ");
                Board.printboard(p2.getAttackingBoard().getBoardArray());
                p2.attack(p1);
        }//end of else
            player1turn = !player1turn;
        }//end of while
        System.out.println();
        System.out.println("*******************************************************");
        boolean winner = true ;
        for (int i = 0; i < p1.getBoardsize(); i++) {
            for (int j = 0; j < p1.getBoardsize(); j++) {
                if (p1.getShipboard().getBoardArray()[i][j] == '#' || p1.getShipboard().getBoardArray()[i][j] == '@') {
                    winner = false;
                    break;
                }//end of if
            }//end of nestedfor
            if(winner==false) {
                break;
            }//end of if
        }//end of for
        if(winner==true) {
            System.out.println("CONGRATULATIONS!!!");
            System.out.println("PLAYER 1 , WON THE  GAME!!!");
        }//end of if
        else {
            System.out.println("CONGRATULATIONS!!!");
            System.out.println("PLAYER 2 , WON THE  GAME!!!");
        }//END OF ELSE
        System.out.println("*******************************************************");
        System.out.println();
    }//end of playgame

    private void aiplayGame(Player p1, AIPlayer p2) {
        System.out.println("GAME LOGIC HERE...");
        boolean player1turn = true ;
        while(!isgameover(p1.getShipboard().getBoardArray(), p2.getShipboard().getBoardArray())) {
            if(player1turn){
                System.out.println("PLAYER 1'S TURN : ");
                Board.printboard(p1.getAttackingBoard().getBoardArray());
                p1.attack(p2);
            }//end of if
            else{
                System.out.println("PLAYER 2'S TURN : ");
                Board.printboard(p2.getAttackingBoard().getBoardArray());
                p2.aiattack(p1);
            }//end of else
            player1turn = !player1turn;
        }//end of while
        System.out.println();
        System.out.println("*******************************************************");
        boolean winner = true ;
        for (int i = 0; i < p1.getBoardsize(); i++) {
            for (int j = 0; j < p1.getBoardsize(); j++) {
                if (p1.getShipboard().getBoardArray()[i][j] == '#' || p1.getShipboard().getBoardArray()[i][j] == '@') {
                    winner = false;
                    break;
                }//end of if
            }//end of nestedfor
            if(winner==false) {
                break;
            }//end of if
        }//end of for
        if(winner==true) {
            System.out.println("CONGRATULATIONS!!!");
            System.out.println("PLAYER 1 , WON THE  GAME!!!");
        }//end of if
        else {
            System.out.println("DID YOU REALY LOSE TO A DUMB AI ???");
            System.out.println("PLAYER 2 , WON THE  GAME!!!");
        }//END OF ELSE
        System.out.println("*******************************************************");
        System.out.println();

    }//end of aiplaygame

}//end of class game
