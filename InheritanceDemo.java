// Child class inheriting from Person (parent class)
public class InheritanceDemo extends Person {
    // Child class specific properties
    private int employeeId;
    private double salary;

    // Child class constructor
    public InheritanceDemo(String name, int age, int employeeId, double salary) {
        // Call parent class constructor using super
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Child class method
    public void displayEmployeeInfo() {
        // Call parent class method
        displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    // Override parent class method
    public void walk() {
        System.out.println(getName() + " is walking to office...");
    }

    public void work() {
        System.out.println(getName() + " is working...");
    }

    public static void main(String[] args) {
        // Create parent class object
        System.out.println("===== Parent Class Object =====");
        Person person = new Person("John", 40);
        person.displayInfo();
        person.walk();

        System.out.println("\n===== Child Class Object =====");
        // Create child class object
        InheritanceDemo employee = new InheritanceDemo("Alice", 30, 101, 50000);
        
        // Inherited properties and methods from parent
        employee.displayEmployeeInfo();
        
        // Child class specific method
        employee.work();
        
        // Overridden method from parent
        employee.walk();
    }
}
