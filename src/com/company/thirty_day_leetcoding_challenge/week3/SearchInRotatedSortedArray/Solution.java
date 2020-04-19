package com.company.thirty_day_leetcoding_challenge.week3.SearchInRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        int center = nums.length ^ 2;
        if (center % 2 != 0) center++;// if odd +1

        for (int i = center; i < nums.length; i++)
            if (nums[i] == target) return i;//from center to end
        //if not found in first for
        for (int i = 0; i < center; i++) if (nums[i] == target) return i;//from start to center

        return -1;// if target not found return -1
    }

    public static void main(String[] args) {
        //Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
        //
        //(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
        //
        //You are given a target value to search. If found in the array return its index, otherwise return -1.
        //
        //You may assume no duplicate exists in the array.
        //
        //Your algorithm's runtime complexity must be in the order of O(log n).
        //
        //Example 1:
        //
        //Input: nums = [4,5,6,7,0,1,2], target = 0
        //Output: 4
        //Example 2:
        //
        //Input: nums = [4,5,6,7,0,1,2], target = 3
        //Output: -1
        Solution s = new Solution();
        System.out.println(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
