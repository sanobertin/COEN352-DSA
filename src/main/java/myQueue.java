import java.util.*;
import java.lang.*;
public class myQueue {
    public static void main(String[] args) {
        // put codes here
        Queue<Integer> mylist = new LinkedList<>();
        for (int i = 0 ; i < 10 ; i++) {
            Random rand = new Random();
            int temp = rand.nextInt(100);
            mylist.add(temp);
        }
        System.out.println(mylist);
        mylist.remove();
        System.out.println(mylist);
        mylist.remove();
        System.out.println(mylist);
        mylist.add(1000);
        System.out.println(mylist);
        mylist.remove();
    }
}
