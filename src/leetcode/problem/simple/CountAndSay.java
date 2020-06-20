package leetcode.problem.simple;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";

        String result = "11";
        for(int i = 2; i < n; i++) {
            result = getNext(result + "");
        }
        return result;
    }
    private String getNext(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        int length = s.length();
        for(int i = 0; i < length-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
                continue;
            }
            else {
                result.append(count);
                result.append(s.charAt(i));
                count = 1;
            }
        }
        if(s.charAt(length-1) == s.charAt(length-2))
            result.append(count);
        else
            result.append("1");
        result.append(s.charAt(length-1));
        return result.toString();
    }
}
