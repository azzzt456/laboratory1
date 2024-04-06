import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("primeOrComp: " + primeOrComp(n));
    }

    /**
     * This method checks if the given number is prime or composite.
     * It uses a recursive approach.
     * Time complexity: O(n/2), where n is the given number.
     * The method iterates through numbers from n/2 to 1,
     * resulting in square root time complexity.
     *
     * @param n the given number
     * @return "Prime" if the number is prime, "Composite" otherwise
     */
    public static String primeOrComp(int n) {
        if (n <= 1) {
            return "Composite";
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }
}
