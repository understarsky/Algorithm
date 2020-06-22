package leetcode.problem.simple;

public class PLusOne {
//    66. 加一 100.00%
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(len == 1 && digits[0] == 0) return new int[]{1};
        int recogniseForward = 0;
        for (int i = len - 1; i > 0 ; i--) {
            if(digits[i] != 9) {
                digits[i] = digits[i] + 1;
                break;
            } else {
                digits[i] = 0;
                recogniseForward++;
            }
        }
        if(recogniseForward == (len - 1) && digits[0] != 9) {
            digits[0] = digits[0] + 1;
            return digits;
        }
        if(recogniseForward == (len - 1) && digits[0] == 9) {
            digits[0] = 0;
            int[] result = new int[len+1];
            result[0] = 1;
            for (int i = 1; i < len + 1; i++) {
                result[i] = 0;
            }
            return result;
        }
        return digits;
    }
}
