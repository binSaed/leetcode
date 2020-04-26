package com.company.thirty_day_leetcoding_challenge.week4.JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.canJump(new int[]{2,3,1,1,4}));
    }
}
