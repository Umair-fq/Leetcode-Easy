//Reversing the array using in-place approach to avoid copying the array directly into memory
import java.util.Arrays;

public class ReverseArray {
    public int[] reverseArray(int[] array) {
        //we will use two pointers to reverse array, one from the beginning and one from the end
        for(int i = 0, j = array.length - 1; i < j; i++, j--) {
            /* swapping the elements */
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray.reverseArray(array)));
    }
}
