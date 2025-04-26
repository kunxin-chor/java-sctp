import java.util.ArrayList;

// Square: L X L, L*4
// Rectangle, L X W, (L+W) * 2
// Circle, 22/7 * radius ** 2, 2 * 22/7 * radius

public class Main {
    public static void main(String[] args) {
        System.out.println("Shapes!");

        // the array list is created to store Shape objects
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(10));  // but we can add square because Square extends Shape
        shapes.add(new Rectangle(5, 4)); // and likewise for rectangle, because Rectangle extends Shape

        for (Shape s: shapes) {
            System.out.println(s.calculateArea());  // Java will check whether s is a rectangle or square and call their overriden 
                                                    // calculate area --> Polymorphism
        }

        // We need an interface when two unrelated classes have to be
        // in the same arraylist, so both of those class will implement
        // the same interface, then they can be in the same arraylist
        ArrayList<IDrawable> stuff = new ArrayList<>();
        stuff.add(new Circle(10));
        stuff.add(new Text());
    }
}
