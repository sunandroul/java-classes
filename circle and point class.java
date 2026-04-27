class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Display method
    public void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

class Circle {
    private double radius;
    private Point center; // Point object

    // Constructor
    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.center = new Point(x, y); // initialize Point object
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Display method
    public void displayCircle() {
        System.out.println("Radius: " + radius);
        center.displayPoint();
        System.out.println("Area of Circle: " + calculateArea());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, 3, 4);
        c.displayCircle();
    }
}
