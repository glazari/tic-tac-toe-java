class HelloWorld {
  public static void main(String[] args) {
    Board board = new Board();
    board.print();
    board.move_o(1, 2);
    board.print();
    board.move_x(0, 0);
    board.print();
  }
}

class Board {
  char[][] board;

  public Board() {
    char[][] b = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    board = b;
  }

  public void move_o(int i, int j) {
    move(i, j, 'o');
  }

  public void move_x(int i, int j) {
    move(i, j, 'x');
  }

  void move(int i, int j, char player) {
    board[i][j] = player;
  }

  public void print() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(" " + board[i][j] + " ");
        if (j < 2) {
          System.out.print("|");
        } else {
          System.out.println("");
        }
      }
      if (i < 2) {
        System.out.println("___|___|___");
      } else {
        System.out.println("   |   |   ");
      }
    }
    System.out.println("");
  }
}
