package leetcode.problem.simple;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target) return 0;
        if (nums[nums.length-1] < target) return nums.length;

        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while(left < right) {
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else right = mid;
            mid = (left + right) / 2;
        }
        return mid;
    }
}
