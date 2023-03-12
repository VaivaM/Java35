package homeworks;

import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {

        int[] myArray = new int[]{1789, 2035, 1899, 1456, 2013, 4458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

        for (int i = 0; i < myArray.length; i++) {
            System.out.print((myArray[myArray.length - i - 1]) + ", ");
        }

        System.out.println(Arrays.toString(myArray));
    }
}
