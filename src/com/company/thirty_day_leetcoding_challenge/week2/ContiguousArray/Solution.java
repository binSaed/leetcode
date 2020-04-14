package com.company.thirty_day_leetcoding_challenge.week2.ContiguousArray;

import java.util.Stack;

public class Solution {
    public int findMaxLength(int[] nums) {
        Stack<Integer> leftSubArray = new Stack<>();
        Stack<Integer> rightSubArray = new Stack<>();
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSubArray.isEmpty() || (rightSubArray.isEmpty() && leftSubArray.peek() == nums[i]))
                leftSubArray.push(nums[i]);
            else if (rightSubArray.isEmpty() || (!leftSubArray.isEmpty() && rightSubArray.peek() == nums[i]))
                rightSubArray.push(nums[i]);
            else {
                i--;
                for (var temp : leftSubArray.toArray()) {
                    if (!rightSubArray.isEmpty()) {
                        leftSubArray.pop();
                        rightSubArray.pop();
                        maxLength += 2;
                    } else break;
                }
            }
        }
        return maxLength;
    }

    public int findMaxLengthc(int[] nums) {
        Stack<Integer> f = new Stack<>();
        int max = 0;
        //0,1,1,0,1,1,1,0
        for (int i : nums) {
            if (f.isEmpty() || f.peek() == i) f.push(i);
            else {
                f.pop();
                max += 2;
            }
        }return max;
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
        System.out.println(s.findMaxLengthc(new int[]{0,1,1,0,1,1,1,0}));
    }
}
