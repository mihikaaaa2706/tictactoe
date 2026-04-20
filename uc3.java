import java.util.Scanner;

public class uc3 {

    static Scanner sc = new Scanner(System.in);

    // Method to take input
    public static int getPlayerMove() {
        int slot;

        while (true) {
            System.out.print("Enter slot (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                return slot; // valid input
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
            }
        }
    }

    public static void main(String[] args) {
        int move = getPlayerMove();
        System.out.println("You selected slot: " + move);
    }
}