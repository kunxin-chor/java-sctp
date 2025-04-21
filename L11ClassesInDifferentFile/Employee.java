package L11ClassesInDifferentFile;

public class Employee {
    // The fields are NOT private or public
    // It is DEFAULT ACCESS --> PUBLIC TO ALL CLASSES IN THE SAME PACKAGE
    // i.e -- all classes in the same folder has access
    // DISCLAIMER: BAD PRACTICE -- usually FIELDS are private or protected*
    String firstName;
    String lastName;
    String email;
}
