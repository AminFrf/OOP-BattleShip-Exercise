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
        this.shipCount = 0;
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
        int shipsize = ship.getSize();
        int [][] position = new int [shipsize][2];


            if (((row + 1) < size && (shipboard[row + 1][col] == '#' || shipboard[row + 1][col] == '@')) || ((row - 1) >= 0 && (shipboard[row - 1][col] == '#' || shipboard[row - 1][col] == '@'))) {
                return false;
            }//end of if

            if (((col + 1) < size && (shipboard[row][col + 1] == '#' || shipboard[row][col + 1] == '@')) || ((col - 1) >= 0 && (shipboard[row][col - 1] == '#' || shipboard[row][col - 1] == '@'))) {
                return false;
            }//end of if

        if(horizontal){
            if((col + shipsize)>size){
                return false;
            }//end of if
            for(int i = 0; i < shipsize; i++){
                if(shipboard[row][col] != '~'){
                    return false;
                }//end of if


                position[i][0] = row;
                position[i][1] = col;
                col++;
            }//end of for

        }//end of if
        else{
            if((row + shipsize)>size){
                return false;
            }//end of if
            for(int i = 0; i < shipsize; i++){
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
        int rownum = 0 ;
        char colnum  ;
        System.out.print("   ");
        for (int i = 65 ; i <(board.length+65); i++) {
            colnum = (char)i;
            System.out.print(colnum + " ");
        }
        System.out.println();
        for (int i = 0; i < board.length ; i++) {
            if(i<10){
                System.out.print(" ");
            }//end of if
            System.out.print(rownum + " ");
            for (int j = 0; j < board.length ; j++) {
                System.out.print(board[i][j] + " ");
            }//end of nested for
            System.out.println();
            rownum++;
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
