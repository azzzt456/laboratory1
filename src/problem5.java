import java.util.Scanner;

public class problem5 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        long startTime = System.nanoTime();
        int result = calculateFibonacci(number);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println("Result: " + result +
                "\nRuntime: " + runtime +
                "\nTime complexity: O(2^n)");
    }

    /**
     * This method calculates the n-th element of the Fibonacci sequence using recursion.
     * Time complexity: O(2^n), where n is the given number.
     * resulting in exponential time complexity
     *
     * @param n the given number
     * @return the n-th element of the Fibonacci sequence
     */
    public static int calculateFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}

