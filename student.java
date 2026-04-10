public class student {
    // declare student attributes (fields)
    int rollNo;
    String name;
    double marks;

    // Constructor to initialize student details
    public student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Create a method to display student details
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Create an object of the student class
        student student1 = new student(1, "khushi", 85.5);

        // Display the student details using the object
        student1.displayDetails();
    }
}
