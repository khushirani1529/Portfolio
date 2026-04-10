import java.util.Scanner;

public class studentnameformatter {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user 
        Scanner sc = new Scanner(System.in);
        
        // Ask user to enter  student name 
        System.out.print("Enter the student name: ");
        String Name = sc.nextLine();
        
        // print original name 
        System.out.println("Original Name: " + Name);
        
        // convert name to uppercase
        System.out.println("Uppercase: " + Name.toUpperCase());
        
        // convert name to lowercase
        System.out.println("Lowercase: " + Name.toLowerCase());
        
        // Close the scanner
        sc.close();
    }
}