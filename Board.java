import java.util.Random;

public class Board {
    private char[][] shipboard;
    private int size;

    public Board(int size) {
        this.size = size;
        this.shipboard = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                shipboard[i][j] = '~';
            }
        }
    }//end of constructor

    public boolean placeShip(Ship ship, int row, int col, boolean horizontal) {
        int size = ship.getSize();
        if(horizontal){
            for(int i = 0; i < size; i++){
                if(shipboard[row][col] != '~'){
                    return false;
                }//end of if
                else{
                    col++;
                }//end of else
            }//end of for
            return true;
        }//end of if
        else{
            for(int i = 0; i < size; i++){
                if(shipboard[row][col] != '~'){
                    return false;
                }//end of if
                else{
                    row++;
                }//end of else
            }//end of for
        }//end of else
        return true;
    }//end of placeship


    public int getSize() {
        return size;
    }//end of getter

}//end of class board
