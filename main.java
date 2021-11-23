class HelloWorld {

  public static void main(String[] args) {
    printBoard();
  }

  public static void printBoard() {
    System.out.println(" x | o |   ");
    System.out.println("___|___|___");
    System.out.println(" x | o |   ");
    System.out.println("___|___|___");
    System.out.println(" x | o |   ");
    System.out.println("   |   |   ");
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
