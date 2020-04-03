package com.company.thirty_day_leetcoding_challenge.week1.MaximumSubarray;


public class Solution {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;

        if (nums.length == 1) return nums[0];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, sum += num);
            sum = Math.max(sum, 0);
        }
        return max;
    }

    public static void main(String[] args) {
        //main Method for test only :)

        //Input: [-2,1,-3,4,-1,2,1,-5,4],
        //Output: 6
        //Explanation: [4,-1,2,1] has the largest sum = 6.

        Solution s = new Solution();

        System.out.println(s.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
