import java.util.Scanner;

// Abstract class
abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

// Box class
class Box extends ThreeDObject {
    double l, w, h;

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * (l*w + w*h + h*l);
    }

    double volume() {
        return l * w * h;
    }
}

// Cube class
class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}

// Cylinder class
class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double volume() {
        return Math.PI * r * r * h;
    }
}

// Cone class
class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h); // slant height
        return Math.PI * r * (r + l);
    }

    double volume() {
        return (1.0/3) * Math.PI * r * r * h;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;  // Single reference

        System.out.println("Select Shape:");
        System.out.println("1. Box  2. Cube  3. Cylinder  4. Cone");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter length, width, height: ");
                obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                break;

            case 2:
                System.out.print("Enter side: ");
                obj = new Cube(sc.nextDouble());
                break;

            case 3:
                System.out.print("Enter radius and height: ");
                obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
                break;

            case 4:
                System.out.print("Enter radius and height: ");
                obj = new Cone(sc.nextDouble(), sc.nextDouble());
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        // Polymorphism
        System.out.println("Surface Area = " + obj.wholeSurfaceArea());
        System.out.println("Volume = " + obj.volume());

        sc.close();
    }
}
