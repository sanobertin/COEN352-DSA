import java.util.*;
public class ShellSort {
    private static char choice;
    ShellSort (char choice) {
        this.choice = Character.toUpperCase(choice);
    }
    public static ArrayList<Integer> shellSort(ArrayList<Integer> container) {
        int size = container.size();
        switch(choice){
            case 'A': // uses h = 4x+1
            {
                for (int gap = size; gap > 0; gap = (gap/4) - 1 ) {
                    for (int i = gap; i < size; i++) {
                        int temp = container.get(i);
                        int j;
                        for (j = i; j >= gap && container.get(j - gap) > temp; j -= gap) {
                            container.set(j, container.get(j - gap));
                        }
                        container.set(j, temp);
                    }

                }

            }
            case 'B':
            // ref: https://www.programiz.com/dsa/shell-sort
            // Hibbard's increment. 2^k -1
            {
                for (int gap = size; gap > 0; gap = (int) (Math.ceil(Math.log(gap)/Math.log(2)) -1)) {
                    for (int i = gap; i < size; i++) {
                        int temp = container.get(i);
                        int j;
                        for (j = i; j >= gap && container.get(j - gap) > temp; j -= gap) {
                            container.set(j, container.get(j - gap));
                        }
                        container.set(j, temp);
                    }

                }
                break;
            }
            default:
            {
                for (int gap = size; gap > 0; gap /= 2) {
                    for (int i = gap; i < size; i++) {
                        int temp = container.get(i);
                        int j;
                        for (j = i; j >= gap && container.get(j - gap) > temp; j -= gap) {
                            container.set(j, container.get(j - gap));
                        }
                        container.set(j, temp);
                    }

                }
            }

        }

        return container;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);
        System.out.println("After sort:");
        ShellSort ss = new ShellSort('b');
        ArrayList<Integer> after_sort = ss.shellSort(list);
        System.out.println(after_sort);

    }
}
