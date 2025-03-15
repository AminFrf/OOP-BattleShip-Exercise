import java.util.Scanner;

public class Game {

    public void start() {
        boolean playAgain;
        do {
            playGame();
            playAgain = askReplay();
        } while (playAgain);
    }//end of start

    private boolean askReplay() {
        System.out.println("Play again? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().equalsIgnoreCase("yes");
    }//end of askreplay

    private void playGame() {
        System.out.println("Game logic here...");
    }//end of playgame

}//end of class game
