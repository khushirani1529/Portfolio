// Method overloading demonstration
// Defines multiple add(...) methods with different signatures
// Shows how Java selects the correct method by parameter types/counts
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("add(2, 3) = " + add(2, 3));
        System.out.println("add(2.5, 4.1) = " + add(2.5, 4.1));
        System.out.println("add(1, 2, 3) = " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
