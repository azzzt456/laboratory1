import java.util.Scanner;

public class problem1 {
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
        int result = findMinimum(array, 0, array[0]);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println("Result: " + result +
                "\nRuntime: " + runtime +
                "\nTime complexity: O(n)");
    }

    /**
     * This method finds the minimum element in the array using recursion.
     * Time complexity: O(n), where n is the size of the array.
     * the method iterates through elements of the array from 0 to n
     * resulting in linear time complexity
     *
     * @param array the given array
     * @param index the index of the current element being compared
     * @param min   the current minimum value
     * @return the minimum element in the array
     */
    public static int findMinimum(int[] array, int index, int min) {
        if (index == array.length) {
            return min;
        } else {
            if (min > array[index]) {
                min = array[index];
            }
            return findMinimum(array, index + 1, min);
        }
    }
}
