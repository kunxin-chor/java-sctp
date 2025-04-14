import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    // All Java program stsrt from a `main` function
    public static void main(String[] args) {

        // STRINGS*, INTEGERS, FLOATS, DOUBLE, BOOLEAN AND CHAR => primitive data types

        // VALUES = different kind of data that the programming language knows
        // The type of variable must be defined when we create a new variable
        // Uses double quotes
        // JS: let something = "the quick brown fox";
        // Strings in Java must be double quoted
        String something = "The quick brown fox jumps over the lazy dog";

        // Numbers in Java - state THE type of number
        // integers
        int secretOfLife = 42;
        // double precision (aka double) is the default -- can store twice the precison
        // as a float
        double pi = 3.14;
        // floating point (aka float) -- having double precision is overkill sometimes
        float gstPercentage = 0.09f;

        // There are different type of intgers
        byte myWallet = 126;  // byte at most store between -127 to 128

        // boolean variables are either true or false
        boolean isRaining = true;

        // char data type
        // 'char' is for 'character'
        // A string consists of many characters
        // Therefore 1 char variable represents one character in a string
        // Uses single quotes
        char alphabet = 'Z';


        // ARRAYS, OBJECTS FROM JAVASCRIPT
        // Reference data types
        // Arrays in JS are actually known as "ArrayList" in other programming languages
        
        // Array basically stores more than one value BUT
        // all elements in the Array MUST be of the SAME data type
        // AND the SIZE is fixed -- the maximum number of the elements in the array is fixed at time of definition

        // I want an array that can store 100 integers
        int[] numbers = new int[100];  // => new int[100]  ==> create a new integer array of size 100
        numbers[0] = 11;
        System.out.println(numbers[0]);

        // IN JS: let primes = [1,3,7,9,11]
        int[] primes = {1, 3, 7, 9, 11};  // the size is fixed to five (index 0 to 4)

        // ArrayList
        // Java eqv of an array in JavaScript
        // In other langauges in C or C++ ==> known as Vector
        // the ability to store as many items as you want but still have the array capabilities

        // ArrayList<Integer> luckyNumber ==> create a new variable named luckyNumber 
        //                                     that CAN store an ArrayList<Integer>
        ArrayList<Integer> luckyNumbers;
        luckyNumbers = new ArrayList<Integer>();

        // usually: ArrayList<Integer> luckyNumbers = new ArrayList<Integer>();

        luckyNumbers.add(10);
        luckyNumbers.add(11);
        System.out.println(luckyNumbers.removeLast());

        // OBJECTS IN JAVASCRIPT ARE USUALLY KNOWN AS A map or hashtable IN OTHER PROGRAMMING LANGUAGES
        // let book = { "title":"How to Make Friends and Influence People",  "pageCount": 100, category":"self-help"}
        // console.log(book.title);
        // console.log(book.category)

        HashMap<String, Integer> dayInMonths = new HashMap<String, Integer>();
        dayInMonths.put("Jan", 31);  // the first parameter is the key, the second parameter is value
        dayInMonths.put("Feb", 28);

        System.out.println("Number of days in Feb =" + dayInMonths.get("Feb"));

       
    }
}