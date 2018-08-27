//package myrmidonChess;

public class PieceFactory{
    public Piece createPiece(String PieceType, String PieceColor){
        
        if (PieceType.equalsIgnoreCase("Triangle") & PieceColor.equalsIgnoreCase("Red")){
            return new Triangle("Red");
        } else if (PieceType.equalsIgnoreCase("Triangle") & PieceColor.equalsIgnoreCase("Blue")){
            return new Triangle("Blue");
        /*} else if (PieceType.equalsIgnoreCase("Sun") & PieceColor.equalsIgnoreCase("Red")){
            return new Sun("Red");
        } else if (PieceType.equalsIgnoreCase("Sun") & PieceColor.equalsIgnoreCase("Blue")){
            return new Sun("Blue");
        } else if (PieceType.equalsIgnoreCase("Chervon") & PieceColor.equalsIgnoreCase("Red")){
            return new Chervon("Red");
        } else if (PieceType.equalsIgnoreCase("Chervon") & PieceColor.equalsIgnoreCase("Blue")){
            return new Chervon("Blue");*/
        } else if (PieceType.equalsIgnoreCase("Plus") & PieceColor.equalsIgnoreCase("Red")){
            return new Plus("Red");
        } else if (PieceType.equalsIgnoreCase("Plus") & PieceColor.equalsIgnoreCase("Blue")){
            return new Plus("Blue");    
        } else {
            return null;
        }
    }
}
