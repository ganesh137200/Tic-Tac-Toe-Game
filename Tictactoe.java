import java.util.Scanner;

public class Tictactoe {

    public static void main(String[] args) {

        int slot = getUserInput();

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    // Method to get user input
    public static int getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }
}
