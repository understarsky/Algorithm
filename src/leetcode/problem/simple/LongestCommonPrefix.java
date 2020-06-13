package leetcode.problem.simple;

public class LongestCommonPrefix {
    //78.53%
    //50.84%
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        int result = getSameString(strs[0], strs[1]);

        for(int i = 1; i < strs.length-1; i++) {
            result = Math.min(result,getSameString(strs[i], strs[i+1]));
        }
        return result == 0 ? "" : strs[0].substring(0,result);
    }

    private int getSameString(String s1, String s2) {
        int result = 0;
        for(int i = 0; i < Math.min(s1.length(), s2.length());i++) {
            if(s1.charAt(i) == s2.charAt(i))
                result++;
            else break;
        }
        return result;
    }
}
