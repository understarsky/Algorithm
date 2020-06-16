package leetcode.problem.simple;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
//        包含在下面情况中
/*
        if (nums.length == 1) return 1;
*/

        int effectiveNumber = 0;
        for(int i = 1; i< nums.length; i++) {
            if (nums[i] != nums[effectiveNumber]) {
                effectiveNumber++;
                nums[effectiveNumber] = nums[i];
            }
        }
        return effectiveNumber + 1;
    }
}
