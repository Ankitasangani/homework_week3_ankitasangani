package homework_week3;

import java.util.Scanner;

public class P7_SalesCommission {
    /**
     * Write a java program input sales id, seller's name, sales amount, and salary basic and
     * then fined this sales
     * Commission
     * Sales amount >= 50,000 35%
     * Sales amount >= 30,000 20%
     * >= 20,000 10%
     * >= 10,000 5%
     * < 10,000 2%
     */

    //Main method with scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Sales id: ");
        int salesId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a seller's name: ");
        String sellerName = scanner.nextLine();
        System.out.println("Enter a sales amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.println("Enter a basic salary: ");
        double basicSalary = scanner.nextDouble();
        double commission = 0;
        salesCommission(salesId, sellerName, salesAmount, basicSalary);

        scanner.close();
    }

    //Static method with params no return, Nested If Else condition
    public static void salesCommission(int salesId, String sellerName, double salesAmount, double basicSalary) {
        double commission;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else
            commission = salesAmount * 0.02;


        double totalSalary = basicSalary + commission;

        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Sales Commission: " + commission);
        System.out.println("Total Salary: " + totalSalary);

    }
}
