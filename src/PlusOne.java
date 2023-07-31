//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the
// integer. The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int length = digits.length;
        //first of all check that is last digit 9 or not
        boolean isLastDigit9 = digits[length-1] == 9;
        //declaring a variable for checking if all digits are 9 in the array
        boolean isAllDigit9 = true;

        //if last digit is not 9 then simply add 1 to that and return
        if (!isLastDigit9) {
            digits[length-1] += 1;
            return digits;
        }
        else {
            //if the last digit is 9 then there comes two conditions firstly that
            //all digits are 9
            //or secondly there will be a digit which is not 9 and there we will add 1

            //swap last digit with 0 and 1 to previous index which is not 9
            digits[length-1] = 0;
            for (int i = length-2; i >= 0; i--) {
//                System.err.println(digits[i]);
                //if any digit comes which is not 9, so we will know and add 1 to that index
                if (digits[i] != 9) {
                    isAllDigit9 = false;
                }
                //until we have 9 on indices we will replace them with 0
                if (digits[i] == 9) {
                    digits[i] = 0;
                }
                //if we get any digit which is not 9 then adding 1 to that index
                else {
                    digits[i] += 1;
                    return digits;
                }
            }
        }
        if (isAllDigit9) {
            //if all digits in the array are 9 so we will create an array with one more index
            //than digits array

//            System.out.println("all digits are 9");
            int[] newArray = new int[length+1];
            //so will simply put 1 at the 0th index like 999 + 1 = 1000
            newArray[0] = 1;
            for (int i = 1; i < newArray.length; i++) {
                newArray[i] = 0;
            }
            return newArray;
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] array = {9, 9, 9, 9};
        int[] result = plusOne.plusOne(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
