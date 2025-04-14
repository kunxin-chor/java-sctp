// every variables and functions in a JAva Prorgam must be inside a class
// a class is a collection of data (aka variables) and functions
public class Main {
    // functions in Java are known as 'methods'
    // JS also have methods -- if a function is stored inside an object as a value
    // then it is known as a method

    public static void main(String[] args){
        int sum = addTwo(3, 4);

        // Java support String concatenation -- combine two strings together
        System.out.println("Sum =" + sum);

        // Calculate the area of a rectangle


    }

    // a method (aka function) to add two integers together and return their sum
    /*
       function addTwo(x, y) {
         return x + y;
       }
     */
    
    public static int addTwo(int x, int y) {
        return x + y;  // whatever return x +y is, the data type must match
                       // the return type of the method (after public static)
    }

    // STEPS TO WRITING A FUNCTION
    // 1. What's the name of the function (the second ???)
    // 2. what's the parameters to the function (the third ???)
    // 3. What's the return value (the foruth ???)
    // 4. Waht's the return type of the function (the first ???)

    public static double calculateArea (double length, double width) {
        double area = length * width;
        return area;
    }

    // a function with the return type 'void' doesn't return anything
    public static void greet() {
        System.out.println("Happy new year");
        System.out.println("Happy new year");
        System.out.println("Happy new year");
    }

}

