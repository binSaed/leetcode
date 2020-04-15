package com.company.thirty_day_leetcoding_challenge.week3.ProductOfArrayExceptSelf;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        //        nums =[2, 3, 4, 8]
        int length = nums.length;
        int[] newNums = new int[length];

        int[] left = new int[length];
        left[0] = 1;
        for (int i = 1; i < length; i++) left[i] = left[i - 1] * nums[i - 1];
        //        left =[1, 2, 6, 24]

        int[] right = new int[length];
        right[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) right[i] = right[i + 1] * nums[i + 1];
        //        right =[96, 32, 8, 1]
        for (int i = 0; i < length; i++) newNums[i] = left[i] * right[i];
        //        newNums =[96, 64, 48, 24]
        return newNums;
    }

    //0,0
    //Input:
//[1,0]
//Output:
//[0,0]
//Expected:
//[0,1]
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.productExceptSelf(new int[]{2, 3, 4, 8})));
    }
}
