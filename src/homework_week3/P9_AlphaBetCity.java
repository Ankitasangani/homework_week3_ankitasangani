package homework_week3;

import java.util.Scanner;

public class P9_AlphaBetCity {
    /**
     * Input any alphabet from A to “F” and print their city name accordingly (use if else) if
     * any other alphabet should be invalid entry
     * 9.Same as above program-8 using switch statement.
     */

    //Main method with scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a alphabet from A to F: ");
        char alphaBet = scanner.next().charAt(0);
        alphaBetCity(alphaBet);
        scanner.close();
    }

    //Static method with params, using switch statement
    public static void alphaBetCity(char alphaBet) {
        switch (alphaBet) {
            case 'A':
                System.out.println("City: Atlanta");
                break;
            case 'B':
                System.out.println("City: Brighton");
                break;
            case 'C':
                System.out.println("City: Canterbury");
                break;
            case 'D':
                System.out.println("City: Derby");
                break;
            case 'E':
                System.out.println("City: Edinburgh");
                break;
            case 'F':
                System.out.println("City: France");
                break;
            default:
                System.out.println("Invalid entry");

        }
    }

}
