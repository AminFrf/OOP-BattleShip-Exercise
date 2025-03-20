public class Coordinate {

    String coor;
    public Coordinate(String coor ) {
        this.coor = coor;
    }//end of constructor

    public static boolean isValidCoordinate(String input , int size) {

        if (input.length() != 2 && input.length() != 3) {
            return false;
        }//end of if

        if(size<10 &&  input.length()==3){
            return false;
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
                    if( col1>size || row2 > size ){
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

          /*  if((col1 >= 'A' && col1 <= 'z') && (row1 =='1' || row1 <= '2') && (row2 >= '0' && row2 <= '9')){*/
                return true;
            /*}//end of if*/
        }//end of if

        if(input.length() == 2) {

            char [] ch =  input.toCharArray();
            int col1 = ch[0] - 'A';
            int row1 = ch[1] - '0';

            if (size<10) {

                if(row1>size || col1 > size){
                    return false;
                }//end of if

            }//end of if

            if(size>10){

                if(row1>9 || col1 > size){
                    return false;
                }//end of if

            }//end of if
            /*
            if ((col1>size)||(row1>size) ){
                return false;
            }//end of if
            char col = input.charAt(0);
            char row = input.charAt(1);
            return (col >= 'A' && col <= 'z') && (row >= '0'  && row <= '9');*/
        }//end of if
        return true;
    }//end of isvalidcoordinate

    public int [] coorxy(String input ) {
        char[] ch = input.toCharArray();
        int col =ch[0] - 'A';
        int row =ch[1] - '0';
        return  new int [] {col , row};
    }//end of coorxy

}//end of class coordinate
