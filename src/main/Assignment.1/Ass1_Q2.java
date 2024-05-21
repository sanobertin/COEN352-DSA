/*
Author: Bertin Mihigo Sano
ID: 40157663
COEN 352 - DSA - Summer 2024
Assignment 1  Question 2
 */
import java.util.ArrayList; // this container is used as the underlying dynamic data structure for my stack
import java.util.Scanner;


public class Ass1_Q2 {
    public static class myCustomStack{
      private ArrayList<Character> elements;
      private Character top;
      public myCustomStack() {
            elements = new ArrayList<>();
            top = null;
        }
        public void pushString(String in){
          for (int i = 0; i < in.length(); i++) {
                push(in.charAt(i));
            }
        }
        public void push(Character element) {
          elements.add(element);
        }
        public void pop(){
          if (top == null && elements.size() > 0) { top = elements.getFirst();}
          elements.remove(top);
          top = elements.getFirst(); // always get the elements on the top of ArrayList
        }
        public Character peek(){
          return elements.get(0);
        }
        public Boolean isEmpty(){
          if(elements.isEmpty()){ return true ;} else { return false ; }
        }
        public void viewStack(){
          for (int i = 0 ; i < elements.size() ; i++) {
                System.out.print(i+1 + ": " + elements.get(i) + " \t");
            }
          System.out.println();
        }
        public Boolean isBalanced() {
          myCustomStack myCharStack = this;
            Boolean found = null;
            if (myCharStack.isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            } else {
                int tracker=0;
                switch (myCharStack.peek()) {
                    case '{':
                        myCharStack.pop(); // remove the character in test
                        tracker = 0;
                        while (!myCharStack.isEmpty()) {
                            if (myCharStack.peek() == '}') {
                                if (tracker % 2 == 0) {found = true;break;} else { found = false; break;}
                            }
                            else {
                                myCharStack.pop();
                                tracker++;
                            }
                        }
                        break;
                    case '[':
                        myCharStack.pop(); // remove the case in test
                        tracker = 0;
                        while (!myCharStack.isEmpty()) {
                            if (myCharStack.peek() == ']') {
                                if (tracker % 2 == 0) {found = true;break;} else { found = false; break;}
                            }
                            else {
                                myCharStack.pop();
                                tracker++;
                            }
                        }
                        break;
                    case '(':
                        myCharStack.pop(); // remove the case in test
                        tracker = 0;
                        while (!myCharStack.isEmpty()) {
                            if (myCharStack.peek() == ')') {
                                if (tracker % 2 == 0) {found = true;break;} else { found = false; break;}
                            }
                            else {
                                myCharStack.pop();
                                tracker++;
                            }
                        }
                        break;
                    default:
                        // will default if the expression is not balanced
                        System.out.println("Unexpected value: " + myCharStack.peek());
                        return false;
                        //break;
                }
            }
            return found;
        }
    };

    public static void main(String[] args) {
        myCustomStack words = new myCustomStack();
        System.out.println("***************************************************");
        System.out.println(" This program uses custom stacks to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.");
        System.out.print("Enter a string that contains the sequences described above: ");
        String inputData = new Scanner(System.in).nextLine();
        words.pushString(inputData);
        System.out.println("The stack elements are:");
        words.viewStack();
        for (int i = inputData.length()-1; i >=0; i--) {
            words.push(inputData.charAt(i));
        }
        if(words.isBalanced()) {
            System.out.println("The expression is balanced.");
        }
        else if(!(words.isBalanced())){
            System.out.println("The expression is not balanced.");
        }
    // my program ends here
    }
}
