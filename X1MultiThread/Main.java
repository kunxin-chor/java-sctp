
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        String filename = "numbers.txt";
        List<Double> numbers = new ArrayList<>();

        // Read all numbers from the file into a list
        // A buffered reader is a way of reading file by chunks of data at one go into the memory
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    try {
                        numbers.add(Double.parseDouble(line));
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number format: " + line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        } catch (Exception e) {
            System.out.println("Some kind of generic error");
        }

        // Split the problem size into two
        int size = numbers.size();
        int mid = size / 2;

        // Single-thread sum and timing
        long startSingle = System.nanoTime();
        double singleSum = 0;
        for (double num : numbers) {
            singleSum += num;
        }
        long endSingle = System.nanoTime();
        double timeSingleMs = (endSingle - startSingle) / 1_000_000.0;

        // Two-thread sum and timing
        long startMulti = System.nanoTime();
        // create two thread, the first is to sum from the first number to the half way size (excluding the slice)
        SumThread t1 = new SumThread(numbers, 0, mid);
        // thread 2 is sum from halfway point to the end
        SumThread t2 = new SumThread(numbers, mid, size);

        // Run the two threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double multiSum = t1.getPartialSum() + t2.getPartialSum();
        long endMulti = System.nanoTime();
        double timeMultiMs = (endMulti - startMulti) / 1_000_000.0;

        // Output results
        System.out.printf("Single-thread sum: %.4f, time: %.3f ms%n", singleSum, timeSingleMs);
        System.out.printf("Two-thread sum:   %.4f, time: %.3f ms%n", multiSum, timeMultiMs);
    }
}

class SumThread extends Thread {
    private final List<Double> list;
    private final int start;
    private final int end;
    private double partialSum = 0;

    public SumThread(List<Double> list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        double sum = 0;
        for (int i = start; i < end; i++) {
            sum += list.get(i);
        }
        partialSum = sum;
    }

    public double getPartialSum() {
        return partialSum;
    }
}
