package java.leetcode.problem.simple;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int templet = target - nums[i];
            if (map.containsKey(templet)) {
                return new int[]{i, (int)map.get(templet)};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum twosum = new TwoSum();
        System.out.println(twosum.twoSum(new int[]{3,2,4}, 6));
    }
}
