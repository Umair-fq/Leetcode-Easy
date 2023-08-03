public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
//        s = s.replaceAll("\\s+", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        String reverseStr = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverseStr += s.charAt(i);
        }

        if (reverseStr.equals(s)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ValidPalindrome palindrome = new ValidPalindrome();
        System.out.println(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(palindrome.isPalindrome(" "));
    }
}
