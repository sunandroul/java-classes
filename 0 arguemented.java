class Student {
    int id;
    String name;
    Student() {
        id = 101;
        name = "Rahul";
        System.out.println("0-Argument Constructor Called");
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(); // constructor is called automatically
        s1.display();
    }
}
