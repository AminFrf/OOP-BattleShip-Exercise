import java.util.Random;
import java.util.Scanner;

public class Board {

    private char[][] shipboard;
    private char[][] trackingboard;
    private int size;
    Ship[] ships ;
    private int shipCount = 0 ;

    public Board(int size) {
        this.ships = new Ship[(size/2)-1];
        this.size = size;
        this.shipCount = (size/2)-1 ;
        this.shipboard = new char[size][size];
        this.trackingboard = new char[size][size];
        for (int i = 0; i < ships.length ; i++) {
            ships[i]=new Ship(i+2);
        }//end of for
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                shipboard[i][j] = '~';
                trackingboard[i][j] = '~';
            }//end of nested for
        }//end of for
    }//end of constructor


    public boolean placeShip(Ship ship, int row, int col, boolean horizontal) {
        int size = ship.getSize();
        int [][] position = new int [size][2];
        if(horizontal){
            for(int i = 0; i < size; i++){
                if(shipboard[row][col] != '~'){
                    return false;
                }//end of if
                position[i][0] = row;
                position[i][1] = col;
                col++;
            }//end of for
        }//end of if
        else{
            for(int i = 0; i < size; i++){
                if(shipboard[row][col] != '~'){
                    return false;
                }//end of if
                position[i][0] = row;
                position[i][1] = col;
                row++;
            }//end of for
        }//end of else
        ship.setPosition(position);
        ships[shipCount] =  ship;
        shipCount++;
        return true;
    }//end of placeship

    public void shipposition(int shipCount , Board shipboard){
        for (int i = 0; i < shipCount; i++) {

        }
    }//end of shipposition

    public static void printboard (char [][] board){
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                System.out.println(board[i][j] + " ");
            }//end of nested for
            System.out.println();
        }//end of first for
    }//end of printboard



    public char[][] getShipboard() {
        return shipboard;
    }//end of getter

    public char [][] getBoardArray(){
        return this.shipboard;
    }//end of getboardarray


    public int getSize() {
        return size;
    }//end of getter

}//end of class board
