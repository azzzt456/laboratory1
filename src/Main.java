import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "1. Minimum of an array\n" +
                        "2. Average of an array\n" +
                        "3. Prime or composite\n" +
                        "4. Factorial\n" +
                        "5. Fibonacci\n" +
                        "6. Power\n" +
                        "7. Reverse an array\n" +
                        "8. Check if all digits\n" +
                        "9. Binomial coefficient\n" +
                        "10. Greatest common denominator\n" +
                        "Pick a function:");
        int pick = scanner.nextInt();
        switch (pick) {
            case 1:
                problem1.execute();
                break;
            case 2:
                problem2.execute();
                break;
            case 3:
                problem3.execute();
                break;
            case 4:
                problem4.execute();
                break;
            case 5:
                problem5.execute();
                break;
            case 6:
                problem6.execute();
                break;
            case 7:
                problem7.execute();
                break;
            case 8:
                problem8.execute();
                break;
            case 9:
                problem9.execute();
                break;
            case 10:
                problem10.execute();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
