import java.util.ArrayList;

public abstract class Board {
    ArrayList<ArrayList<Spot>> board;
    abstract void setupBoard();
    Spot getSpot(int i, int j){
        return board.get(i).get(j);
    }
}


class ChessBoard extends Board{
    @Override
    void setupBoard() {
    }
}