import java.util.Scanner;

class Tender {
    double cost;
    String company;

    // Method to accept data
    void accept(Scanner sc) {
        System.out.print("Enter company name: ");
        company = sc.next();

        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender t[] = new Tender[5];

        // Creating objects and accepting data
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("Enter details for Tender " + (i + 1));
            t[i].accept(sc);
        }

        // Finding minimum cost
        double minCost = t[0].cost;
        String minCompany = t[0].company;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].company;
            }
        }

        // Display result
        System.out.println("Company with minimum cost: " + minCompany);
        System.out.println("Minimum cost: " + minCost);
    }
}
