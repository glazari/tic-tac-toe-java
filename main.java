class HelloWorld {

  public static void main(String[] args) {
    char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    board[0][0] = 'x';
    printBoard(board);
  }

  public static void printBoard(char[][] board) {
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
  }
}
