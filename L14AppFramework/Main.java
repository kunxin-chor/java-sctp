package L14AppFramework;

import java.util.ArrayList;
class Product {

}

class App {
    ArrayList<Product> products;
    public void run() {
        // all the code here
    }

}


public class Main {
    public static void main(String args[]) {
        App app = new App();
        app.run(); // run method is not static because it's not running from a class (i.e it's running object)
    }
}
