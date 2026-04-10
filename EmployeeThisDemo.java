public class EmployeeThisDemo {
    // step 1 : Instance variables
    int empId;
    String empName; 

    //  step 2: constructor with same variable names as instance variables
    EmployeeThisDemo(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    // step 3: use 'this' to refer to current object instance variables

    // step 4: display method
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public static void main(String[] args) {
        // step 5: create object
        EmployeeThisDemo emp1 = new EmployeeThisDemo(101, "khushi");

        // step 6: Display values
        emp1.display();
    }

    }
       