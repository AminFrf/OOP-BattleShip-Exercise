public class Coordinate {

    String coor;
    public Coordinate(String coor ) {
        this.coor = coor;
    }//end of constructor

    public static boolean isValidCoordinate(String input) {
        if (input.length() != 2) return false;
        char col = input.charAt(0);
        char row = input.charAt(1);
        return (col >= 'A' && col <= 'J') && (row >= '0' && row <= '9');
    }//end of isvalidcoordinate

    public int [] coorxy(String input ) {
        char[] ch = input.toCharArray();
        int col =ch[0] - 'A';
        int row =ch[1] - '0';
        return  new int [] {col , row};
    }//end of coorxy

}//end of class coordinate
