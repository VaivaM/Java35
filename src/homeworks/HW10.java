package homeworks;

import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {

        int[] myArray = new int[]{1789, 2035, 1899, 1456, 2013, 4458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        System.out.println("Origin array: " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }

        System.out.println("Reversed Array:" + Arrays.toString(myArray));
    }
}
