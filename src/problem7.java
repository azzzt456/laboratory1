import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("reverseArr: ");
        String reversedArray = reverseArr(array, n - 1);
        System.out.println(reversedArray);
    }

    /**
     * This method returns the elements of the given array in reverse order as a string.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the size of the array.
     * The method iterates through numbers from n to 0,
     * resulting in linear time complexity.
     *
     * @param array the given array
     * @param index the index of the element being processed
     * @return the elements of the given array in reverse order as a string
     */
    public static String reverseArr(int[] array, int index) {
        if (index == 0) {
            return Integer.toString(array[0]);
        }
        return array[index] + " " + reverseArr(array, index - 1);
    }
}
