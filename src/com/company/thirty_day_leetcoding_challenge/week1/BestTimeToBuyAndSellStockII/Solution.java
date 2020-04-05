package com.company.thirty_day_leetcoding_challenge.week1.BestTimeToBuyAndSellStockII;

import java.util.stream.IntStream;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices == null || prices.length == 0) return profit;
        if (isSorted(prices)) return (prices[prices.length - 1] - prices[0]);
        for (int i = 0; i < prices.length; i++)
            if (canBuy(prices, i) && prices[i] < prices[i + 1])
                profit += (prices[i + 1] - prices[i]);
        return profit;
    }

    private boolean isSorted(int[] array) {
        return IntStream.range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1]);
    }

    private boolean canBuy(int[] array, int index) {
        return array.length > index + 1;
    }

    public static void main(String[] args) {
        //main Method for test only :)

        //Input: [1,2,3,4,5]
        //Output: 4
        //Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
        //             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
        //             engaging multiple transactions at the same time. You must sell before buying again.

        // more Input: [6,1,3,2,4,7]->7 , [7,6,4,3,1]->0 , [1,2,3,4,5]->4
        Solution s = new Solution();
        System.out.println(s.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }
}
