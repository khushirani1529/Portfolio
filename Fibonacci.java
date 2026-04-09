// Fibonacci series printer
// Reads a number of terms and prints the sequence
// Uses iteration with two variables
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Fibonacci terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive integer.");
        } else {
            System.out.print("Fibonacci series: ");
            int a = 0;
            int b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i < n ? ", " : ""));
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }

        scanner.close();
    }
}
