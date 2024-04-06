import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("avgOfArr: " + avgOfArr(array));
    }

    /**
     * This method returns the average of the array.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the size of the array.
     * The method iterates through elements of the array once,
     * resulting in linear time complexity.
     *
     * @param array the given array
     * @return the average of the given array
     */
    public static double avgOfArr(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
