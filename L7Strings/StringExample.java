package L7Strings;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // int, double, boolean all starts with a lower case, but String starts with a upper case `S`
        // in Java, String is a class. Everytime we say `String abc` -- we are creating a new object
        String correctPassword = "rotiprata123"; // Strings are objects in Java, but behave like a primtive

        Scanner sc = new Scanner(System.in);
        System.out.print("To enter the password: ");
        String password = sc.nextLine();
        if (password.equals(correctPassword) ) {
            System.out.println("Welcome back");
        } else {
            System.out.println("Sorry, invalid password");
        }


    }
}
