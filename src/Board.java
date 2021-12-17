import java.util.ArrayList;

public abstract class Board {
    ArrayList<ArrayList<Spot>> board;
    abstract public void setupBoard();
    public Spot getSpot(int i, int j){
        return board.get(i).get(j);
    }
}

class ChessBoard extends Board{
    @Override
    public void setupBoard() {
        for(int i = 0; i<8; i++){
            for(int j=0; j<8; j++)
                board.get(i).get(j).setSpot(getCorrectSpotInit(i, j));
        }
    }

// helpers
    Spot getCorrectSpotInit(int i, int j){
        boolean color = getCorrectColor(i, j);
        Spot spot = new ChessSpot(i, j, color);
        // TODO: madrze zakodzic to, jaka figurke zwraca, czy zostaje null
        spot.setPiece(new Piece());
        return spot;
    }

    boolean getCorrectColor(int i, int j){
        return (i + j)% 2 == 1;
    }
}