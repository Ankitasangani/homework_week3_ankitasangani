package homework_week3;

import java.util.Arrays;
import java.util.OptionalDouble;

public class P19_AverageArray {
    /**
     * Write a Java program to calculate the average value of array elements.
     */

    // Main method
    public static void main(String[] args) {
        averageArray();
    }

    // Static method
    public static void averageArray() {
        int numbers[] = {1, 2, 3, 4, 5};
        OptionalDouble average = Arrays.stream(numbers).average();
        System.out.println(average);
    }
}
