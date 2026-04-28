import java.util.Scanner;

public class Tictactoe {

    // Utility method to convert slot to row & column
    public static int[] getRowCol(int slot) {

        if (slot < 1 || slot > 9) {
            System.out.println("Invalid slot! Enter number between 1-9.");
            return null;
        }

        int index = slot - 1;     // zero-based index
        int row = index / 3;      // row calculation
        int col = index % 3;      // column calculation

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        int[] position = getRowCol(slot);

        if (position != null) {
            System.out.println("Row: " + position[0]);
            System.out.println("Column: " + position[1]);
        }

        sc.close();
    }
}
