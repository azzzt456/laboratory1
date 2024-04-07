import java.util.Scanner;

public class problem8 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.next();

        System.out.print("Result: ");
        long startTime = System.nanoTime();
        boolean isAllNumbers = checkIfAllNumbers(input, 0);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println(isAllNumbers ? "Yes" : "No");
        System.out.println("Runtime: " + runtime + "\nTime complexity: O(n)");
    }

    /**
     * This method checks if the given string only consists of numbers using recursion.
     * Time complexity: O(n), where n is the size of the string.
     * the method iterates through numbers from 0 to n,
     * resulting in linear time complexity
     *
     * @param input the given string
     * @param index the index of the element being checked
     * @return true if the string contains only numbers, otherwise false
     */
    public static boolean checkIfAllNumbers(String input, int index) {
        if (index >= input.length()) {
            return true;
        } else if ("0123456789".indexOf(input.charAt(index)) == -1) {
            return false;
        } else {
            return checkIfAllNumbers(input, index + 1);
        }
    }
}
