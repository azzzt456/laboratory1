import java.util.Scanner;

public class problem6 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int base = scanner.nextInt();
        System.out.println("Enter the power: ");
        int exponent = scanner.nextInt();

        long startTime = System.nanoTime();
        int result = calculatePower(base, exponent);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println("Result: " + result +
                "\nRuntime: " + runtime +
                "\nTime complexity: O(n)");
    }

    /**
     * This method calculates the given number raised to the given power using recursion.
     * Time complexity: O(n), where n is the given power.
     * resulting in linear time complexity
     *
     * @param base     the given number
     * @param exponent the given power
     * @return the given number raised to the given power
     */
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }
}

