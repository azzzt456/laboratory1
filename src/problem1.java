import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("minOfArr: " + minOfArr(array));
    }

    /**
     * This method returns the minimum of the array.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the size of the array.
     * The method iterates through elements of the array once,
     * resulting in linear time complexity.
     *
     * @param array the given array
     * @return the minimum of the given array
     */
    public static int minOfArr(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
