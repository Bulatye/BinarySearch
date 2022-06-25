public class Main {

    public static void main(String[] args) {
        int[] array = {0,5,8,10,100,101,345,400,456,478,492,500,1000};

        int result = BinarySearch(array, 492);
        if (result != 0){
            System.out.println("Index found: " + result);
        }
    }
    /**
     * binary search - a classic search algorithm in a sorted array (vector)
     *
     * 1. Determining the value of an element in the middle of a data structure. The resulting value is compared with the key.
     * 2. If the key is less than the middle value, then the search is performed in the first half of the elements, otherwise - in the second.
     * 3. The search is reduced to the fact that the value of the middle element in the selected half is again determined and compared with the key
     * 4. The process continues until either an element with the key value is found or the search interval is empty.
     */
    public static int BinarySearch(int[] array, int item) {
        int low; // start range stored here
        int high; // end range
        int mid; // middle range
        int mid_value;

        high = array.length - 1;
        low = 0;

        while (low < high) { // the loop will be executed until the initial range is equal to the final
            mid = (low + high) >>> 1; // update middle index
            mid_value = array[mid]; // update guess number

            if (mid_value == item) { // return the found number
                return mid;
            }
            if (mid_value < item) {  // change start range if guess number less than item
               low = mid - 1;
            } else {
                high = mid + 1; // change end range if guess number more than item
            }
        }
        return 0; // return null if the required number was not found
    }
}
