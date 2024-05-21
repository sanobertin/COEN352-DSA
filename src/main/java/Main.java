import java.lang.*;
import java.util.*;


public class Main {
    public static int recurse(int n){
        if (n <= 0){
            System.out.println("End of myself!");
            return 0;
        }
        else {
            System.out.println("n = " + n + "\n");
            return n + recurse(n-1);
        }

    }
    public static void main(String[] args) {
        System.out.println("Sano ".repeat(5));
    }

}