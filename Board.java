class Board {
  char[][] board;

  public Board() {
    char[][] b = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    board = b;
  }

  public boolean move_o(int i, int j) {
    return move(i, j, 'o');
  }

  public boolean move_x(int i, int j) {
    return move(i, j, 'x');
  }

  boolean move(int i, int j, char player) {
    if ((i < 0 || i > 2) || (j < 0 || j > 2)) {
      return false; // out of  bounds
    }
    if (board[i][j] != ' ') {
      return false; // already taken
    }
    board[i][j] = player;
    return true;
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
