import java.util.ArrayList;

public class SelectionSort {
    private ArrayList<Integer> list;
    ArrayList<Integer> sorted = new ArrayList<>();

    SelectionSort (ArrayList<Integer> list){
        this.list = list;
    }
    public ArrayList<Integer> getList(){
        return list;
    }

    public int findMin(){
        int min = list.get(0);

        for (int num : list)
            if (num < min) min = num;

        return min;
    }
    public void Sort(){
        int size = list.size();

        for (int i=0; i < size - 1; i++)
            sorted.add(list.remove(findMin()));

        list = sorted;
    }
}
