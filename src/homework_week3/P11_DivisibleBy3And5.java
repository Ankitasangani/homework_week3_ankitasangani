package homework_week3;

public class P11_DivisibleBy3And5 {
    /**
     * Write a java program to print the numbers between, 1 to 100 which can be divided by 3
     * and 5 separately.
     */


    // Main method
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3:");
        divisibleBy3();

        System.out.println("Numbers divisible by 5:");
        divisibleBy5();
    }

    // Static method
    public static void divisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Static method
    public static void divisibleBy5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

