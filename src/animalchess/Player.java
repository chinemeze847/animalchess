
package animalchess;

import java.util.ArrayList;


public class Player {
  
  private final String name;
  
  private final int playerNumber;
  
  private ArrayList<Piece> hand;
  
  public Player(String name, int playerNumber) {
    this.name = name;
    this.playerNumber = playerNumber;
  }
  
  public String getName() {
    return name;
  }
  
  public int getPlayerNumber() {
    return playerNumber;
  }
  
  public ArrayList<Piece> getHand() {
    return hand;
  }
  
      public void addPieceToHand(Piece piece) {
    hand.add(piece);
  }
  
  public void dropPiece(Piece piece, Square square) throws IllegalArgumentException {
    square.placePiece(piece);
  }
  
  public void winGame() 
  {
        
  }
  
  public boolean hasWon() {
    for(Piece p : hand) {
      if (p instanceof Lion)
        return true;
    }
    return false;
  }
  
}
