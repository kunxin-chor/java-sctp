package L10AccessModifiers;

import java.util.Scanner;

// Private means: only the class can access
class Animal {
    private String name;
    private String species;
    private String owner;
    private int months; // cannot be negative, cannot be 0 month
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getMonths() {
        return months;
    }
    public void setMonths(int months) {
        if (months <=0) {
            return;
        }
        this.months = months;
    }

    public double getAgeInYears() {
        return months/12.0;
    }
}

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
        System.out.println("Animal's age in years = " + pet.getMonths() / 12.0);

    }

}
