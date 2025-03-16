import java.util.Random;

public class Board {

    private char[][] shipboard;
    private char[][] trackingboard;
    private int size;
    private Ship[] ships ;
    private int shipCount = 0 ;

    public Board(int size) {
        this.size = size;
        this.shipCount = size/2 ;
        this.shipboard = new char[size][size];
        this.trackingboard = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                shipboard[i][j] = '~';
                trackingboard[i][j] = '~';
            }
        }
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

    public void printboard (char [][] board , int size){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.println(board[i][j] + " ");
            }//end of nested for
            System.out.println();
        }//end of first for
    }//end of printboard

    public void attack(String input , char [][] shipboard , char [][] trackingboard){
        Coordinate coor = new Coordinate(input);
        int col ;
        int row ;
        int [] xy = coor.coorxy(input);
        col = xy[0];
        row = xy[1];
        if(shipboard[row][col] == '~'){
            trackingboard[row][col] = 'O';
            System.out.println("MISS");
        }//end of if
        else if (shipboard[row][col] == '#' || shipboard[row][col] == '@'){
            shipboard[row][col] = '*';
            trackingboard[row][col] = 'X';
            System.out.println("HIT !!!");

            for (int i = 0; i < shipCount ; i++) {
                if (ships[i].isAtPosition(row , col)) {
                    ships[i].hit();
                    if(ships[i].IsSunk()){
                        /*
                        if(trackingboard[row][col] == '#'){
                            if ((row + 1) < (size - 1) ) {
                                row++;
                               while(trackingboard[row-1][col] == 'X'){
                                   trackingboard[row][col] = 'O';
                                   col++;
                               }//end of while
                                for (int j = 0; j < 3; j++) {
                                    trackingboard[row][col] = 'O';
                                    row--;
                                    j++;
                                }//end of for
                                row--;
                                while(trackingboard[row+1][col] == 'X'){
                                    trackingboard[row][col] = 'O';
                                    col--;
                                }//end of while
                                col--;
                                for (int j = 0; j < 3; j++) {
                                    trackingboard[row][col] = 'O';
                                    row++;
                                    j++;
                                }//end of for
                                col++;
                                while(trackingboard[row][col] != 'X'){
                                    trackingboard[row][col] = 'O';
                                    col++;
                                }//end of while

                            }//end of if
                        }//end of if*/
                        System.out.println("CONGRATULATIONS ! YOU SUNK A SHIP");
                    }//end of if
                    break;
                }//end of if
            }//end of for
        }//end of else
    }//end of attack

    public char[][] getShipboard() {
        return shipboard;
    }//end of getter


    public int getSize() {
        return size;
    }//end of getter

}//end of class board
