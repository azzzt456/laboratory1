import java.util.Scanner;

public class problem9 {
    static int[][] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        memo = new int[n + 1][k + 1];
        System.out.println("binomialCoef: " + binomialCoef(n, k));
    }

    /**
     * This method calculates the binomial coefficient for a given pair of numbers using recursion with memoization.
     * Time complexity: O(n*k), where n is the number n and k is the number k.
     *
     * @param n the first number
     * @param k the second number, has to be smaller than n
     * @return the binomial coefficient
     */
    public static int binomialCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        if (memo[n][k] != 0) {
            return memo[n][k];
        }
        memo[n][k] = binomialCoef(n - 1, k - 1) + binomialCoef(n - 1, k);
        return memo[n][k];
    }
}
