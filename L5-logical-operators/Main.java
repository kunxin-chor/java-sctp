public class Main {
    public static void main(String[] args) {
        // Comparsion and Logical operators

        // Comparison operators work the same as in JavaScript
        System.out.println(5 > 10);
        System.out.println(5 <= 10);
        // There's only double equal in Java
        System.out.println(3 == 3);

        // Logical operators
        boolean a = true;
        boolean b = false;

        // TRUE operator is &&
        // Only true && true ==> true
        // Anything else (true && false, or false && true) will be false
        System.out.println("a && b =>" + (a && b));

        // OR operator is || (double-pipe character)
        // As long as one side of the OR is true, the entire expression is evaluated
        // to be true
        System.out.println("a || b => " + (a || b));

        if (a == true) {
            System.out.println("A is true");
        } else {
            System.out.println("A is false");
        }

        double score = 82;
        if (score >= 80) {
            System.out.println("A");
        } else if (score >= 75) {
            System.out.println("B+");
        } else if (score >= 70) {
            System.out.println("B");
        } else {
            System.out.println("Score less than B");
        }

    }
}