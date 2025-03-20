import java.util.Random;
import java.util.Scanner;

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
        if(horizontal){
            char [][] shipgrid = board.getShipboard();
            int sizeofship = ship.getSize();
            for (int i = 0; i <  sizeofship; i++) {
                shipgrid[row][col] = '#';
                col++;
            }//end of for
        }//end of if
        else{
            char [][] shipgrid = board.getShipboard();
            int sizeofship = ship.getSize();
            for (int i = 0; i <  sizeofship; i++) {
                shipgrid[row][col] = '@';
                row++;
            }//end of for
        }//end of else
    }//end of placeshiprandomly

//horizontal ships with # & vertical ships with @

    public static void placeShipmanual(Board board, Ship ship) {
        int row = 0;
        int col = 0;
        boolean placed = false;
        char horv = ' ';
        boolean horizontal = true;
        Scanner scanner=new Scanner(System.in);

            while (!placed) {

                System.out.println("SIZE OF SHIP : " );
                System.out.println("WHICH ONE DO YOU PERFER ? VERTICAL 'V',  OR HORIZONTAL 'H' ?");
                boolean check = false ;
                while (!check) {
                    horv = scanner.next().charAt(0);
                    if (horv != 'V' && horv != 'H') {
                        System.out.println("WRONG INPUT !!!");
                        check = false ;
                    }//end of if
                    else {
                        check = true;
                    }//end of else
                }//end of while

                if (horv == 'H') {
                    horizontal = true;
                }//end of if
                else {
                    horizontal = false;
                }//end of else

                boolean isvalid = false;
                String input = "";

                while (!isvalid) {

                    Board.printboard(board.getShipboard());
                    System.out.println();
                    System.out.print("PLEASE ENTER THE COORDINATES OF THE FIRST PART OF THE SHIP : ");
                    input = scanner.next();

                    isvalid = Coordinate.isValidCoordinate(input, board.getSize());
                    if (!isvalid) {
                        System.out.println("WRONG INPUT !!!");
                    }//end of if
                }//end of while

                Coordinate coor = new Coordinate(input);
                int[] xy = coor.coorxy(input);
                col = xy[0];
                row = xy[1];
                placed = board.placeShip(ship, row, col, horizontal);
                if (!placed) {
                    System.out.println("WRONG INPUT !!!");
                    System.out.println("OVERLAPING WHITH OTHER SHIPS OR LEAVING THE BOARD AREA");
                }//end of if
            }//end of while
            if (horizontal) {
                char[][] shipgrid = board.getShipboard();
                int sizeofship = ship.getSize();
                for (int i = 0; i < sizeofship; i++) {
                    shipgrid[row][col] = '#';
                    col++;
                }//end of for
            }//end of if
            else {
                char[][] shipgrid = board.getShipboard();
                int sizeofship = ship.getSize();
                for (int i = 0; i < sizeofship; i++) {
                    shipgrid[row][col] = '@';
                    row++;
                }//end of for
            }//end of else
        System.out.println("DONE!");

    }//end of placeshipmanual
}//end of shipplacer
