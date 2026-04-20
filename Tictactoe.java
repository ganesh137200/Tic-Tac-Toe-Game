import java.util.Random;

public class Tictactoe {

    static char player1Symbol;
    static char player2Symbol;
    static int currentPlayer; // 1 or 2

    public static void main(String[] args) {

        // Perform toss and assign symbols
        tossAndAssign();

        // Display result
        displayGameSetup();
    }

    // UC2: Toss and assign symbols
    public static void tossAndAssign() {
        Random rand = new Random();

        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }
    }

    // Display the result of toss
    public static void displayGameSetup() {
        System.out.println("=== Game Setup ===");

        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);

        System.out.println("Player " + currentPlayer + " will start first!");
    }
}
