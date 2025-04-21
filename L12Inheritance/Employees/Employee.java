package L12Inheritance.Employees;

public class Employee {
    // private - only the class can access (even children cannot access)
    // protected - is shared wth children
    // when do we ever use private
    // when you are a senior engineer in Java
    protected String firstName;
    protected String lastName;
    protected String title;
    protected int salary; // in cents
    protected int numberOfLeave;
    
    public Employee(String firstName,
     String lastName, String title, 
     int salary, int numberOfLeave) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.salary = salary;
        this.numberOfLeave = numberOfLeave;
    }

    public Employee() {
        firstName = "N/A";
        lastName = "N/A";
        title = "N/A";
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getNumberOfLeave() {
        return numberOfLeave;
    }
    public void setNumberOfLeave(int numberOfLeave) {
        this.numberOfLeave = numberOfLeave;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMonthlyPay() {
        return salary * 0.8;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", salary=" + salary
                + ", numberOfLeave=" + numberOfLeave + "]";
    }
}
