public class Ticytactoe {

    // UC5: Validate move (reuse this)
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == ' ';
    }

    // UC6: Place move on board
    public static void placeMove(char[][] board, int row, int col, char symbol) {

        if (isValidMove(board, row, col)) {
            board[row][col] = symbol;
            System.out.println("Move placed successfully!");
        } else {
            System.out.println("Invalid move. Cannot place symbol.");
        }
    }

    // Utility to print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Initialize empty board
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // Example move
        int row = 1;
        int col = 1;
        char symbol = 'X';

        placeMove(board, row, col, symbol);

        // Print updated board
        printBoard(board);
    }
}
