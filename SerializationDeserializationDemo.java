import java.io.*;

    //student class 
class Student implements Serializable {
     int id;
     String name;

     Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
     }
   }
 public class SerializationDeserializationDemo {
    public static void main(String[] args) {

        try {
          //----------------------------
          // PART 1: Serialization
          //----------------------------
          Student s1 = new Student(101, "Gunnu"); 

          FileOutputStream fos = new FileOutputStream("student.ser");
          ObjectOutputStream oos = new ObjectOutputStream(fos);

          oos.writeObject(s1);
          System.out.println("Object serialization successfully.\n");

          oos.close();
          fos.close();

          //-----------------------------
          // PART 2: Deserialization
          //-----------------------------
          FileInputStream fis = new FileInputStream("student.ser");
          ObjectInputStream ois = new ObjectInputStream(fis);

          Student s2 = (Student) ois.readObject();

          System.out.println("Object deserialization successfully.");
          System.out.println("Student data after deserialization");
          s2.display();

          ois.close();
          fis.close();

        } catch(IOException e) {
            System.out.println("File error: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Class error: " + e);
        }
    }
}
             
