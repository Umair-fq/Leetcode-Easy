public class AddBinary {

    public String addBinary(String a, String b) {
        int index1 = a.length()-1;
        int index2 = b.length()-1;

        int carry = 0, sum;
        String result = "";

        while (index1 >= 0 || index2 >= 0 || carry > 0){

            int intValue1, intValue2;
            if (index1 >= 0) {
                char bit1 = a.charAt(index1);
                intValue1 = Character.getNumericValue(bit1);
            }else {
                intValue1 = 0;
            }

            if (index2 >= 0) {
                char bit2 = b.charAt(index1);
                intValue2 = Character.getNumericValue(bit2);
            }else {
                intValue2 = 0;
            }


            sum = intValue1 + intValue2 + carry;
            carry = sum / 2;
            sum %= 2;


            String str = String.valueOf(sum);
            result += str;



            index1 -= 1;
            index2 -= 1;
        }
        String reversedString = "";
        for (int i = result.length()-1; i >= 0 ; i--) {
            reversedString += result.charAt(i);
        }
        return reversedString;
    }


    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("1010", "1011"));;
    }
}
