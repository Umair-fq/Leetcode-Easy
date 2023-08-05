//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
// each unique element appears only once.
// The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        RemoveDuplicates obj = new RemoveDuplicates();
        System.out.println(obj.removeDuplicates(nums));

    }

    public int removeDuplicates(int[] nums) {
        //using set so that it will contain only unique elements
        Set<Integer> set = new HashSet<>();
        int size = nums.length;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            //if element has already came
            if (set.contains(nums[i])) {
//                System.out.println("duplicate identified");
                size--;
            }else {
                //if element is new
                set.add(nums[i]);
                nums[index] = nums[i];
                index++;
            }
        }
        for (int num : nums) {
            System.out.print(" " + num);
        }
        System.out.println();
        return size;
    }
}
