
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter = 0;

        //firstly we will merge the array, so that all elements will be in one array
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[counter];
            counter++;
        }

        //now we will sort the array in ascending order
        for (int i = 0; i < nums1.length-1; i++) {
            for (int j = i+1; j < nums1.length; j++) {
                //if the current element is greater than next elements, then swap the elements
                if (nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n = 3 ; int m = 3;

        mergeSortedArray.merge(nums1, m, nums2, n);
    }
}
