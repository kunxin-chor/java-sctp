package L12Inheritance;

import java.util.ArrayList;

// Only public classes can be imported by classes in other packages
import L12Inheritance.Employees.Employee;
import L12Inheritance.Employees.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {

        // 1. we want an arraylist that can store full time employees and part time employees
        // 2. able to use a for loop to display the name of the employee and their monthly pay
        //    - take note monthly pay calculation is different for full time and part time employee
        // ArrayList<Employee> can store any objects that is of Employee OR -related- to Employee
        // (aka polymorphism)
        ArrayList<Employee> allEmployees = new ArrayList<>();
         
        Employee e = new Employee("Peter", "Barker", "Photographer", 3000, 14);
        allEmployees.add(e);

        PartTimeEmployee partTimer = new PartTimeEmployee("Tony", "Stare", "Scientist", 12, 21, 50);
        allEmployees.add(partTimer);

        for (Employee eachEmployee : allEmployees) {
            System.out.println(eachEmployee.getFirstName() + " " + eachEmployee.getLastName());
            System.out.println(eachEmployee.getMonthlyPay());
        }

        System.out.println(partTimer);
    }
}
