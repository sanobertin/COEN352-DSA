// Import the HashSet class
import java.util.ArrayList;

public class Test {
    public static void BubbleSort(ArrayList<Double> container){
        int size = container.size();
        double temp = 0;
        for (int j = 0; j < size - 1; j++){
            for (int i = 0; i < size-j-1; i++) {
                if (container.get(i) > container.get(i + 1)) {
                     temp = container.get(i);
                     container.set(i, container.get(i + 1));
                     container.set(i + 1, temp);
                    temp = 0;
                } // swap condition
            }

        }
    }
    public static void SelectionSort(ArrayList<Double> container){
        Double minimimum; // selecting 1st item on the data
        int min_index;
        for (int step = 0 ; step < container.size() - 1 ; step++){
            minimimum = container.get(step);
            min_index = step;
            for (int j = step+1; j < container.size() ; j++){
                if ( container.get(j) < container.get(step)) {
                    min_index = j;
                }
            }
            Double temp = container.get(step);
            container.set(step, container.get(min_index));
            container.set(min_index, temp);

        }
    }
    public static void main(String[] args) {
        ArrayList<Double> cont = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            cont.add(Math.random()*100);
        }
        for (Double it : cont) {
            System.out.println(it); // print all random values
        }
        //BubbleSort(cont);
        SelectionSort(cont);
        System.out.println("\n After Selection Sort");
        for (Double it : cont) {
            System.out.println(it); // print all random values
        }

        //ArrayList.sort
    }

}