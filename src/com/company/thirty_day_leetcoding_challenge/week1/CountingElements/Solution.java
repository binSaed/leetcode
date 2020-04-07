package com.company.thirty_day_leetcoding_challenge.week1.CountingElements;

import java.util.HashSet;

public class Solution {
    public int countElements(int[] arr) {
        HashSet<Integer> hashArrWithoutDuplicate = new HashSet<>();
        int count = 0;
        for (int i : arr) hashArrWithoutDuplicate.add(i);
        for (int i : arr) if (hashArrWithoutDuplicate.contains((i + 1))) count++;
        return count;
    }

    public static void main(String[] args) {

        //main Method for test only :)

        //Example 1:
        //
        //Input: arr = [1,2,3]
        //Output: 2
        //Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
        //Example 2:
        //
        //Input: arr = [1,1,3,3,5,5,7,7]
        //Output: 0
        //Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
        //Example 3:
        //
        //Input: arr = [1,3,2,3,5,0]
        //Output: 3
        //Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
        //Example 4:
        //
        //Input: arr = [1,1,2,2]
        //Output: 2
        //Explanation: Two 1s are counted cause 2 is in arr.

        Solution s = new Solution();
        System.out.println(s.countElements(new int[]{1, 2, 3}));
    }
}
