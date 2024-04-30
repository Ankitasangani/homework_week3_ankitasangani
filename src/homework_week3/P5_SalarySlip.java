package homework_week3;

import java.util.Scanner;

public class P5_SalarySlip {
    /**
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     * salary
     * HRA = basic salary 10%
     * DA = Basic salary 8%
     * TA = Basic salary 9%
     * PF= Basic salary 20%
     * Gross salary = basic salary + HRA + TA + DA –PF
     * Print in following format
     * _______________________________
     * | Salary Slip |
     * |______________________________|
     * | Employee Id : 2564 |
     * | Employee Name : Jay |
     * |______________________________|
     * | Basic Salary : 25000.0 |
     * | HRA 10% : 2500.0 |
     * | TA 8% : 2250.0 |
     * | DA 9% : 2000.0 |
     * | PF - 20& : 5000.0 |
     * |______________________________|
     * | Gross Salary : 26750.0 |
     * |===========================|
     */

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a employee id: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.println("Enter a Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        salarySlip(employeeId, employeeName, basicSalary);

        scanner.close();
    }

    //Static method with params no return
    public static void salarySlip(int employeeId, String employeeName, double basicSalary) {
        double hra = basicSalary * 0.10;
        double ta = basicSalary * 0.8;
        double da = basicSalary * 0.9;
        double pf = basicSalary * 0.20;
        double grossSalary = basicSalary + hra + ta + da - pf;

        //Print Salary Slip
        System.out.println("|_______________________________|");
        System.out.println("|          Salary Slip          |");
        System.out.println("|                               |");
        System.out.println("|_______________________________|");
        System.out.println("|Employee Id: " + employeeId + "              |");
        System.out.println("|Employee Name:  " + employeeName + "         |");
        System.out.println("|_______________________________|");
        System.out.println("|Basic Salary: " + basicSalary + "          |");
        System.out.println("|HRA 10%:   " + hra + "              |");
        System.out.println("|TA 8%:     " + ta + "             |");
        System.out.println("|DA 9%: " + da + "                 |");
        System.out.println("|PF - 20&   " + pf + "              |");
        System.out.println("|                               |");
        System.out.println("|_______________________________|");
        System.out.println("|Gross Salary:  " + grossSalary + "         |");
        System.out.println("|===============================|");

    }
}
