package com.company.thirty_day_leetcoding_challenge.week2.ContiguousArray;

import java.util.*;

public class Solution {

    public int findMaxLength(int[] nums) {
        // Make all the 0 to -1 first
        Map<Integer, Integer> map = new HashMap<>();
        // Whenever sum get add up to 0, we know we should add
        map.put(0, -1);
        int max = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) max = Math.max(max, i - map.get(count));
            else map.put(count, i);
        }
        return max;
    }

    public static void main(String[] args) {

        //Input:
        //[0,0,0,1,1,1,0]
        //Output:
        //4
        //Expected:
        //6


        //Input:
        //[0,1,0,1]
        //Output:
        //2
        //Expected:
        //4


        //Input:
        //[0,1,1,0,1,1,1,0]
        //Output:
        //6
        //Expected:
        //4

        //Input:
        //[0,0,1,0,0,0,1,1]
        //Output:
        //0
        //Expected:
        //6

        //Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
        //
        //Example 1:
        //Input: [0,1]
        //Output: 2
        //Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
        //Example 2:
        //Input: [0,1,0]
        //Output: 2
        //Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
        //Note: The length of the given binary array will not exceed 50,000.

        Solution s = new Solution();
        System.out.println("Output:" + s.findMaxLength(new int[]{0, 1}) + "  Expected:2");
        System.out.println("Output:" + s.findMaxLength(new int[]{0, 1, 0}) + "  Expected:2");
        System.out.println("Output:" + s.findMaxLength(new int[]{0, 1, 1, 0, 1, 1, 1, 0}) + "  Expected:4");
        System.out.println("Output:" + s.findMaxLength(new int[]{0, 1, 0, 1}) + "  Expected:4");
        System.out.println("Output:" + s.findMaxLength(new int[]{0, 0, 0, 1, 1, 1, 0}) + "  Expected:6");
        System.out.println("Output:" + s.findMaxLength(new int[]{0, 0, 1, 0, 0, 0, 1, 1}) + "  Expected:6");

    }
}
