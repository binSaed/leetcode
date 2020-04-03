package com.company.thirty_day_leetcoding_challenge.week1.SingleNumber;

import java.util.HashMap;

class Solution {

    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> numberAndAppears = new HashMap<>();

        for (int i : nums) {
            int count = 1;
            if (numberAndAppears.containsKey(i))
                count += numberAndAppears.get(i);//if num exist before increment the value

            numberAndAppears.put(i, count);
        }

        for (int i : nums) if (numberAndAppears.get(i) == 1) return i;// if found num appears one return it

        return -1;//if no item appears one time return -1
    }

    public static void main(String[] args) {
        //main Method for test only :)

        //Example 1:
        //
        //Input: [2,2,1]
        //Output: 1
        //Example 2:
        //
        //Input: [4,1,2,1,2]
        //Output: 4
        Solution s = new Solution();
        System.out.println(s.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}