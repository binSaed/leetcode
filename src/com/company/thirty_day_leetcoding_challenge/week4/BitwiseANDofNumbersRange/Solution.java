package com.company.thirty_day_leetcoding_challenge.week4.BitwiseANDofNumbersRange;

public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0) return 0;
        while (n > m) n = n & n - 1;
        return m & n;
    }

    //other solution
//    public int rangeBitwiseAnd(int m, int n) {
//        if (m == 0) return 0;
//        int ans = Integer.MAX_VALUE;
//
//        for (int i = m; i <= n && i >= 0; i++) {
//            int negate = Integer.MAX_VALUE - i;
//            if (negate < n && negate > m) return 0;
//            ans = ans & i;
//        }
//        return ans;
//    }

    public static void main(String[] args) {

        //Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
        //
        //Example 1:
        //
        //Input: [5,7]
        //Output: 4
        //Example 2:
        //
        //Input: [0,1]
        //Output: 0

        Solution s = new Solution();
        System.out.println(s.rangeBitwiseAnd(5, 7));
    }
}
