
package animalchess;


public class Game {
  
  public static final int HEIGHT = 6;
  
  public static final int WIDTH = 5;
  
  private Square[][] squares;
  
  private final Player p0;
  
  private final Player p1;

  public Game(Player p0, Player p1) {
    this.p0 = p0;
    this.p1 = p1;
  }
  
  public Player getPlayer(int playerNumber) {
    if (playerNumber > 1) throw new IllegalArgumentException("Player number can be 0 or 1");
    return playerNumber == 0 ? p0 : p1;
  }
  
  public Player getWinner() {
    if (p0.hasWon()) return p0;
    if (p1.hasWon()) return p1;
    return null;
  }
  
  public Square getSquare(int row, int col) throws IndexOutOfBoundsException {
    return squares[row][col];
  }
  
  public void setSquares(Square[][] squares) {
    this.squares = squares;
  }
  
}



