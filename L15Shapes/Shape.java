// once a class contans at least one abstract method it becomes an abstract class
// abstract is used as communication between programmers
// if a class is abstract and it has children, it also known as ABC - "Abstract Base Class"
abstract class Shape implements IDrawable, ISaveable {
    // it's not possible for a 'generic' shape to calculate its area
    // unless we have more info -- like what type of shape
    // when a method in a class cannot be called or does not have information to give a result ==> ABSTRACT method
    // child class MUST override abstract methods 
    // abstract classes is sometimes known as a contract
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return (width + length) * 2;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing at " + x + ", " + y);
    }

    @Override
    public void save(String filename) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
  

class Square extends Shape {
    private double length;
    
    public Square(double length) {
        this.length = length;
    }   

    @Override
    public double calculateArea() {
        return length * length;
    }

    @Override
    public double calculatePerimeter() {
        return length * 4;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing at " + x + ", " + y);
    }

    @Override
    public void save(String filename) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}

// abstract is to enforce a contract:
// in other ways, all children classes of Shape MUST have calculateArea and calculatePerimeter as overrides
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
       return 22/7 * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 22/7 * radius;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing at " + x + ", " + y);
    }

    @Override
    public void save(String filename) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}