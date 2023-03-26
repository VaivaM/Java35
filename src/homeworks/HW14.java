package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {

        discount(100,45);
        discount(89,28);

    }

       // Discount method

    public static float discount (float originalPrice, float discount){
        DecimalFormat df = new DecimalFormat("0.00");
        discount /= 100;
        float result = originalPrice - (originalPrice * discount);
        System.out.println("Special price: " + df.format(result));
        System.out.printf("Special price: %.2f \n", result);
        return result;


//        double finalPrice= ((100 - discount) * originalPrice)/100;
//        System.out.println("discount (" + originalPrice + "," + discount + ") --> " + Math.round(finalPrice*100)/100f);

    }

}
