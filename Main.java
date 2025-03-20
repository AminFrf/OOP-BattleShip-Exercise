import java.sql.SQLOutput;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        boolean sizeofboard = false ;
        Scanner input = new Scanner(System.in);
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⡿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⡇⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⣀⡤⡞⢫⡎⢸⢱⠀⠀⠻⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⣝⡒⣶⣶⣶⣾⡯⠟⠛⠁⠈⢳⣼⣸⠀⠀⠀⠈⠣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⠿⣟⣓⣒⣀⡤⠶⠚⠉⢹⣿⠀⠀⠀⠀⠀⠘⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣟⣿⢿⣶⠒⠒⠒⠒⠒⠲⠶⣶⠶⠶⠦⠼⢿⣦⣀⣀⣀⣀⣀⠀⠀⠈⠳⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠈⢣⡀⠀⠀⠀⠈⠳⣌⠉⠉⠉⠉⠙⢿⡷⠿⢶⡶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢆⠀⠀⠀⠀⠀⠀⠘⣆⠀⠀⠀⠀⠈⠳⡄⠀⠀⠀⠀⠙⢦⡀⠙⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⠀⠀⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⠙⢆⠀⠀⠀⠀⠈⢳⡀⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⠈⢣⠀⠀⠀⠀⠀⠈⣦⠀⠀⠀⠀⠀⠹⡀⠀⠙⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡆⠀⠀⠀⠀⠀⠀⠈⣧⠀⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⠀⢻⡄⠀⠈⠳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⢸⠀⠀⠀⠀⠀⠀⠸⣦⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠈⢧⠀⠀⠀⠈⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠘⡆⠀⡆⠀⠀⠀⠀⡟⡇⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀⢸⣆⠀⠀⠀⠀⠹⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡄⡇⠀⢰⠀⠀⠀⠀⣷⠃⡇⢠⡄⠀⠀⢸⢸⢠⡄⠀⠘⡟⣿⠀⠀⠀⠀⠀⢸⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠟⡿⠀⢸⢀⢀⠀⢠⡟⡔⡇⡌⡇⠀⠀⣺⢸⢸⣿⣰⢀⣧⡿⠀⠀⠀⣀⣴⡿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣤⣤⠤⢤⣤⣾⠀⡇⡀⡌⣸⣼⠀⣴⣿⡇⡇⣿⡇⡆⣀⣿⣿⣸⢹⣿⢸⣿⠀⢰⠒⠾⣿⣻⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⢿⡞⠛⣻⣿⣟⡛⠛⣻⡇⢸⢁⣿⡇⣿⣇⣤⣿⣿⢳⣿⢻⢳⣿⣹⣏⡇⣯⣿⠃⣼⣾⡤⢾⠁⠈⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⣾⣷⣲⣾⣿⣶⣾⢁⡞⣾⣾⣻⣿⣽⣿⠟⣏⣎⡟⣞⣾⣿⣿⢹⣼⣹⣿⣴⠟⠉⠀⣾⠀⢰⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⢯⣿⣿⣿⣻⣿⠃⡼⣹⢳⣿⣿⣽⣿⣿⣾⡘⣹⣽⣻⡿⣿⣣⣷⡿⠛⢻⡾⠷⣄⢀⣿⠀⢸⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡷⠶⠯⠿⣭⡾⢃⡞⣱⢟⣿⣿⣿⣻⣤⣤⣽⣿⡷⣧⣽⡿⢟⣉⡁⠀⠀⢨⢿⣶⣿⣿⠇⢀⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⣤⣼⣷⣤⣤⣼⣿⣗⣾⣤⣽⣊⣿⣿⣿⣿⢯⡤⠿⣿⣿⣿⡼⠷⠈⢃⣠⣤⣶⣿⣿⣿⢿⣿⠀⣸⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣍⠉⢹⣿⡿⣿⣿⠿⠿⠛⠛⢹⣯⢹⣿⡟⣆⢸⠿⣠⣿⣿⣻⠧⠖⠛⣿⠖⠋⣽⣿⢽⣶⣿⠣⣶⣿⠃⠀⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣷⣼⣿⣷⣿⣿⣶⣄⣀⣀⣀⣠⣤⣿⣿⠛⠿⠿⣛⣻⡷⠋⠀⠀⠀⣿⣶⢾⣿⠟⣫⢴⠏⢠⣿⢻⣧⣴⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢷⣤⣀⠀⠀⢀⣀⡉⠉⠉⠛⢛⣛⣿⠿⣿⣶⣾⣿⣩⣅⡤⠶⠶⠛⠉⠙⠛⣿⣛⣭⠏⢠⣿⠻⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢻⣟⡛⠛⠓⠒⠲⠲⠾⠿⠿⠿⠿⠛⠛⠛⠛⠛⠉⠁⠀⣀⣀⣠⣴⣞⡿⢽⣿⠃⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⠹⣿⡦⣄⣠⣠⣦⣤⣀⣀⣀⣀⣀⣀⣀⣤⣤⡤⠤⠶⠿⠛⣋⣿⣷⣶⡾⡁⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⡿⠋⣼⠿⣻⡿⣿⣻⣟⣦⣄⣀⣠⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣲⣾⣿⣟⣿⣿⠋⣠⣾⠯⢤⣄⡀⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢸⣿⣁⢸⡇⠈⣇⠀⣿⠛⣦⠙⢪⣷⠿⠛⠓⠒⠾⠷⣶⡶⠶⠶⢶⣶⣶⣶⣶⣟⣹⣯⣷⠞⢁⣴⠿⢿⡶⣄⡈⠙⣿⡍⠉⣙⡻⣶⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠈⢿⢿⠇⢿⣄⠘⠳⠽⠷⢯⡀⢹⣇⠀⠀⣀⡤⠤⠤⢤⣈⡛⢶⣞⠁⢀⣀⠀⠉⠻⠟⠡⠴⠛⠛⠛⠋⠛⢳⣍⠀⠸⣿⡄⠈⠛⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠷⣶⣤⣤⣼⠇⠈⠻⣦⣀⢹⣷⣶⠀⠀⠈⠉⠛⢿⣦⣼⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣏⢀⣾⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤\n" +
                "⢘⠀⠀⢙⡋⡉⠉⠉⢉⣉⣛⡏⣉⢉⠉⠉⠋⠉⠉⠉⣱⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣙");
        System.out.println();
        System.out.println();
        System.out.println("WELCOME TO BATTLESHIP!");
        System.out.print("PRESS THE ENTER BUTTON TO START THE GAME!");
        input.nextLine();

        System.out.println("1.SINGLE_PLAYER GAME");
        System.out.println("2.TWO_PLAYER GAME");
        boolean wrongchoice = false ;
        boolean wrongchoice2 = false;
        boolean wrongchoice3 = false;
        int choice = 0;
        int choice2 = 0;
        int choice3 = 0;


        while (!wrongchoice) {
            System.out.print("ENTER YOUR CHOICE : ");
            choice = input.nextInt();
            if (choice == 1 || choice == 2) {
                wrongchoice = true;
            }//end of if
            else{
                System.out.println("WRONG INPUT");
                wrongchoice = false;
            }//end of else
        }//end of while

        System.out.println();
        System.out.println();

        System.out.print("PLEASE ENTER THE SIZE BOARD (MIN = 5 && MAX = 26) : ");


        int size = 0 ;
        while(!sizeofboard) {
            size = input.nextInt();
            if(size<5 || size>26) {
                System.out.println("WRONG SIZE BOARD! ");
                System.out.print("PLEASE TRY AGAIN : ");
                sizeofboard = false;
            }//end of if
            else{
                sizeofboard = true;
            }//end of else
        }//end of while

        System.out.println("EACH PLAYER WILL HAVE " +(size/2 - 1 )+" SHIPS");
        System.out.println();
        System.out.println();
        Player p1 ;
        Player p2;
        AIPlayer aip2;


        if(choice == 1) {

            p1 = new Player(size);
            aip2 = new AIPlayer(size);

            System.out.println("PLACING SHIP FOR PLAYER 1 : ");
            System.out.println("DO YOU WANT TO PLACE YOUR SHIPS RANDOMLY OR MANUALLY ?");
            System.out.println("1.RANDOMLY");
            System.out.println("2.MANUALLY");

            while (!wrongchoice2) {
                System.out.print("ENTER YOUR CHOICE : ");
                choice2 = input.nextInt();
                if (choice2 == 1 || choice2 == 2) {
                    wrongchoice2 = true;
                }//end of if
                else{
                    System.out.println("WRONG INPUT");
                    wrongchoice2 = false;
                }//end of else
            }//end of while

            if(choice2 == 1) {
                for (int i = 0; i <(p1.getBoardsize()/2)-1 ; i++) {
                    p1.shipboard.ships[i].setSize(i+2);
                }//end of for
                for (int i = 0; i < (p1.getBoardsize()/2)-1; i++) {
                    ShipPlacer.placeShipRandomly(p1.getShipboard() , p1.shipboard.ships[i]  );
                }//end of for
            }//end of if
            else{
                for (int i = 0; i <(p1.getBoardsize()/2)-1 ; i++) {
                    p1.shipboard.ships[i].setSize(i+2);
                }//end of for
                for (int i = 0; i < (p1.getBoardsize()/2)-1; i++) {
                    ShipPlacer.placeShipmanual(p1.getShipboard() , p1.shipboard.ships[i]  );
                }//end of for
            }//end of else
//----------------------------------------------------------------
            System.out.println();
            System.out.println();

            Game game = new Game() ;
            game.start(p1,aip2);
        }//end of if
        else if(choice == 2) {

            p1 = new Player(size);
            p2 = new Player(size);
//--------------------------------------------------------------------
            System.out.println("PLACING SHIP FOR PLAYER 1 : ");
            System.out.println("DO YOU WANT TO PLACE YOUR SHIPS RANDOMLY OR MANUALLY ?");
            System.out.println("1.RANDOMLY");
            System.out.println("2.MANUALLY");

            while (!wrongchoice2) {
                System.out.print("ENTER YOUR CHOICE : ");
                choice2 = input.nextInt();
                if (choice2 == 1 || choice2 == 2) {
                    wrongchoice2 = true;
                }//end of if
                else{
                    System.out.println("WRONG INPUT");
                    wrongchoice2 = false;
                }//end of else
            }//end of while

            if(choice2 == 1) {
                for (int i = 0; i <(p1.getBoardsize()/2)-1 ; i++) {
                    p1.shipboard.ships[i].setSize(i+2);
                }//end of for
                for (int i = 0; i < (p1.getBoardsize()/2)-1; i++) {
                    ShipPlacer.placeShipRandomly(p1.getShipboard() , p1.shipboard.ships[i]  );
                }//end of for
            }//end of if
            else{
                System.out.println();
                System.out.println("YOU SHOULD PLACE " + (p1.getBoardsize()/2 - 1 )+ " SHIPS");
                System.out.println("BETTER BE CAREFUL NOT TO LET YOUR OPPONENT SEE ;D ");
                System.out.println();
                for (int i = 0; i <(p1.getBoardsize()/2)-1 ; i++) {
                    p1.shipboard.ships[i].setSize(i+2);
                }//end of for
                for (int i = 0; i < (p1.getBoardsize()/2)-1; i++) {
                    ShipPlacer.placeShipmanual(p1.getShipboard() , p1.shipboard.ships[i]  );
                }//end of for
            }//end of else
//----------------------------------------------------------------
            System.out.println();
            System.out.println();

            System.out.println("PLACING SHIP FOR PLAYER 2 : ");
            System.out.println("DO YOU WANT TO PLACE YOUR SHIPS RANDOMLY OR MANUALLY ?");
            System.out.println("1.RANDOMLY");
            System.out.println("2.MANUALLY");

            while (!wrongchoice3) {
                System.out.print("ENTER YOUR CHOICE : ");
                choice3 = input.nextInt();
                if (choice3 == 1 || choice3 == 2) {
                    wrongchoice3 = true;
                }//end of if
                else{
                    System.out.println("WRONG INPUT");
                    wrongchoice3 = false;
                }//end of else
            }//end of while

            if(choice3 == 1) {
                for (int i = 0; i <(p2.getBoardsize()/2)-1 ; i++) {
                    p2.shipboard.ships[i].setSize(i+2);
                }//end of for
                for (int i = 0; i < (p2.getBoardsize()/2)-1; i++) {
                    ShipPlacer.placeShipRandomly(p2.getShipboard() , p2.shipboard.ships[i]  );
                }//end of for
            }//end of if
            else{
                for (int i = 0; i <(p2.getBoardsize()/2)-1 ; i++) {
                    p2.shipboard.ships[i].setSize(i+2);
                }//end of for
                for (int i = 0; i < (p2.getBoardsize()/2)-1; i++) {
                    ShipPlacer.placeShipmanual(p2.getShipboard() , p2.shipboard.ships[i]  );
                }//end of for
            }//end of else

            System.out.println();
            System.out.println();


            Board.printboard(p1.getShipboard().getShipboard());
            System.out.println();
            System.out.println();
            Board.printboard(p2.getShipboard().getShipboard());

            Game game = new Game() ;
            game.start(p1 , p2 );

        }//end of else
    }//end of main
}//end of class Main
