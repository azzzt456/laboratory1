import java.util.Scanner;

public class problem3 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Result: ");
        long startTime = System.nanoTime();
        checkPrimeOrComposite(number, number / 2);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println("Runtime: " + runtime + "\nTime complexity: O(n/2)");
    }

    /**
     * This method checks if the given number is prime or composite
     * using a recursive approach.
     * Time complexity: O(n/2), where n is the given number.
     * The method prints "Prime" or "Composite".
     *
     * @param number the given number
     * @param divisor the number to check divisibility
     *
     */
    public static void checkPrimeOrComposite(int number, int divisor) {
        if (divisor < 2) {
            System.out.println("Prime");
        } else if (number % divisor == 0) {
            System.out.println("Composite");
        } else {
            checkPrimeOrComposite(number, divisor - 1);
        }
    }
}
