import java.util.Scanner;

public class interaction {

    public void tryAgain(){
        System.out.println("invalid.  try again");
        //idk something else has to happen tho
    }
    public void choosePieceShape(){
        Scanner scan=new Scanner(System.in);
        System.out.println("type ONE (1) character to be your " +
                "piece (ie. x, o , 7, %");

        String p = scan.nextLine();

        if(p.length()==1) {
            char o = p.charAt(0);
        }
        else {
            System.out.println("invalid. try again.");
            choosePieceShape();
        }



    }//ends custom piece
}
