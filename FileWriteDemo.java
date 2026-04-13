import java.io.FileWriter;
import java.io.IOException;

//Student class
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }    
}

public class FileWriteDemo {
    public static void main(String[] args) {

        //Create Student object
        Student s1 = new Student(1, "Gunnu");
        
        try (FileWriter fw = new FileWriter("student.txt")) {
            //Write object data
            fw.write("ID: " + s1.id + "\n");
            fw.write("Name: " + s1.name);
        
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
