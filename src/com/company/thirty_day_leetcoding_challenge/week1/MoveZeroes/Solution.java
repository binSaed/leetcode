package com.company.thirty_day_leetcoding_challenge.week1.MoveZeroes;

import java.util.Arrays;

public class Solution {

    public void moveZeroes(int[] nums) {
        var arrayWithoutZeros = Arrays.stream(nums).filter(value -> value != 0).toArray();
        for (int i = 0; i < nums.length; i++) nums[i] = (i < arrayWithoutZeros.length) ? arrayWithoutZeros[i] : 0;
    }

    //Other Solution
    /*-------1-------*/
//    public void moveZeroes(int[] nums) {
//        int length = nums.length;
//        int count = 0;
//        for (int i = 0; i < length; i++) if (nums[i] != 0) swapNumbers(nums, count++, i);
//    }
//
//    void swapNumbers(int[] arr, int pos1, int pos2) {
//        int temp = arr[pos2];
//        arr[pos2] = arr[pos1];
//        arr[pos1] = temp;
//    }
    /*-------1-------*/

    /*-------2-------*/
//    public void moveZeroes(int[] nums) {
////   I don't know why not accepted
//        int[] temp = new int[nums.length];
//        int countOfNumberNotZero = 0;
//        for (int i : nums) if (i != 0) temp[countOfNumberNotZero++] = i;
//        nums = temp;
//    }
    /*-------2-------*/

    public static void main(String[] args) {
        //main Method for test only :)

        //Input: [0,1,0,3,12]
        //Output: [1,3,12,0,0]
        Solution s = new Solution();
        s.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
