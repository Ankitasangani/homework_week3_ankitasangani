package homework_week3;

import java.util.Scanner;

public class P1_OddEven {
    /**
     * Write a java program that tells us that Input number is odd or even?
     * HINT: use ternary operator  ? :)
     */

    //Main method calling static method, using scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:  ");
        int number = scanner.nextInt();
        String result = oddEven(number);
        System.out.println("The number is " + result + " . ");
        scanner.close();
    }


    //With return with params it, returns String type data
    public static String oddEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

}
