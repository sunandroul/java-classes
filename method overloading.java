class Calculator {

    
    void add(int a, int b) {
        System.out.println("Sum of two integers = " + (a + b));
    }

    
    void add(int a, int b, int c) {
        System.out.println("Sum of three integers = " + (a + b + c));
    }

    
    void add(double a, double b) {
        System.out.println("Sum of two doubles = " + (a + b));
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        obj.add(10, 20);        
        obj.add(5, 10, 15);     
        obj.add(2.5, 3.5);      
    }
}
