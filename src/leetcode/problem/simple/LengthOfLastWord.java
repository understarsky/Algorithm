package leetcode.problem.simple;
//58. 最后一个单词的长度  40% split分割，获取
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] ada = s.split(" ");
        if (ada.length == 0) return 0;
        return ada[ada.length - 1].length();
    }
}
