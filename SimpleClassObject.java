// Simple class and object example
// Defines a Person class and creates an instance
// Calls an instance method to demonstrate object behavior
public class SimpleClassObject {
    public static void main(String[] args) {
        Person person = new Person("Asha", 22);
        person.introduce();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
