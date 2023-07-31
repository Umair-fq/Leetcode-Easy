//Given a string s consisting of words and spaces, return the length of the last word in the string.
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        //we firstly converted string into array of words using split method in which we do splitting of words by space
        String[] arrayOfWords = s.split(" ");
        //then we take the last word or element present in the array
        int size = arrayOfWords.length;
        String lastWord = arrayOfWords[size-1];
        //then we take the length of last word
        int lengthOfLastWord = lastWord.length();
        return lengthOfLastWord;
    }

    public static void main(String[] args) {
        LengthOfLastWord lastWord = new LengthOfLastWord();
        System.out.println(lastWord.lengthOfLastWord("hello world"));
    }
}
