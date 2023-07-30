public class intPalindrome {

    //Given an integer x, return true if x is a
    //palindrome
    //, and false otherwise.
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] array = s.toCharArray();

        int n = array.length-1;

        for (int i = 0; i < array.length; i++) {
            if (s.charAt(n) == (array[i])) {
                n--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        intPalindrome obj = new intPalindrome();
        System.out.println(obj.isPalindrome(10));;
    }

}
