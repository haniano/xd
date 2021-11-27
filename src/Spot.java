

public abstract class Spot {
    Pair<Integer, Integer> coord;
    Piece piece;
    // lets assume white is 0, and black is 1
    boolean color;

    public Spot(Integer i, Integer j, Piece piece, boolean color){
        this.coord = new Pair<>(i, j);
        this.color = color;
        this.piece = piece;
    }
    public Spot getSpot(){ return this; }
    public void setSpot(Spot spot){
        this.coord = spot.coord;
        this.piece = spot.piece;
        this.color = spot.color;
    }
}

class ChessSpot extends Spot {

    public ChessSpot(Integer i, Integer j, Piece piece, boolean color) {
        super(i, j, piece, color);
    }
}