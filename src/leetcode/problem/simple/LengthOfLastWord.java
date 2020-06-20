package leetcode.problem.simple;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] ada = s.split(" ");
        if (ada.length == 0) return 0;
        return ada[ada.length - 1].length();
    }
}
