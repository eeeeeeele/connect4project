public class Game {
    private char[][] board;

    //this is the adjustable size
    public Game(int t){
        board = new char[2*t][2*t];
    }
    //this is the default
    public Game(){
        board = new char[8][8];
    }

    public char getBoard(int row, int c) {
        return board[row][c];
    }

    public char[][] getBoard() {
        return board;
    }

    //display board
    public void displayBoardWithLabels(){

        for(char[] e: board){
            System.out.print("| ");
            for(char d: e){
                if (d >0){
                    System.out.print(d+ " | ");
                }
                else {
                    System.out.print("  | ");
                }
            }
            System.out.println();

        }

    }
    //drop piece
    public void dropPiece(int n, Piece e){
        //row first
        int c=0;
        int r=0;
        if(n<board[0].length) {
            //note: this board goes DOWN UP
            //what if the board is full?
            for (int i = board.length - 1; i >= 0; i--) {
                if (board[i][n]=='\0') {
                    board[i][n] = e.getCharacter();
                    c++;
                }
                if (c!=0)
                    i=0;
                if(i==0 && r==board.length-2){
                    System.out.println("this column is full!");
                    //try again method
                }
                r++;
            }
        }

        else {
            System.out.println("column given is not in bounds");
            //METHOD TO LET PLAYER TRYAGAIN() IS TRIGGERED
        }

        //have to get char to drop

    }
    //get winner
    public String getWinner(){
        char e='\0';
        //loop below gets the first non null char
        for(int i=0; i< board.length-1;i++){
            for(int j=0; j<board[0].length-1;j++){
                if(board[i][j]>0){
                    e=board[i][j];
                    j=board.length+1;
                }
            }//ends mini loop
        }//ends loop
        if (e == '\0'){
            return "the board is empty.";
        }

        int c=0;
        //row first
        for(int i=0; i< board.length;i++){
            for(int j=0; j<board[0].length;j++){
                if (board[i][j]==e){
                    c++;
                }
            }//ends mini loop
        }//ends loop
        if (c==board.length/2){
            //the person with this char wins
        }

        return null;

    }


}
