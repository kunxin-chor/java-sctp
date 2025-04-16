
/* Every program has a Main class */
// Container that contains functions (aka methods) and data

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    // All Java Programs start from the main function
    // All main methods must recieve a command line arguments (which is an array of String)
    public static void main(String[] args) {
        System.out.println("Hello Revision");

        // Primitive Data Types
        char c = 'A';
        boolean b = true;
        int i = 12345; // long, short, byte, int
        double d = 123.14f;
        float f = 123.1f;
        String s = "The quick fox jumps over the lazy dog";

        // Reference Data Types

        // Array in Java: has fixed size and all the data types must be the same
        String[] superheroes = {"Spiderman", "Iron Man", "Captain America"};

        // In Java, we use an ArrayList if we want the functionalities of a JavaScript array
        ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();

        // No objects in Java -- but we use HashMap
        // Maps an integer to a string
        HashMap<Integer, String> customers = new HashMap<Integer, String>();
        customers.put(12345, "Phua Chua Kang");

    }

    // Given the weight and height of a person
    // calculae and return the BMI
    // 1st set of question mark => the data type of the returned value (return type of the method)
    // 2nd set of question mark => the name of the method
    // 3rd set of question mark => the parameters to the method
    // 4th set of question mark => what you are returning
    public static double calculateBmi (double weight, double height) {
        return weight / (height*height);
    }

    public static float calculateAreaOfCircle(float radius) {
        return 22/7 * (radius * radius);
    }
}
