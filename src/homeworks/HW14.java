package homeworks;

import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the price?");
        int originalPrice = scanner.nextInt();

        System.out.println("What is the discount?");
        float  discount = scanner.nextFloat();

       // Discount method

        double finalPrice= ((100 - discount) * originalPrice)/100;
        System.out.println("discount (" + originalPrice + "," + discount + ") --> " + Math.round(finalPrice*100)/100f);

    }

}
