import java.util.Scanner;

public class problem2 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        long startTime = System.nanoTime();
        double result = calculateAverage(array, 0, array[0]);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println("Result: " + result +
                "\nRuntime: " + runtime +
                "\nTime complexity: O(n)");
    }

    /**
     * This method calculates the average of the elements in the array using recursion.
     * Time complexity: O(n), where n is the size of the array.
     *
     * @param array the given array
     * @param index the index of the current element being processed
     * @param sum   the sum of elements up to index
     * @return the average of the given array
     */
    public static double calculateAverage(int[] array, int index, double sum) {
        if (index + 1 == array.length) {
            return sum / array.length;
        } else {
            return calculateAverage(array, index + 1, sum + array[index + 1]);
        }
    }
}
