package homeworks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HW12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word:");

        String newWord = scanner.nextLine().toLowerCase().trim().replaceAll(" ","");
        boolean isPalindrome = true;

        for (int i = 0; i < newWord.length() / 2; i++){;
            if (newWord.charAt(i) != newWord.charAt(newWord.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome == true){
            System.out.printf("Your input %s is a palindrome \n", newWord);
        } else {
            System.out.printf("Your input %s is not a palindrome \n", newWord);
        }

    }
}
