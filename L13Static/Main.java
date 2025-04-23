package L13Static;

class Animal {
    // static: mean belongs to the class -- ALL OBJECTS WILL ACCESS THE SAME VARIABLE
    public static int numberOfAnimals;
    // if not-static is known as dynamic, it belongs to the object
    private int legs;

    public static String shared = "HELLO";

    public Animal(int legs) {
        this.legs = legs;
        numberOfAnimals++;
    }

    public Animal() {
        numberOfAnimals++;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Animal();

        // numberOfAnimals is a STATIC field
        // so we don't need to create an animal to access it
        // if you want a global variable use public static blah blah blah
        System.out.println("Number of animals created = " + Animal.numberOfAnimals);

        a.shared = "GOODBYE";
        System.out.println(b.shared);
        // one use case of a static method when you want to global functions
        double value = Double.parseDouble("13.0");

    }
}
