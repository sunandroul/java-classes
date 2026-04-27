import java.util.Scanner;

// Interface
interface Exam {
    void percent_cal();
}

// Base class
class Student {
    String name;
    int roll_no;
    float marks1, marks2;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();

        System.out.print("Enter marks1: ");
        marks1 = sc.nextFloat();

        System.out.print("Enter marks2: ");
        marks2 = sc.nextFloat();
    }

    void show() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

// Derived class
class Result extends Student implements Exam {
    float percentage;

    // Implement interface method
    public void percent_cal() {
        percentage = (marks1 + marks2) / 2;
    }

    void display() {
        System.out.println("Percentage: " + percentage + "%");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Result r = new Result();

        r.getData();      // input
        r.show();         // display student data
        r.percent_cal();  // calculate percentage
        r.display();      // display result
    }
}
