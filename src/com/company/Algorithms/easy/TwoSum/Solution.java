package com.company.Algorithms.easy.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Time complexity : O(n)
        //Space complexity : O(n)
        HashMap<Integer, Integer> valueAndIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (valueAndIndex.containsKey(complement))
                return new int[]{ valueAndIndex.get(complement),i};
            valueAndIndex.put(nums[i], i);
        }
        return null;
    }
    //Brute Force Solution
    //    public int[] twoSum(int[] nums, int target) {
    //        //loop over all nums
    //        //Time complexity : O(n^2)
    //        //Space complexity : O(1)
    //        for (int i = 0; i < nums.length; i++)
    //            for (int j = i + 1; j < nums.length; j++)
    //                if (nums[j] == target - nums[i]) return new int[]{i, j};
    //        return new int[0];
    //    }


    //    public int[] twoSum(int[] nums, int target) {
    //        //Time complexity : O(n)
    //        //Space complexity : O(n)
    //        HashMap<Integer, Integer> valueAndIndex = new HashMap<>();
    //        for (int i = 0; i < nums.length; i++) valueAndIndex.put(nums[i], i);
    //        for (int i = 0; i < nums.length; i++) {
    //            int complement = target - nums[i];
    //            if (valueAndIndex.containsKey(complement) && valueAndIndex.get(complement) != i)
    //                return new int[]{i, valueAndIndex.get(complement)};
    //        }
    //        return null;
    //    }


    public static void main(String[] args) {
        //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        //
        //You may assume that each input would have exactly one solution, and you may not use the same element twice.
        //
        //Example:
        //
        //Given nums = [2, 7, 11, 15], target = 9,
        //
        //Because nums[0] + nums[1] = 2 + 7 = 9,
        //return [0, 1].

        //Input:
        //[3,3]
        //6
        //Output:
        //[1,1]
        //Expected:
        //[0,1]

        //[3,2,4]
        //6
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 4, 4}, 6)));
    }
}
