//        Given an integer array nums, move all 0's to the end of it
//        while maintaining the relative order of the non-zero elements.
//        Note that you must do this in-place without making a copy of the array.
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            //taking second pointer so that we will keep track of the next position
                int j = i + 1;
                //if both first element is zero and second element is not zero then swap them
                if (nums[i] == 0 && nums[j] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                } else if(nums[i] == 0 && nums[j] == 0) {                  // if both are zero, then increment j until we get nonzero element or length is reached
                    while (j < nums.length && nums[j] == 0) {
                        j++;
                    }
                    // if j is less than nums.length
                    if (j < nums.length) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{2,1});
    }
}
