package homework_week3;

import java.util.Scanner;

public class P16_NumberCheck {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * “ZERO”
     */

    //Main method with scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        double number = scanner.nextDouble();
        System.out.println(numberCheck(number));

        scanner.close();
    }

    //Static method with params, nested if else condition
    public static String numberCheck(double number) {
        if (number > 0) {
            return "The entered number is POSITIVE";
        } else if (number < 0) {
            return "The entered number is NEGATIVE";
        } else {
            return "The entered number is ZERO";
        }
    }
}
