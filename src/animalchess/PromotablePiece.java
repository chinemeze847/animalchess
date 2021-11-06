
package animalchess;

import java.util.ArrayList;


abstract public class PromotablePiece extends Piece {
  
  private boolean promoted = false;
  
  public PromotablePiece(Player owner, Square square) {
    super(owner, square);
  }
  
  public boolean getIsPromoted() {
    return promoted;
  }
  
  public void promote() {
    promoted = true;
  }
  
  @Override
  public void move(Square toSquare) 
  {
    ArrayList<Square> legalMoves = super.getLegalMoves();
     for(Square s : legalMoves)
      {
          if(s.getRow()== toSquare.getRow() && s.getCol() == toSquare.getCol())
          {
              if(toSquare.isPromotionZone(owner)){
                  this.promote();
              }    
              toSquare.placePiece(this);
              return;
          }       
      }
  }
  
  @Override
  public void beCaptured(Player capturer) {
    if (promoted) 
      promoted = false;
    else 
      owner = capturer;
  }
  
}


