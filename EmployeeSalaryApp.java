
class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary; 
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("--------------------------");
    }
}


class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}


class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id, 0); 
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}


class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(String name, int id, double contractAmount) {
        super(name, id, 0); 
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}


public class EmployeeSalaryApp {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice", 101, 50000, 8000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob", 102, 120, 200);
        ContractEmployee emp3 = new ContractEmployee("Charlie", 103, 60000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}




