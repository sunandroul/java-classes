class Area {

    // Area of square
    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }

    // Area of rectangle
    void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }

    // Area of circle
    void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Area obj = new Area();

        obj.calculateArea(5);          // Square
        obj.calculateArea(4, 6);       // Rectangle
        obj.calculateArea(3.5);        // Circle
    }
}
