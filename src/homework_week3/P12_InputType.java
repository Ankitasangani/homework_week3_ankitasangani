package homework_week3;

import java.util.Scanner;

public class P12_InputType {
    /**
     * Write a program that tells us input value is number or an alphabet or symbol.
     */
    //Main method with scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);
        inputType(character);
        scanner.close();
    }

    //Static method with params, nested if else condition
    public static void inputType(char character) {
        if (Character.isDigit(character)) {
            System.out.println("Input value is number");
        } else if (Character.isAlphabetic(character)) {
            System.out.println("Input value is alphabet");
        } else {
            System.out.println("Input value is symbol");
        }
    }

}
