//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
// The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        //Actually we will store elements using index variable and elements of our choice or new elements will be stored
        int index = 0;
        int elementsRemoved = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;

            }else{
                elementsRemoved++;
            }
        }


        return index;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        RemoveElement obj = new RemoveElement();

        System.out.println(obj.removeElement(nums, 2));
    }
}
