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
                board.get(i).get(j).setSpot(getCorrectSpotChessInit(i, j));
        }
    }

// helpers
    Spot getCorrectSpotChessInit(int i, int j){
        boolean color = getCorrectColor(i, j);
        Spot spot = new ChessSpot(i, j, color);

        spot.setPiece(selectPiece(i, j));
        return spot;
    }

    boolean getCorrectColor(int i, int j){
        return (i + j)% 2 == 1;
    }

    Piece selectPiece(int i, int j){
        if(i == 1 || i == 6)
            return new Pawn();

        if(i == 0 || i == 7){
            if(j == 0 || j == 7)
                return new Rook();

            if(j == 1 || j == 6)
                return new Knight();

            if(j == 2 || j == 5)
                return new Bishop();

            if(j == 3)
                return new Queen();

            if(j == 4)
                return new King();
        }
        return null;
    }
}