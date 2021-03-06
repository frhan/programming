package me.farfaraway.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    //O(n^2)
    public static int[] twoSumNaive(int[] nums, int target)
    {
        for (int i = 0; i< nums.length; i++) {
            for (int j = 0; j< nums.length; j++) {
                if (i == j) {
                    continue;
                }

                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    //O(n)
    public static int[] twoSumMap(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{ map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }



    public static void main(String [] args) {
        //int[] result = twoSumMap(new int[]{3,2,4}, 6);
        int[] result = twoSumMap(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));
    }
}
