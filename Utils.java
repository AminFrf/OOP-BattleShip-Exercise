public class Utils {

    public void printboard (char [][] board , int size){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                System.out.println(board[i][j] + " ");
            }//end of nested for
            System.out.println();
        }//end of first for
    }//end of printboard

}//end of class utils
