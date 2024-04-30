package homework_week3;

import java.util.Scanner;

public class P2_LeapYear {
    /**
     * Write a java program to input any year like (ex.2007) and find out if it is leap year or
     * not?
     */

    //Main method calling Instance method, using scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:  ");
        int year = scanner.nextInt();
        P2_LeapYear leapYear = new P2_LeapYear();
        boolean isLeapYear = leapYear.leapYear(year);
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }

    //With return with params, it returns boolean type data
    public boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}



