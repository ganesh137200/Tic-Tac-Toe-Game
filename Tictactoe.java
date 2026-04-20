import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {

        // Create a 3x3 board
        char[][] board = new char[3][3];

        // Initialize board with '-'
        initializeBoard(board);

        // Display the board
        displayBoard(board);
    }

    // Function to initialize the board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Function to display the board
    public static void displayBoard(char[][] board) {
        System.out.println("Tic-Tac-Toe Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }
    }
}