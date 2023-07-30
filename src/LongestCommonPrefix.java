//Write a function to find the longest common prefix string amongst an array of strings.
//        If there is no common prefix, return an empty string "".


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        //taking first word as a prefix
        String prefix = strs[0];

        //now we will check iteratively that if 0th index word is a prefix in 1st index word
        //if not then we wil reduce the length of prefix one by one from the ends.
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) < 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.length() == 0) {
                    return "";
                }
            }
        }

        //now we have to check that all words contains the prefix at the same position.
        //taking occurrence of prefix in first word
        int index = strs[0].indexOf(prefix);
        for (int i = 1; i < strs.length; i++) {
            while (index != strs[i].indexOf(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
            }
            if (prefix.length() == 0) {
                return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        System.out.println(obj.longestCommonPrefix(strs));;
    }
}
