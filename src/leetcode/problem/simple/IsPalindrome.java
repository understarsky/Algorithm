package leetcode.problem.simple;

public class IsPalindrome {
    // 67.74 %
    public boolean isPalindrome1(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            // 多余变量
            int pop = x % 10;
            revertedNumber = revertedNumber * 10 + pop;
            x /= 10;
        }
        // 多余判断
        if (revertedNumber == x || x == revertedNumber/10)
            return true;
        else
            return false;
    }
    // 99.05%
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return revertedNumber == x || x == revertedNumber/10;
    }
}
