package homework_week3;

import java.util.Arrays;

public class P18_SumArray {
    /**
     * Write a Java program to sum values of an array.
     */

    // Main method
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        int sum = sumArray(numbers);
        System.out.println("Sum of the array: " + sum);

    }

    //Static method with return with params
    public static int sumArray(int[] array) {
        return Arrays.stream(array).sum();

    }
}
