package homework_week3;

import java.util.Arrays;

public class P17_SortArray {
    /**
     * Write a Java program to sort a numeric array and a string array.
     */


    // Main method, sorting of numeric and string arrays
    public static void main(String[] args) {

        int numeric[] = {1, 2, 3, 4, 5};
        String array[] = {"A", "B", "C", "D", "E"};

        int sortedNumber[] = sortArray(numeric);
        System.out.println("Sorted numeric array: " + Arrays.toString(sortedNumber));

        String sortedStrings[] = sortArray(array);
        System.out.println("Sorted string array: " + Arrays.toString(sortedStrings));

    }

    // Static method with return type with params
    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    // Static method with return type with params
    public static String[] sortArray(String[] array) {
        Arrays.sort(array);
        return array;
    }
}
