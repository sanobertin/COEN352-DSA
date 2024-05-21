/*
Author: Bertin Mihigo Sano
ID: 40157663
COEN 352 - DSA - Summer 2024
Assignment 1  Question 1
 */

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections; // builtin used for sorting
import java.util.Random;
import java.util.Scanner;

public class Ass_1_Queue<E> {
    public Ass_1_Queue(){
        first = null;
        last = first;
    };
    public void enque(E item_to_add_on_queue){
        items.add(item_to_add_on_queue);
        this.last = items.getLast();
    };
    public E deque(){
        if (first == null && items.size()!=0) {
            first = items.getFirst();
        }
        E item_to_return = this.first;
        items.remove(first);
        first = items.getFirst();
        return item_to_return;
    };
    public E getmin(){
        ArrayList<E> temp = new ArrayList<E>();
        for (int i=0; i<items.size(); i++){ temp.add(items.get(i)); } // transfer all items from linkedlist to arraylist
        temp.sort(Collections.reverseOrder());
        E minima = temp.getLast();

        // return minimum item in the queue
        // need to traserve and sort the queue ?
        return minima;
    };
    public void PrintAll(){ // print all members using an iterator
        int counter = 1;
        for (E item : this.items) {
            System.out.print(counter + ") "  + item + "\t");
            counter++;
        }
        System.out.println();
    }

    private LinkedList<E> items = new LinkedList<>(); // all items on the queue
    private E first, last;

    // implementation
    public static void main(String[] args) {
        Ass_1_Queue<Integer> waitlist = new Ass_1_Queue<>();
        for(int i=0;i<10;i++){
            waitlist.enque(new Random().nextInt(100));
        }
        System.out.println("10 Random numbers added in queue");
        System.out.println("Waitlist");
        waitlist.PrintAll();
        System.out.println("Minimum item in the queue: " + waitlist.getmin());
        System.out.println("How many elements would you like to remove from the queue? :");
        int numbers_to_remove = (new Scanner(System.in)).nextInt();
        for(int i=0;i<numbers_to_remove;i++){
            waitlist.deque();
        }
        System.out.println("Updated waitlist");
        waitlist.PrintAll();
        System.out.println("Minimum item in the queue: " + waitlist.getmin());
        System.out.println("How many new elements would you like to add to the queue? :");
        int numbers_to_add = (new Scanner(System.in)).nextInt();
        if(numbers_to_add == 0 ) {
            System.out.println("No new elements added");
        }
        else {
            for(int i=0;i<numbers_to_add;i++){ waitlist.enque(new Random().nextInt(100));
            }
        }

        System.out.println("Waitlist status");
        waitlist.PrintAll();
        System.out.println("Minimum item in the queue: " + waitlist.getmin());

    }
}
