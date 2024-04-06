import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("gcd: " + gcd(a, b));
    }

    /**
     * this method calculates the gcd of 2 numbers
     * it uses a recursive approach
     * time complexity: O(n), where n is the number of divisions
     * the method divides numbers until the remainder is 0,
     * resulting in linear time complexity
     *
     * @param a the first number
     * @param b the second number
     * @return the greatest common divisor
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
