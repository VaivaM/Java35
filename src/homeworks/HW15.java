package homeworks;

import java.util.Random;
import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose rock, paper or scissors:");
        String player1 = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

//        System.out.println("Please choose rock, paper or scissors:");
//        String player2 = scanner.nextLine().toLowerCase().trim().replaceAll(" ", "");

        String[] words = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String player2 = words[randomIndex];
        System.out.println("Computer:" + player2);

        rockPaperScissors(player1, player2);
    }
    public static String rockPaperScissors(String player1, String player2) {
        if (player1.equals(player2)) {
            System.out.println("TIE!");
        } else if (player1.equals("rock") && player2.equals("scissors") || player1.equals("scissors") && player2.equals("paper") || player1.equals("paper") && player2.equals("rock")){
            System.out.println("Player 1 wins!");
        } else
            System.out.println("Player 2 wins!");

        return player1;
    }
}
