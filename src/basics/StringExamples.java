package basics;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = scanner.nextLine().toUpperCase().trim;

        // name == "Bob"
        if (name.equals("Bob")){
            System.out.println("Your name is Bob");
        }else {
            System.out.println("Your name is not Bob");
        }*/

        //Combine string values
        String text1 = "This is ";
        String text2 = "new text";
//                          text1 + text2
        String result = text1.concat(text2);
        System.out.println(result);
        System.out.println("In this sentence there are " + result.length() + " characters");

        //indexOf
        System.out.println(result.indexOf(" is "));
        System.out.println(result.indexOf('x'));

        //charAt()
        System.out.println(result.charAt(0));
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(2));
        System.out.println(result.charAt(3));

        //Replace
        String greetings = "This is holiday time. \nHave a nice holiday";
        System.out.println(greetings.replaceAll("holiday","Christmas"));
        System.out.println(greetings.replaceFirst("holiday","Easter"));
        System.out.println(greetings.replaceAll("nice holiday", "nice Easter"));





    }
}
