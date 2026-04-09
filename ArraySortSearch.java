// Array sort and search example
// Reads an array, sorts it, then searches for a target value
// Uses built-in Arrays.sort and binarySearch methods
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println(target + " found at index " + index + " in the sorted array.");
        } else {
            System.out.println(target + " not found in the array.");
        }

        scanner.close();
    }
}
