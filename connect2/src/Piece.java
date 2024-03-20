public class Piece {
    private char character;
    private String player;


    public Piece (char c, String p){
        character = c;
        player = p;
    }

    public char getCharacter() {
        return character;
    }

    public String getPlayer() {
        return player;
    }
}

