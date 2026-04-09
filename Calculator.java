// Simple calculator program
// Reads two numbers and an operator (+ - * /)
// Performs the chosen operation and prints the result
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Operator (+ - * /): ");
        char op = s.next().charAt(0);
        System.out.print("First number: ");
        double a = s.nextDouble();
        System.out.print("Second number: ");
        double b = s.nextDouble();
        double r;
        if (op == '+') r = a + b;
        else if (op == '-') r = a - b;
        else if (op == '*') r = a * b;
        else if (op == '/') r = (b == 0 ? Double.NaN : a / b);
        else { System.out.println("Invalid operator"); s.close(); return; }
        System.out.println("Result: " + r);
        s.close();
    }
}