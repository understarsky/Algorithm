package leetcode.problem.simple;
//package java.leetcode.problem.simple;
/*1，java的类加载器在加载文件时，之前已经加载了以java开头的包路径，也就是rt.jar里面的内容。为了安全，会阻止自定义的包名以java开头。解决方法：改变包的名即可。
2，编译版本与运行版本不一致导致的，在Windows->preferences->Java->compiler里面设置。
3.检查运行的jdk是不是错误，我就是这个错误，运行的都是jre，改成jdk就好
4.java版本问题，java和javac的路径不一致，重装jdk或者win10系统下把环境变量中的path路径中的java_home上移到第一位就解决这个问题了*/
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    暴力破解
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for(int j = i+1;j < nums.length;j++){
                if (nums[j] +nums[i] == target ) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum2(int[] nums, int target) {
//        Map map = new HashMap(); 确定map的数据类型
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int anotherValue = target - nums[i];
            if ( map.containsKey(anotherValue) && map.get(anotherValue) != i) {
                return new int[]{i, map.get(anotherValue)};
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int anotherValue = target - nums[i];
            if (map.containsKey(anotherValue)) {
                return new int[]{i, map.get(anotherValue)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution!");
    }

    public static void main(String[] args) {
        TwoSum twosum = new TwoSum();
        int[] target = twosum.twoSum2(new int[]{3,2,4}, 6);
        System.out.println(target[0] + " " + target[1]);
    }
}
