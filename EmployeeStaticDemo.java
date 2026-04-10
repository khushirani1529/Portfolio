public class EmployeeStaticDemo {
    // step1 : Instance variables (different for each employee)
    int empId;
    String empName;
    
    // step 2:Static variable ( same for all employees)
    static String companyName = "Tech solutions Pvt Ltd";

    //  step 3 : Constructor
  EmployeeStaticDemo(int empId, String Name) {
        this.empId = empId;
        empName = Name;
    }
       //  step 4 : Display method 
    void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        //  step 5 :Create multiple employee objects 
        EmployeeStaticDemo emp1 = new EmployeeStaticDemo(101, "khushi");
        EmployeeStaticDemo emp2 = new EmployeeStaticDemo(102, "shagun");

             // s6tep 6 : Display both employee
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
