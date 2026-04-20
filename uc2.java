import java.util.Random;

public class uc2{

    public static void main(String[] args) {

        Random rand = new Random();

        int toss = rand.nextInt(2); // 0 or 1

        char player1Symbol, player2Symbol;
        String currentPlayer;

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = "Player 1";

            System.out.println("Player 1 starts!");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = "Player 2";

            System.out.println("Player 2 starts!");
        }

        System.out.println("Player 1 symbol: " + player1Symbol);
        System.out.println("Player 2 symbol: " + player2Symbol);
    }
}