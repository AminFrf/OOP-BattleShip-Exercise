public class Coordinate {

    int x ;
    int y ;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }//end of constructor

    public static boolean isValidCoordinate(String input) {
        if (input.length() != 2) return false;
        char col = input.charAt(0);
        char row = input.charAt(1);
        return (col >= 'A' && col <= 'J') && (row >= '0' && row <= '9');
    }//end of isvalidcoordinate

    public void coorxy(String input) {
        char[] ch = input.toCharArray();
        int col = (int) ch[0];
        col = col - 65;
        int row = (int) ch[1];
        row = row - 48;
        x = col ;
        y = row;
    }//end of coorxy

}//end of class coordinate
