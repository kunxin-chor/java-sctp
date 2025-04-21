package L11ClassesInDifferentFile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal pet = new Animal();

        String animalName = sc.nextLine();
        String owner = sc.nextLine();
        int months = sc.nextInt();

        // pet.name = animalName; <-- invalid, because name is private
        pet.setName(animalName);
        pet.setOwner(owner);
        pet.setMonths(months);

        System.out.println("Animal Name: " + pet.getName());
        System.out.println("Animal's age in years = " + pet.getAgeInYears());

        Employee e = new Employee();
        e.firstName = "Ah Kow";

    }

}
