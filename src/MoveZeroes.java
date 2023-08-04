//        Given an integer array nums, move all 0's to the end of it
//        while maintaining the relative order of the non-zero elements.
//        Note that you must do this in-place without making a copy of the array.
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int insertedPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertedPos++] = nums[i];
            }
        }
        while (insertedPos < nums.length) {
            nums[insertedPos++] = 0;
        }

        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println(nums[insertedPos-1]);
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{2,1});
        moveZeroes.moveZeroes(new int[]{0,1,0,3,12});
    }
}
