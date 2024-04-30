package homework_week3;

import java.util.Scanner;

public class P10_EnterSymbol {
    /**
     * Write a java program to input any two number and ask user to enter their symbol (+, -,
     * /, *) find addition, Subtraction, multiplication and division according to their symbol
     * (using if else)
     */

    //Main method with scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter a second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter operational symbol(+, -, /, *): ");
        char symbol = scanner.next().charAt(0);
        enterSymbol(num1, num2, symbol);
        scanner.close();

    }

    //Static method with params, nested if else condition
    public static void enterSymbol(double num1, double num2, char symbol) {
        if (symbol == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (symbol == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (symbol == '/') {
            System.out.println("Result: " + (num1 / num2));
        } else if (symbol == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else {
            System.out.println("Invalid operator");
        }

    }

}


























