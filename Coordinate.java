public class Coordinate {

    String coor;
    public Coordinate(String coor ) {
        this.coor = coor;
    }//end of constructor

    public static boolean isValidCoordinate(String input , int size) {



        if (input.length() != 2 && input.length() != 3) {
            return false;
        }//end of if

        if(size<=10 &&  input.length()==3){
            return false;
        }//end of if

        if (input.length()==2){
            char[] xy = input.toCharArray();
            int col = xy[0] - 'A';
            int row = xy[1] - '0';
            if(row<0 || row>=size ||col<0 || col>=size){
                return false;
            }//end of if
        }//end of if

        if(input.length()==3){
            char[] xy = input.toCharArray();
            int col = xy[0] - 'A';
            int row1 = xy[1] - '0';
            int row2 = xy[2] - '0';
            int row = row1*10 + row2;
            if(row<0 || row>=size || col<0 || col>=size){
                return false;
            }//end of if
        }//end of if

        if(input.length() == 3) {


            char [] ch =  input.toCharArray();
            int checkrow1 = size/10 ;
            int col1 = ch[0] - 'A';
            int row1 = ch[1] - '0';
            int row2 = ch[2] - '0';


            if(checkrow1 == 1){
                int checkrow2 = size- 10 ;
                if(col1 >size || row2 > checkrow2 || row1 != 1){
                    return false;
                }//end of if
            }//end of if


            if(checkrow1 == 2){

                if(row1 != 1 && row1 != 2){
                    return false;
                }//end of if

                if(row1==1){
                    if( col1>size ){
                        return false;
                    }//end of if
                }//end of if

                if(row1 == 2){
                    int checkrow2 = size- 20 ;
                    if(col1>size || row2 > checkrow2 ){
                        return false;
                    }//end of if
                }//end of if

            }//end of if

                return true;
        }//end of if

        if(input.length() == 2) {

            char [] ch =  input.toCharArray();
            int col1 = ch[0] - 'A';
            int row1 = ch[1] - '0';

            if (size<=10) {

                if(row1>size || col1 > size){
                    return false;
                }//end of if

            }//end of if

            if(size>10){

                if(row1>9 || col1 > size){
                    return false;
                }//end of if

            }//end of if

        }//end of if
        return true;
    }//end of isvalidcoordinate

    public int [] coorxy(String input ) {
        if(input.length()==2) {
            char[] ch = input.toCharArray();
            int col = ch[0] - 'A';
            int row = ch[1] - '0';
            return new int[]{col, row};
        }
        else if(input.length() == 3) {
            char[] ch = input.toCharArray();
            int col = ch[0] - 'A';
            int row1 = ch[1] - '0';
            int row2 =  ch[2] - '0';
            return new int[]{col, row1 , row2};
        }
        return null;
    }//end of coorxy

}//end of class coordinate
