public class Grader {
    private int score;
    public Grader(int score) {
        this.score = score;
    }
    public char letterGrade() {
        if (score >= 90) {
            return 'O'; 
        } else if (score >= 80) {
            return 'E'; 
        } else if (score >= 70) {
            return 'A';
        } else if (score >= 60) {
            return 'B';
        } else if (score >= 50) {
            return 'C';
        } else {
            return 'F'; 
        }
    }
}
import java.util.Scanner;

public class GraderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the student's score (0-100): ");
        int inputScore = scanner.nextInt();

        // Validate that the value is not negative and not greater than 100
        if (inputScore < 0 || inputScore > 100) {
            System.out.println("Invalid input! The score must be between 0 and 100.");
        } else {
            // Create Grader object
            Grader studentGrader = new Grader(inputScore);
            
            // Get and print the grade
            char grade = studentGrader.letterGrade();
            System.out.println("The calculated letter grade is: " + grade);
        }

        scanner.close();
    }
}
