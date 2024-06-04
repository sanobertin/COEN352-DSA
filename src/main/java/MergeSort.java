import java.util.ArrayList;
import java.util.Random;

public class MergeSort {
    private static Random rand = new Random();
    private static ArrayList<Integer> merging(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> merged = new ArrayList<>();
        merged.addAll(left);
        merged.addAll(right);
        merged.sort(Integer::compareTo);
        return merged;
    }
    public ArrayList<Integer> mergeSort(ArrayList<Integer> container) {
        int length = container.size(); // get size of the container
        if ( length == 2 ) {
            int swap;
            if (container.get(0) > container.get( 1 )) {
                swap = container.get(0);
                container.set(0, container.get(1));
                container.set(1, swap);
            }
            else {
                return container;
            }
        }
        else if (length > 2) {
            int mid = length / 2;
            ArrayList<Integer> left = new ArrayList<>(container.subList(0, mid));
            ArrayList<Integer> right = new ArrayList<>(container.subList(mid, length));
            left = mergeSort(left);
            right = mergeSort(right);
            System.out.println("Left: " + left);
            System.out.println("Right: " + right);
            container = merging(left, right);
        }
        //else {return  container;} // this line executes if size = 1
        return container;
    }




    public static void main(String[] args) {
        ArrayList<Integer> container = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            container.add(rand.nextInt(100));
        }
        System.out.println(container);
        System.out.println("After sort:");
        MergeSort mergeSorter = new MergeSort();
        ArrayList<Integer> after_sort = mergeSorter.mergeSort(container);
        System.out.println(after_sort);

    }

}
