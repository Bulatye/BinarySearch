import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class Main {


    static ArrayList<Integer> list = new ArrayList<>();
    static Random random = new Random();

    public static void main(String[] args) {
        for (int i=0; i < 20; i++){
            list.add(random.nextInt(101));
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();

        SelectionSort SelectionSort = new SelectionSort(list);
        SelectionSort.Sort();
        ArrayList<Integer> sorted = SelectionSort.getList();

        for (int num: sorted){
            System.out.print(num + "  ");
        }
    }
}
