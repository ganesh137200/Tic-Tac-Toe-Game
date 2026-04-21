import java.util.Scanner;

public class Tictactoe {

    public static void main(String[] args) {

        int slot = getUserInput();

        System.out.println("You selected slot: " + slot);
    }

    // Method to get user input
    public static int getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }
}
