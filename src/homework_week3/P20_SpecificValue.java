package homework_week3;

import java.util.Arrays;

public class P20_SpecificValue {
    /**
     * Write a Java program to test if an array contains a specific value.
     */

    // Main method
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        int specific = 4;

        boolean specificNumber = specificValue(numbers, specific);

        if (specificNumber) {
            System.out.println("The array contains the value " + specific);
        } else {
            System.out.println("The array does not contain the value " + specific);
        }
    }

    // Static method with params with return type data boolean
    public static boolean specificValue(int[] array, int specific) {
        return Arrays.stream(array).anyMatch(x -> x == specific);

    }
}
