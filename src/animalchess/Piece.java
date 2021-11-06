
package animalchess;

import java.util.ArrayList;
import java.lang.*;


abstract public class Piece {
  
  protected Player owner;
  
  protected Square square;
  
  protected ArrayList<Square> legalMoves;
  
  public Piece(Player owner, Square square) {
    this.owner = owner;
    this.square = square;
  }
  
  public ArrayList<Square> getLegalMoves() 
  {
    Game game = square.getGame();
    int row = square.getRow();
    int col = square.getCol();
   
    if(this instanceof Lion)
    {   
        if(owner.getPlayerNumber() == 1)
        {
        //forward move
        legalMoves.add(game.getSquare(row-1, col));
        //forward left
        legalMoves.add(game.getSquare(row-1, col-1));
        //forward right
        legalMoves.add(game.getSquare(row-1, col+1));
        //side left
        legalMoves.add(game.getSquare(row,col-1));
        //side right 
        legalMoves.add(game.getSquare(row,col+1));
        //backward move
        legalMoves.add(game.getSquare(row+1, col));
        //backward left
        legalMoves.add(game.getSquare(row+1,col-1));
        //backward right
         legalMoves.add(game.getSquare(row+1,col+1));
        }else
        {
            //forward move
        legalMoves.add(game.getSquare(row+1, col));
        //forward left
        legalMoves.add(game.getSquare(row+1, col-1));
        //forward right
        legalMoves.add(game.getSquare(row+1, col+1));
        //side left
        legalMoves.add(game.getSquare(row,col-1));
        //side right 
        legalMoves.add(game.getSquare(row,col+1));
        //backward move
        legalMoves.add(game.getSquare(row-1, col));
        //backward left
        legalMoves.add(game.getSquare(row-1,col-1));
        //backward right
         legalMoves.add(game.getSquare(row-1,col+1));
        }
    }
    
    if(this instanceof Giraffe)
    {
        if(owner.getPlayerNumber() == 1)
        {
           //forward move
           legalMoves.add(game.getSquare(row-1, col));
           //side left
           legalMoves.add(game.getSquare(row,col-1));
           //side right 
           legalMoves.add(game.getSquare(row,col+1));
           //backward move
           legalMoves.add(game.getSquare(row+1, col));  
        }else
        {
           //forward move
           legalMoves.add(game.getSquare(row+1, col));
           //side left
           legalMoves.add(game.getSquare(row,col-1));
           //side right 
           legalMoves.add(game.getSquare(row,col+1));
           //backward move
           legalMoves.add(game.getSquare(row-1, col));
           
        }
        
        if(this instanceof PromotablePiece)
        {   
            if(this instanceof Chick)
            {
                PromotablePiece chick = new Chick(owner,square);
                if(chick.getIsPromoted())
                {
                    if(owner.getPlayerNumber() == 1)
                    {
                       //forward move
                       legalMoves.add(game.getSquare(row-1, col));
                       //side left
                       legalMoves.add(game.getSquare(row,col-1));
                       //side right 
                       legalMoves.add(game.getSquare(row,col+1));
                       //backward move
                       legalMoves.add(game.getSquare(row+1, col));
                       //backward left
                       legalMoves.add(game.getSquare(row+1,col-1));
                       //backward right
                       legalMoves.add(game.getSquare(row+1,col+1));
                    }else
                    {
                        //forward move
                        legalMoves.add(game.getSquare(row+1, col));
                        //side left
                        legalMoves.add(game.getSquare(row,col-1));
                        //side right 
                        legalMoves.add(game.getSquare(row,col+1));
                        //backward move
                        legalMoves.add(game.getSquare(row-1, col));
                        //backward left
                        legalMoves.add(game.getSquare(row-1,col-1));
                        //backward right
                        legalMoves.add(game.getSquare(row-1,col+1));
                    }
                }
                else{
                    if(owner.getPlayerNumber() == 1)
                        //forward move
                       legalMoves.add(game.getSquare(row-1, col));
                    else
                        //forward move
                        legalMoves.add(game.getSquare(row+1, col));
                }
            }
            
            if(this instanceof Cat)
            {
                PromotablePiece cat = new Cat(owner,square);
                if(cat.getIsPromoted())
                {
                    if(owner.getPlayerNumber() == 1)
                    {
                       //forward move
                       legalMoves.add(game.getSquare(row-1, col));
                       //side left
                       legalMoves.add(game.getSquare(row,col-1));
                       //side right 
                       legalMoves.add(game.getSquare(row,col+1));
                       //backward move
                       legalMoves.add(game.getSquare(row+1, col));
                       //backward left
                       legalMoves.add(game.getSquare(row+1,col-1));
                       //backward right
                       legalMoves.add(game.getSquare(row+1,col+1));
                    }else
                    {
                        //forward move
                        legalMoves.add(game.getSquare(row+1, col));
                        //side left
                        legalMoves.add(game.getSquare(row,col-1));
                        //side right 
                        legalMoves.add(game.getSquare(row,col+1));
                        //backward move
                        legalMoves.add(game.getSquare(row-1, col));
                        //backward left
                        legalMoves.add(game.getSquare(row-1,col-1));
                        //backward right
                        legalMoves.add(game.getSquare(row-1,col+1));
                    }
                }
                else{
                    if(owner.getPlayerNumber() == 1)
                    {
                        //forward move
                       legalMoves.add(game.getSquare(row-1, col));
                       //forward left
                        legalMoves.add(game.getSquare(row-1, col-1));
                        //forward right
                        legalMoves.add(game.getSquare(row-1, col+1));
                        //backward left
                        legalMoves.add(game.getSquare(row+1,col-1));
                        //backward right
                        legalMoves.add(game.getSquare(row+1,col+1));
                    }
                    else{
                        //forward move
                        legalMoves.add(game.getSquare(row+1, col));
                       //forward left
                       legalMoves.add(game.getSquare(row+1, col-1));
                       //forward right
                       legalMoves.add(game.getSquare(row+1, col+1));
                       //backward left
                        legalMoves.add(game.getSquare(row-1,col-1));
                        //backward right
                        legalMoves.add(game.getSquare(row-1,col+1));
                    }
                }
            }
        }
    }
    
    return legalMoves;
    
  }
  
  public void move(Square toSquare) {
    
      for(Square s : legalMoves)
      {
          if(s.equals(toSquare) && !toSquare.hasPiece())
          {
            toSquare.placePiece(this);
            return;
          }      
      }
  }
  
  public void beCaptured(Player capturer) {
    owner = capturer;
  }
  
  public Square getSquare() {
    return square;
  }
  
  public Player getOwner() {
    return owner;
  }
  
}
