
package animalchess;


public class Square {
  
  private Game game;
  
  private Piece piece;
  
  private Player promotesPlayer;
  
  private int row;
  
  private int col;
  
  
  public Square(Game game, int row, int col) {
    this.row = row;
    this.col = col;
  }
  
  public Square(Game game, int row, int col, Player promotesPlayer) {
    this(game, row, col);
    this.promotesPlayer = promotesPlayer;
  }
  
  public void placePiece(Piece piece) throws IllegalArgumentException {
    this.piece = piece;
  }
  
  public void removePiece() {
    piece = null;
  }
  
  public boolean isPromotionZone(Player player) {
    return (player.getPlayerNumber() == 0 && row < 2) || (player.getPlayerNumber() == 1 && row > Game.HEIGHT-3);
  }
  
  public Game getGame() {
    return game;
  }
  
  public Piece getPiece() {
    return piece;
  }
  
  public int getRow() {
    return row;
  }
  
  public int getCol() {
    return col;
  }
  
  public boolean hasPiece()
  {
      if(this.getPiece().equals(null))
          return false;
      else
          return true;
  } 
}
