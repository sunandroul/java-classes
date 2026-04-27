import java.util.Scanner;
interface Exam {
    void percent_cal();
}
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

        System.out.print("Enter
