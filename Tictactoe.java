public class TicTacToe {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check boundaries
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid position! Row and column must be between 0 and 2.");
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            System.out.println("Cell already occupied!");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
                {'X', 'O', ' '},
                {' ', 'X', ' '},
                {'O', ' ', ' '}
        };

        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            System.out.println("Move is valid!");
        } else {
            System.out.println("Move rejected!");
        }
    }
}
