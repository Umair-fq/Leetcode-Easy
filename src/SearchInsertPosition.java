// Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i;
        for (i= 0; i < nums.length; i++) {
            //if array contains the target
            if (nums[i] == target) {
                break;
            //if target is less than first element and needs to be inserted at front
            } else if (nums[i] > target && i == 0) {
                i = 0;
                break;
            //if target is greater than the current element and needs to be inserted at end
            } else if (nums[i] < target && i == nums.length-1) {
                i = nums.length;
                break;
            //if target is greater than current element and less than next element and needs to be inserted at some point
            // in middle
            } else if (nums[i] < target && target < nums[i+1]) {
                i = i + 1;
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        SearchInsertPosition position = new SearchInsertPosition();
        int nums[] = {1,3,5,6};
        System.out.println(position.searchInsert(nums, 5));
        System.out.println(position.searchInsert(nums, 2));
        System.out.println(position.searchInsert(nums, 7));
    }
}
