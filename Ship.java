public class Ship {

    private int size ;
    private boolean issunk;
    private int hitcount ;
    private int [][] position ;
    private int [][] shipposition ;

    public Ship(int size){
        this.size = size;
        issunk = false;
        hitcount = 0;
    }//end of constructor

    public void setPosition(int[][] position){
        this.position = position;
    }//end of setposition

    public static boolean allshipssunk(char [][] board){
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == '#' ||  board[i][j] == '@'){
                    return false;
                }//end of if
            }//end of nested for
        }//end of for
        return true;
    }//end of allshipssunk

    public boolean IsSunk(){
        if(size == hitcount){
            return true;
        }//end of issunk
        return false;
    }//end of issunk

    public boolean isAtPosition(int row , int col){
        for (int i = 0; i < position.length; i++) {
            if(position[i][0] == row && position[i][1] == col){
                return true;
            }//end of if
        }//end of for
        return false;
    }//end of isatposition

    public void hit(){
        hitcount++;
    }//end of hit

    public int getHitcount(){
        return hitcount;
    }//end of getter

    public int getSize(){
        return size;
    }//end of getter
    public void setSize(int size){
        this.size = size;
    }//end of setter
}//end of class ship
