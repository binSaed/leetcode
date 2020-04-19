package com.company.thirty_day_leetcoding_challenge.week3.NumberOfIslands;

public class Solution {
    public int numIslands(char[][] grid) {
        //https://www.programcreek.com/2014/04/leetcode-number-of-islands-java/
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++)
                if (grid[i][j] == '1') {
                    numIslands++;
                    changeOneToZero(grid, i, j);
                }
        return numIslands;
    }

    private void changeOneToZero(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        changeOneToZero(grid, i - 1, j);//go up
        changeOneToZero(grid, i + 1, j);//go down
        changeOneToZero(grid, i, j - 1);//go left
        changeOneToZero(grid, i, j + 1);//go right
    }

    public static void main(String[] args) {
        //Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
        //
        //Example 1:
        //
        //Input:
        //11110
        //11010
        //11000
        //00000
        //
        //Output: 1
        //Example 2:
        //
        //Input:
        //11000
        //11000
        //00100
        //00011
        //
        //Output: 3

        Solution s = new Solution();
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(s.numIslands(grid));
    }
}
