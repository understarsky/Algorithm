package leetcode.problem.simple;

public class strStr {
    public int strStr(String haystack, String needle) {
        if((needle == "" && haystack != "") | haystack.length() < needle.length())
            return -1;
        for(int i = 0; i < (haystack.length() - needle.length() + 1); i++) {
            String temp = haystack.substring(i, i+needle.length());
            if(temp.equals(needle))
                return i;
        }
        return -1;
    }
}
