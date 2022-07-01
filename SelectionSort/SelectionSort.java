public class SelectionSort {

    ArrayList<int> list = {1, 6, 7, -10, 7, 12, 6, 123, -140, 5};

    public static void main(String[] args) {
        System.out.println("Минимальное число: " + FindMinimal(list))


    }
    public static int FindMinimal(ArrayList<int> list){
        int minNumber = list[0];

        for (int number : list){
            if (number < minNumber){
                minNumber = number;
            }
        }
        return minNumber;
    }
}
