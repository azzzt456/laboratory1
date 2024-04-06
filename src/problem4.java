import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("factorial: " + factorial(n));
    }

    /**
     * This method calculates the factorial of the given number.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the given number.
     * The method iterates through numbers from 1 to n,
     * resulting in linear time complexity.
     *
     * @param n the given number
     * @return the factorial of the given number
     */
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
