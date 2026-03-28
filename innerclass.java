class Outer {
    int x = 10;

    // Inner class
    class Inner {
        void display() {
            System.out.println("Value of x from Inner class: " + x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        // Create object of outer class
        Outer outerObj = new Outer();

        // Create object of inner class
        Outer.Inner innerObj = outerObj.new Inner();

        // Call method of inner class
        innerObj.display();
    }
}
