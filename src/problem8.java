import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.print("isAllNum: ");
        if (isAllNum(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * This method checks if the given string consists only of numbers.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the size of the string.
     * The method iterates through characters from 0 to n,
     * resulting in linear time complexity.
     *
     * @param s the given string
     * @param index the index of the character being checked
     * @return true if the string consists only of numbers, otherwise false
     */
    public static boolean isAllNum(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if ("0123456789".indexOf(s.charAt(index)) == -1) {
            return false;
        }
        return isAllNum(s, index + 1);
    }
}
