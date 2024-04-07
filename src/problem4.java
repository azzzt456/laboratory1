import java.util.Scanner;

public class problem4 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        long startTime = System.nanoTime();
        int result = calculateFactorial(number);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println("Result: " + result +
                "\nRuntime: " + runtime +
                "\nTime complexity: O(n)");
    }

    /**
     * This method calculates the factorial of the given number using recursion.
     * Time complexity: O(n), where n is the given number.
     * resulting in linear time complexity
     *
     * @param number the given number
     * @return the factorial of the given number
     */
    public static int calculateFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
