package com.company.thirty_day_leetcoding_challenge.week3.LeftMostColumnWithAtLeastAOne;

import java.util.List;


// This is the BinaryMatrix's API interface.
// You should not implement it, or speculate about its implementation
interface BinaryMatrix {
    int get(int x, int y);
    List<Integer> dimensions();
}


public class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dim = binaryMatrix.dimensions();
        int rows = dim.get(0);
        int columns = dim.get(1);

        int result = -1;

        if (rows == 0 || columns == 0) return -1;

        int row = 0;
        int column = columns - 1;
        while (row < rows && column >= 0) {
            if (binaryMatrix.get(row, column) == 1) {
                result = column--;
            } else row++;
        }
        return result;
    }
}