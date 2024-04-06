import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("power: " + power(a, n));
    }

    /**
     * This method calculates the given number to the given power using binary exponentiation.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the given power.
     * the method iterates through numbers from n to 0,
     * resulting in linear time complexity
     *
     * @param a the given number
     * @param n the given power
     * @return the given number to the given power
     */
    public static int power(int a, int n) {
        int result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= a;
            }
            a *= a;
            n /= 2;
        }
        return result;
    }
}

