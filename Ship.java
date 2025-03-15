public class Ship {

    private int size ;
    private boolean issunk;
    private int hitcount ;
    private int [][] position ;

    public Ship(int size){
        this.size = size;
        issunk = false;
        hitcount = 0;
    }//end of constructor

    public boolean IsSunk(){
        if(size == hitcount){
            return true;
        }//end of issunk
        return false;
    }//end of issunk

    public int getSize(){
        return size;
    }
}//end of class ship
