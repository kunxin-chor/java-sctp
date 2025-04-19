package L8Loops;

public class LoopExample {
    public static void main(String[] args) {
        int[] primes = {1, 3, 5, 7, 11};
        int index = 0;
        while (index < primes.length) {
            System.out.println(primes[index]);
            index++;
        }

        for (int i = 0; i < primes.length; i++) {
            System.out.println(primes[i]);
        }

        // javascript: for(let...of)
        // for (let p of primes) { console.log(p)}
        System.out.println("Using a for : loop");
        for (int p : primes) {
            System.out.println(p);
        }

        // the LATEST Java version (like 3 or 4 years back has a `var` data type)
        var x = 3; // Java can auto-detect the data type from the value
        System.out.println("v =" + x);

        String[] fruits = {"Apples", "Oranges", "Pears"};
        for (var f : fruits) {
            System.out.println(f);
        }

    }


}
