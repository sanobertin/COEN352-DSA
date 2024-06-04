import java.util.*;
import java.lang.*;

public class Timer {
    public Timer() {
        System.out.println("Timer created");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // counts in milliseconds
        for (int i = 0; i <= 100; i++) {
            long var = 10000 * 1000;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("After 100 iterations: ");
        System.out.println(endTime - startTime);
        startTime = 0;
        endTime = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            long var = 10000 * 1000;
        }
        endTime = System.currentTimeMillis();
        System.out.println("After 10000 iterations: ");
        System.out.println(endTime - startTime);

    }
}
