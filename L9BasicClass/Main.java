package L9BasicClass;

// Every class is a data type (custom data type)
// int, boolean etc are data types, all classes can be used as a data type
class Employee {
    // Variables (aka. member variables, properties, attributes, field)
    String firstName; // all employee can have a firstName variable that is a String
    String lastName;
    String email;
}

public class Main {
    public static void main(String[] args) {
        // to define of a certain data type, we use <data type> <variable name>
        // int secretOfLife;
        // e is a variable that can store Employee objects
        // new Employee() => create and return a new Employee object
        Employee e = new Employee();
        e.firstName = "Chua Kang"; // assign to the firstName field "Chua Kang"
        e.lastName = "Phua"; // assign to the last name field "Phua"
        e.email = "asd@asd.com"; // assign to the email field "asd@asd.com"

        System.out.println(e.firstName);
        System.out.println(e.lastName);
        System.out.println(e.email);

        // a CLASS defines what kind of variables an OBJECT would have
         Employee e2 = new Employee();
         e2.firstName = "Mary";
         e2.lastName = "Sue";
         e2.email="mary@asd.com";
         System.out.println("e2 firstName = " + e2.firstName);
         System.out.println("e2 lastname = " + e2.lastName);
        System.out.println(("e2 email =" + e2.email));
        

    }
}
