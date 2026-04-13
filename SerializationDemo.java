import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

  //step 1: student class must implement Serializable 
    class Student implements Serializable {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
public class SerializationDemo {
    public static void main(String[] args) {
        try {
            // step 2: create student object
            Student s1Student = new Student (101,"khushi");

            //step 3: create FileOutputStream 
            FileOutputStream fos = new FileOutputStream("student.ser");

            //step 4: wrap with ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //step 5: write object 
            oos.writeObject(s1Student);

            // step 6: close stream 
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
               System.out.println("Serialization error:" + e.getMessage());
        }
    }
}