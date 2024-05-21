import java.util.*;
import java.lang.*;


public class Deque {
    public Deque(){};
    public static void main(String[] args) {
        ArrayDeque<String> RestoReservation = new ArrayDeque<>();
        RestoReservation.addFirst("me");
        RestoReservation.addFirst("you");
        System.out.println(RestoReservation);

    }

}
