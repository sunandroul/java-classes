interface Work {
    void assignWork(String workName);
    void showWork();
}

interface Salary {
    void setSalary(double amount);
    void showSalary();
}

class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void showEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}
class Manager extends Employee implements Work, Salary {
    String workName;
    double salary;

    Manager(int empId, String name) {
        super(empId, name);
    }

    
    public void assignWork(String workName) {
        this.workName = workName;
    }

    public void showWork() {
        System.out.println("Assigned Work: " + workName);
    }

    public void setSalary(double amount) {
        this.salary = amount;
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

public class WorkManagementSystem {
    public static void main(String[] args) {
        Manager m = new Manager(201, "Amit");

        m.assignWork("Project Handling");
        m.setSalary(50000);

        m.showEmployee();
        m.showWork();
        m.showSalary();
    }
}
