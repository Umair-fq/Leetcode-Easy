//Write a function that reverses a string. The input string is given as an array of characters s.
//        You must do this by modifying the input array in-place with O(1) extra memory.
//

public class ReverseString {
    public void reverseString(char[] s) {
        for(int i = s.length - 1, j = 0; j < i; j++, i--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(s);
        for(char c : s){
            System.out.print(c);
        }
    }
}
