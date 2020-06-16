package leetcode.problem.simple;

public class RemoveElement {
    /*
    * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
      内存消耗 :38.4 MB, 在所有 Java 提交中击败了5.68%的用户
    */
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
