import java.util.Random;
import java.util.Scanner;

public class Tictactoe {

    // UC4
    public static int[] getRowCol(int slot) {
        int index = slot - 1;
        return new int[]{index / 3, index % 3};
    }

    // UC5
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == ' ';
    }

    // UC6
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC7
    public static void computerMove(char[][] board) {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = getRowCol(slot);

            if (isValidMove(board, pos[0], pos[1])) {
                placeMove(board, pos[0], pos[1], 'O');
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    // UC8: Check win
    public static boolean checkWin(char[][] b, char s) {

        // rows & columns
        for (int i = 0; i < 3; i++) {
            if ((b[i][0] == s && b[i][1] == s && b[i][2] == s) ||
                (b[0][i] == s && b[1][i] == s && b[2][i] == s)) {
                return true;
            }
        }

        // diagonals
        return (b[0][0] == s && b[1][1] == s && b[2][2] == s) ||
               (b[0][2] == s && b[1][1] == s && b[2][0] == s);
    }

    // UC8: Check draw
    public static boolean isDraw(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }

    // Print board
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char currentPlayer = 'X'; // Human starts
        boolean gameOver = false;

        while (!gameOver) {

            printBoard(board);

            if (currentPlayer == 'X') {
                // Human move
                System.out.print("Enter slot (1-9): ");
                int slot = sc.nextInt();

                int[] pos = getRowCol(slot);

                if (isValidMove(board, pos[0], pos[1])) {
                    placeMove(board, pos[0], pos[1], 'X');
                } else {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }

            } else {
                // Computer move
                computerMove(board);
            }

            // Check win
            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println(currentPlayer + " wins!");
                gameOver = true;
            }
            // Check draw
            else if (isDraw(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                gameOver = true;
            }

            // Switch turn
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        sc.close();
    }
}
