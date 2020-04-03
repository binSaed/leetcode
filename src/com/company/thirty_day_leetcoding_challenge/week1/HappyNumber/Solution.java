package com.company.thirty_day_leetcoding_challenge.week1.HappyNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> numsVisited = new HashSet<>();//to return false if has a cycle

    public boolean isHappy(int n) {
        if (n == 1) return true;//return true when number = 1 "number is Happy :).

        int sum = sumOfSquaresAllNumInArray(intToArray(n));
        if (!numsVisited.contains(sum)) {
            numsVisited.add(sum);
            return isHappy(sum);
        }

        return false; // if num not happy return false ;(
    }

    private int sumOfSquaresAllNumInArray(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i * i;
        System.out.println(sum);
        return sum;
    }

    private int[] intToArray(int input) {
        return Arrays.stream(Integer.toString(input).split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {
        //main Method for test only :)

        //Input: 19
        //Output: true
        //Explanation:
        //12 + 92 = 82
        //82 + 22 = 68
        //62 + 82 = 100
        //12 + 02 + 02 = 1

        Solution s = new Solution();
        System.out.println(s.isHappy(200));//print ur result
    }
}
