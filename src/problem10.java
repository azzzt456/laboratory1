import java.util.Scanner;

public class problem10 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Result: ");
        long startTime = System.nanoTime();
        int result = findGreatestCommonDivisor(b, a % b);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(result);
        System.out.println("Runtime: " + runtime + "\nTime complexity: O(n)");
    }

    /**
     * This method calculates the greatest common divisor (gcd) of two numbers using recursion.
     * Time complexity: O(n), where n is the number of divisions.
     * the method divides numbers until the remainder is 0
     * resulting in linear time complexity
     *
     * @param b the number being divided
     * @param c the divisor
     * @return the greatest common denominator
     */
    public static int findGreatestCommonDivisor(int b, int c) {
        if (c == 0) {
            return b;
        } else {
            return findGreatestCommonDivisor(c, b % c);
        }
    }
}
