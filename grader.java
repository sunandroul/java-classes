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
