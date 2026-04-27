// Bank interface
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void display();
}

// Customer class
class Customer {
    int custId;
    String name;

    Customer(int custId, String name) {
        this.custId = custId;
        this.name = name;
    }

    void showCustomer() {
        System.out.println("Customer ID: " + custId);
        System.out.println("Customer Name: " + name);
    }
}

// Account class implementing Bank interface
class Account extends Customer implements Bank {
    int accNo;
    double balance;

    Account(int custId, String name, int accNo, double balance) {
        super(custId, name);
        this.accNo = accNo;
        this.balance = balance;
    }

    // Implementing deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Implementing withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display details
    public void display() {
        showCustomer();
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        Account obj = new Account(101, "Rahul", 5001, 10000);

        obj.display();
        obj.deposit(2000);
        obj.withdraw(3000);
        obj.display();
    }
}
