import java.util.Random;

public class ShipPlacer {
    public static void placeShipRandomly(Board board, Ship ship) {
        int row = 0;
        int col = 0;
        boolean horizontal = true;
        Random rand = new Random();
        boolean placed = false;
        while (!placed) {
            row = rand.nextInt(board.getSize());
            col = rand.nextInt(board.getSize());
            horizontal = rand.nextBoolean();
            placed = board.placeShip(ship, row, col, horizontal);
        }//end of while

    }//end of placeshiprandomly

}//end of shipplacer
