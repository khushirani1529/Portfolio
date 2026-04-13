import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionDemo {
    public static void main(String[] args) {
        try {
            //step 1: Load MySQL Driver(optional for latest versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step2: create connection 
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password"
        );
            System.out.println("Database connection successful!");

            //step 3: close connection 
            con.close();
        } catch (Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
           
        }
    }   
}