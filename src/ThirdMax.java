import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return the third distinct maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 */
public class ThirdMax {
    public int thirdMax(int[] nums) {

        int index = 0;

        //for removing duplicate numbers we are adding array numbers into arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j : nums) {
            if (!list.contains(j)) {
                list.add(j);
            }
        }

        //sorting arraylist using two pointers
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        //if length is at least 3, then we will return 3rd maximum
        if (list.size() >= 3) {
            return list.get(2);
        }
        //otherwise the largest element
        return list.get(0);
    }

    public static void main(String[] args) {
        ThirdMax thirdMax = new ThirdMax();
        System.out.println(thirdMax.thirdMax(new int[] {3,2,1}));
        System.out.println(thirdMax.thirdMax(new int[] {1,2}));
        System.out.println(thirdMax.thirdMax(new int[] {2,2,3,1}));
    }

}
