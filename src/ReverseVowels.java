import java.util.Stack;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
public class ReverseVowels {

    public boolean isVowel(char c){
        return (c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A'|| c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public String reverseVowels(String s) {
        Stack<Character> vowels = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            //if current character is vowel, push that to stack
            if(isVowel(s.charAt(i))){
                vowels.push(s.charAt(i));
            }
        }
        String str = "";
        for(int i = 0; i < s.length(); i++){
            if(!isVowel(s.charAt(i))){
                str += s.charAt(i);
            }else {
                str += vowels.pop();
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("hello"));
        System.out.println(new ReverseVowels().reverseVowels("world"));
        System.out.println(new ReverseVowels().reverseVowels("Robert"));
    }
}
