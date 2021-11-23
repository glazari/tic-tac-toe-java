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

  public static void allPrimes(int num) {
    for (int i = 0; i <= 100; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }

    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
