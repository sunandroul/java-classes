import java.util.Scanner;

class Item {
    int code;
    double price;

    // Method to accept data
    void accept(Scanner sc) {
        System.out.print("Enter item code: ");
        code = sc.nextInt();

        System.out.print("Enter item price: ");
        price = sc.nextDouble();
    }

    // Method to display data
    void display() {
        System.out.println(code + "\t" + price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item items[] = new Item[5];
        double total = 0;

        // Accept data
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.println("Enter details for Item " + (i + 1));
            items[i].accept(sc);
        }

        // Display in tabular form
        System.out.println("\nCode\tPrice");
        System.out.println("----------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }

        // Display total price
        System.out.println("----------------");
        System.out.println("Total Price = " + total);
    }
}
