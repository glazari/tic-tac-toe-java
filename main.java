class HelloWorld {

  public static void main(String[] args) {
    char[][] board = new char[3][3];
    board[0][0] = 'x';
    System.out.println(board[0][0] == 'x');
    System.out.println(board[0][1] == ' ');
    System.out.println(board[0][1] == ' ');
    printBoard();
  }

  public static void printBoard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(" x ");
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
