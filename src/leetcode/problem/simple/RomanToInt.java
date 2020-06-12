package leetcode.problem.simple;

public class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        if(s.length()==1) return getNumber(s.charAt(0));
        for(int i = s.length() - 1; i > 0; i--) {
            int num1 = getNumber(s.charAt(i));
            int num2 = getNumber(s.charAt(i-1));
            if (num1 > num2) {
                result = result +  (num1 - num2);
                i--;
            }
            else result += num1;
        }
//        三元表达，效率提升
        return  getNumber(s.charAt(0)) < getNumber(s.charAt(1)) ? result : (result + getNumber(s.charAt(0)));
    }
    private int getNumber(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default: return 0;
        }
    }
}