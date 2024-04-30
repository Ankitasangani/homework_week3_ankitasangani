package homework_week3;

import java.util.Scanner;

public class P8_CityName {
    /**
     * Input any alphabet from “A to “F” and print their city name accordingly (use if else) 'if'
     * any other alphabet should be invalid entry
     */

    //Main method with scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a alphabet from A to F: ");
        char alphaBet = scanner.next().charAt(0);
        cityName(alphaBet);
        scanner.close();

    }

    //Static method with params no return, nested if else condition
    public static void cityName(char alphabet) {
        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("Atlanta");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("Brighton");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("Canterbury");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("Derby");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("Edinburgh");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("France");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
