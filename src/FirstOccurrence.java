//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
// or -1 if needle is not part of haystack.
public class FirstOccurrence {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }

    public static void main(String[] args) {
        FirstOccurrence occurrence = new FirstOccurrence();
        System.out.println(occurrence.strStr("sadbutsad", "sad"));
        System.out.println(occurrence.strStr("leetcode", "leeto"));
    }
}
