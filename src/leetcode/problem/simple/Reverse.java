package leetcode.problem.simple;

public class Reverse {
    public int reverse(int x) {
        int rev = 0;
        while (x!=0) {
            int pop = x%10;
            x /= 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop >7 )) return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8 )) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
//      Integer.MAX_VALUE:  2147483647
//      Integer.MIN_VALUE: -2147483648
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.pow(2,31) - 1);
        System.out.println(Math.pow(2,-31));
        System.out.println(2147483647*10 );

    }

}
