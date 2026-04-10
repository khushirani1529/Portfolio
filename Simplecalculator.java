public class Simplecalculator {

    // Method 1 : Addition 
    public static int addition(int a ,int b) {
        return a + b ;
    }

    // Method 2 : substraction 
    public static int sub (int a , int b) {
        return a - b;
    }

    // Method 3 : multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method 4 : division
    public static String divide(double a, double b) {
        if (b == 0) {
            return "Not defined";
        } else {
            return String.valueOf(a / b);
        }
    }

    public static void main(String[] args) {
        // Step 1: Declare two numbers
        double a = 10;
        double b = 30;

        // step 2 :call method and print result 
        
        System.out.println("Numbers: " + a + " and " + b);
        System.out.println("Addition: " + addition((int)a, (int)b));
        System.out.println("Subtraction: " + sub((int)a, (int)b));
        System.out.println("Multiplication: " + multiply((int)a, (int)b));
        System.out.println("Division: " + divide(a, b));
        
    }
}