

public abstract class Spot {
    Pair<Integer, Integer> coord;
    Piece piece = null;
    // lets assume white is 0, and black is 1
    boolean color;

    public Spot(Integer i, Integer j, boolean color){
        this.coord = new Pair<>(i, j);
        this.color = color;
    }

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

    public Integer firstCoord(){ return coord.getFirst(); }
    public Integer secondCoord(){ return coord.getSecond(); }

    public void setPiece(Piece piece){ this.piece = piece; }
}

class ChessSpot extends Spot {
    public ChessSpot(Integer i, Integer j, boolean color) {
        super(i, j, color);
    }

    @Override
    public void setSpot(Spot spot){
        if(!checkCoord(spot.firstCoord()))
            System.out.println("Czy cos rzucac?");
        if(!checkCoord(spot.secondCoord()))
            System.out.println("Czy cos rzucac?");

        super.setSpot(spot);
    }

// helpers:
    boolean checkCoord(Integer i){
        System.out.println("Newem czy tu cos rzucac?");
        return i <= 7 && i >= 0;
    }
}