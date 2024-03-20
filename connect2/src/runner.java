import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game connect = new Game();
        int turnCount = 0;

        //below tests the game features.  does not account for interaction
        Game test1=new Game();
        Game test2=new Game(6);
        Piece p1 = new Piece('x', "Player 1");
        Piece p2 = new Piece('o', "Player 2");
/*
        test2.displayBoardWithLabels();
        System.out.println("uigehiughertg3ewgivwebgiuweb");
        test1.displayBoardWithLabels();


 */
        test1.dropPiece(0,p1);
        test1.dropPiece(0,p2);
        test1.dropPiece(0,p1);
        test1.dropPiece(0,p2);
        test1.dropPiece(0,p1);

        test1.displayBoardWithLabels();
        test1.getWinner();

        //ends test


/*
        while (connect.getWinner() == null ){

            connect.displayBoardWithLabels();
            Piece currPiece;

            if(turnCount % 2 == 0){
                System.out.println("Player 1, choose your column");
                currPiece = p1;
            } else {
                System.out.println("Player 2, choose your column");
                currPiece = p2;
            }

            String response = scan.nextLine();
            int columnNumber = Integer.parseInt(response);
            connect.dropPiece(columnNumber, currPiece);
            turnCount++;
        }

        String winner = connect.getWinner();


        if ( !winner.equals("tie") ){
            System.out.println(("Congratulations, " + winner + "! You won in  " ) + (turnCount / 2) + " turns");
        } else {
            System.out.println("It's a tie!");
        }

 */
    }//ends main




}


