import java.util.Scanner;

public class problem9 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the bigger number: ");
        int n = scanner.nextInt();
        System.out.println("Enter the smaller number: ");
        int k = scanner.nextInt();

        System.out.print("Result: ");
        long startTime = System.nanoTime();
        int result = calculateBinomialCoefficient(n, k);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(result);
        System.out.println("Runtime: " + runtime + "\nTime complexity: O(2^n)");
    }

    /**
     * This method calculates the binomial coefficient for a given pair of numbers using recursion.
     * Time complexity: O(2^n), where n is the number k.
     * the method branches out each time,
     * resulting in exponential time complexity
     *
     * @param n the first number
     * @param k the second number, has to be smaller than n
     * @return the binomial coefficient
     */
    public static int calculateBinomialCoefficient(int n, int k) {
        if (k == n || k == 0) {
            return 1;
        } else {
            return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n, k - 1);
        }
    }
}
