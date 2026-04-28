import java.util.Random;

public class Tictactoe {

    // UC4: Convert slot to row & column
    public static int[] getRowCol(int slot) {
        int index = slot - 1;
        int row = index / 3;
        int col = index % 3;
        return new int[]{row, col};
    }

    // UC5: Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == ' ';
    }

    // UC6: Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC7: Computer random move
    public static void computerMove(char[][] board) {

        Random rand = new Random();
        boolean movePlaced = false;

        while (!movePlaced) {

            int slot = rand.nextInt(9) + 1; // 1–9

            int[] pos = getRowCol(slot);
            int row = pos[0];
            int col = pos[1];

            if (isValidMove(board, row, col)) {
                placeMove(board, row, col, 'O'); // Computer uses 'O'
                System.out.println("Computer chose slot: " + slot);
                movePlaced = true;
            }
        }
    }

    // Utility: print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', ' '}
        };

        computerMove(board);
        printBoard(board);
    }
}
