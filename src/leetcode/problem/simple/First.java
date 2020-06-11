package leetcode.problem.simple;

import java.util.HashMap;
import java.util.Map;
public class First {
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
        First fitst = new First();
        System.out.println(fitst.twoSum(new int[]{3,2,4}, 6));
    }
}
