package homework_week3;

import java.util.Scanner;

public class P3_MarkSheet {
    /**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between, 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between, 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     * _______________________________
     * | |
     * | Mark Sheet |
     * |_______________________________|
     * | Name : Jay |
     * | Roll No: 08 |
     * |_______________________________|
     * | Subjects : Marks |
     * |_______________________________|
     * | Math : 98 |
     * | Science : 90 |
     * | English : 85 |
     * |_______________________________|
     * | Total : 273 |
     * |_______________________________|
     * | Percentage : 91.0 |
     * | Result : Pass |
     * | Grade : A+ |
     * |_______________________________|
     */


    //Main method calling Static method, using scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Student name:  ");
        String name = scanner.nextLine();
        System.out.println("Enter a Roll Number:   ");
        int rollNo = scanner.nextInt();
        System.out.println("Enter marks for Math, Science and English(separated by spaces): ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();

        //if it is out of range printing error message
        if (!markSheet(math) || !markSheet(science) || !markSheet(english)) {
            System.out.println("Invalid input. Marks should be between 0 to 100.");
            return;
        }

        String result = "Pass";
        if (math < 35 || science < 35 || english < 35) {
            result = ("Fail (One or more subjects have marks less than 35)");
        }

        int total = math + science + english;
        double percentage = (total / 3.0);
        String grade = calculateGrade(percentage);

        //Print Mark Sheet
        System.out.println("__________________________________");
        System.out.println("|                                 |");
        System.out.println("|         Mark Sheet              |");
        System.out.println("|_________________________________|");
        System.out.println("| Name : " + name + "                   |");
        System.out.println("| Roll No: " + rollNo + "                     |");
        System.out.println("|_________________________________|");
        System.out.println("| Subjects : Marks                |");
        System.out.println("|_________________________________|");
        System.out.println("| Math : " + math + "                       |");
        System.out.println("| Science : " + science + "                    |");
        System.out.println("| English : " + english + "                    |");
        System.out.println("|_________________________________|");
        System.out.println("| Total : " + total + "                     |");
        System.out.println("|_________________________________|");
        System.out.println("| Percentage : " + percentage + " |");
        System.out.println("| Result : " + result + "                   |");
        System.out.println("| Grade :  " + grade + "                      |");
        System.out.println("|_________________________________|");

        scanner.close();
    }


    // With return type with params, it returns boolean type data
    public static boolean markSheet(int marks) {
        return marks >= 0 && marks <= 100;

    }

    //Static method with return type with params, Nested if else condition
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "Fail";
        }
    }

}
