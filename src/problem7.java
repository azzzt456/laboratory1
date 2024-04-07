import java.util.Scanner;

public class problem7 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Result: ");
        long startTime = System.nanoTime();
        printArrayInReverse(array, size - 1);
        double runtime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println("\nRuntime: " + runtime + "\nTime complexity: O(n)");
    }

    /**
     * This method prints the given array in reverse order using recursion.
     * Time complexity: O(n), where n is the size of the array.
     * the method iterates through numbers from n to 0,
     * resulting in linear time complexity
     *
     * @param array the given array
     * @param index the index of the element being printed
     */
    public static void printArrayInReverse(int[] array, int index) {
        System.out.print(array[index] + " ");
        if (index > 0) {
            printArrayInReverse(array, index - 1);
        }
    }
}
