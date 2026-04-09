// Factorial calculator
// Reads a non-negative integer and computes n!
// Uses a loop to multiply values from 1 to n
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            System.out.println(n + "! = " + result);
        }

        scanner.close();
    }
}
