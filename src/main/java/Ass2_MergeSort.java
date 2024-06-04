import java.util.ArrayList;
import java.util.Random;

public class Ass2_MergeSort
{
    public static ArrayList<Integer> getRandomNumbers(Integer n){
        ArrayList<Integer> return_list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            Random rand = new Random();
            return_list.add( rand.nextInt(9999));
        }
    return return_list;
    }
    //public static MergeSort
    // main program starts below
    public static void main(String[] args) {
        ArrayList<Integer> list_N_500 = getRandomNumbers(500);
        ArrayList<Integer> list_N_1000 = getRandomNumbers(1000);
        ArrayList<Integer> list_N_2000 = getRandomNumbers(2000);
        ArrayList<Integer> list_N_4000 = getRandomNumbers(4000);
        ArrayList<Integer> list_N_8000 = getRandomNumbers(8000);

    }
}
