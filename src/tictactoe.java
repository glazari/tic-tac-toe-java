class TicTacToe {
  public static void main(String[] args) {
    Board board = new Board();
    board.print();
    board.move_o(1, 2);
    board.print();
    board.move_x(0, 0);
    board.print();
  }
}
