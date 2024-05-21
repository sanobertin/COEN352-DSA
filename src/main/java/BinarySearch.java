import java.util.ArrayList;
import java.util.Random;

public class BinarySearch {
    public static Boolean BinarySearch(ArrayList<Integer> array, int target) {
        int low = 0 ;
        int high = array.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) == target) {
                return true;
            } else if (array.get(mid) < target) {
                high = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 0 ; j < 10000 ; j++) {
            list.add(new Random().nextInt(100));
        }
        //System.out.println(list);
        //System.out.println(BinarySearch(list, 2));
        System.out.println(args.length);
        return;
    }
}
