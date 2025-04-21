package L12Inheritance.Employees;

// the extends keyword means 'inherit from'
// PartTimeEmployee also includes the code from Employee
public class PartTimeEmployee extends Employee {
    
    // a child class can have their own set of data
    private int hoursWorkedMonthly;

    
    public PartTimeEmployee() {
        // super refers to the parent
        super();

    }

    public PartTimeEmployee(String firstName, String lastName, String title, int salary, int numberOfLeave, int hoursWorkedMonthly) {
        // construct the parent class part of the PartTimeEmployee
        super(firstName, lastName, title, salary, numberOfLeave );
        // settle the data the child class will need
        this.hoursWorkedMonthly = hoursWorkedMonthly;
    }

    public int getHoursWorkedMonthly() {
        return hoursWorkedMonthly;
    }

    public void setHoursWorkedMonthly(int hoursWorkedMonthly) {
        this.hoursWorkedMonthly = hoursWorkedMonthly;
    }


    // if a method exists in both the parent and the child
    // the child's one will take precedenced
    public double getMonthlyPay() {
        return salary * hoursWorkedMonthly;
    }

    
}
