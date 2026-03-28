import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
