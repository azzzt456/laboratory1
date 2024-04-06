import java.util.Scanner;

public class problem5 {
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        memo = new int[n + 1];
        System.out.println("fibonacci: " + fibonacci(n));
    }

    /**
     * This method calculates the n-th element of the Fibonacci sequence using recursion with memoization.
     * it uses a recursive approach
     * Time complexity: O(2^n), where n is the given number.
     * resulting in exponential time complexity
     *
     * @param n the given number
     * @return n-th element of the Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n <= 1) {
            return n;
        }
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }
}

