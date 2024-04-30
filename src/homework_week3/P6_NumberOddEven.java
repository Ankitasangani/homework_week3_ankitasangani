package homework_week3;

import java.util.Scanner;

public class P6_NumberOddEven {
    /**
     * Write a java program to input any number and find out if it’s odd or even
     */

    //Main method with scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();
        numberOddEven(number);
        scanner.close();
    }

    //Static method with params no return, If else condition
    public static void numberOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " number is even. ");
        } else {
            System.out.println(number + " number is odd.");
        }
    }
}
