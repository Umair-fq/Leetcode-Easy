/**
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
 * You must also not convert the inputs to integers directly.
 */

public class AddStrings {
    public String addStrings(String num1, String num2) {

        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();


        // Loop until either of the strings or the carry value is non-zero
        while(index1 >= 0 || index2 >= 0 || carry > 0){
            int value1, value2;
            // Get the numeric value of the current digit in num1, or 0 if out of bounds
            if(index1 >= 0){
                value1 = num1.charAt(index1) - '0';
            }else {
                value1 = 0;
            }

            if(index2 >= 0){
                value2 = num2.charAt(index2) - '0';
            }else {
                value2 = 0;
            }
            // Calculate the sum of digits from both numbers and the carry value
            int sum = value1 + value2 + carry;

            carry = sum / 10;
            sum %= 10;
            result.insert(0, sum);

            index1 -= 1;
            index2 -= 1;
        }


        return result.toString();
    }

    public static void main(String[] args) {
        AddStrings addStrings = new AddStrings();
        // System.out.println(addStrings.addStrings("123", "456"));
        // System.out.println(addStrings.addStrings("123", "11"));
        System.out.println(addStrings.addStrings("3876620623801494171", "6529364523802684779"));
        // System.out.println(addStrings.addStrings("0", "0"));
    }
}
