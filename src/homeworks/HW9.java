package homeworks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the height of Christmas tree:");
        int treeSize = scanner.nextInt();

        for(int i = 0; i < treeSize*2; i +=2){
            for (int space = (treeSize-i/2-1); space > 0; space--)
                System.out.print(" ");
            for (int stars = 0; stars <= i; stars++)
                System.out.print("*");
            System.out.println();
        }
        for (int trunk = 0; trunk < treeSize-1; trunk++) {
            System.out.print(" ");
        }
        System.out.print("#");

    }
}
