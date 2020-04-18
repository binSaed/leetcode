package com.company.thirty_day_leetcoding_challenge.week3.MinimumPathSum;

import java.util.Arrays;

public class Solution {
    public int minPathSum(int[][] grid) {
        //Todo
        //https://www.programcreek.com/2014/05/leetcode-minimum-path-sum-java/
        //https://leetcode.com/problems/minimum-path-sum/discuss/23647/My-8-lines-simple-solution
        //https://leetcode.com/problems/minimum-path-sum/discuss/214867/Java-DP-Solution-with-explanation-and-picture-O(mn)-time-and-O(1)-space
        //https://leetcode.com/problems/minimum-path-sum/discuss/324419/Java-solution-using-BFS-%2B-PriorityQueue.
        //https://leetcode.com/problems/minimum-path-sum/discuss/23555/AC-Java-DP-solution-v.s.-TLE-Dijstra-solution
        //https://leetcode.com/problems/minimum-path-sum/discuss/23564/Java-Easy-to-understand-10-lines
        //https://leetcode.com/problems/minimum-path-sum/discuss/23609/11-line-DP-in-Java-using-4ms
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) grid[i][j] += grid[i][j - 1];
                if (i != 0 && j == 0) grid[i][j] += grid[i - 1][j];
                if (i != 0 && j != 0) grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }


    public static void main(String[] args) {
        //Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
        //
        //Note: You can only move either down or right at any point in time.
        //
        //Example:
        //
        //Input:
        //[
        //  [1,3,1],
        //  [1,5,1],
        //  [4,2,1]
        //]
        //Output: 7
        //Explanation: Because the path 1→3→1→1→1 minimizes the sum.

        //base condition i==grid.length||j==grid[i].length
        Solution s = new Solution();
        int[][] grid = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1},
        };
        System.out.println(s.minPathSum(grid));

    }
}
