public class Employee {
    // step 1: Declare Employee attributes
    int empId;
    String empName;
    double salary;
   
      // step 2: create Constructor to initialize object values
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // step 3: create Method to display employee details
       void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary) ; }

    public static void main(String[] args) {
        // step 4: Create objects and pass values directly 
        Employee emp1 = new Employee(201 , "khushi" , 45000) ;       

        // step 5: Display employee details
        emp1.displayEmployee();
        
    }
}
