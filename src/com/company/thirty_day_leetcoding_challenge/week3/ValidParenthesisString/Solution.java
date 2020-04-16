package com.company.thirty_day_leetcoding_challenge.week3.ValidParenthesisString;

public class Solution {
    public boolean checkValidString(String s) {
        // TODO: 4/16/20 plzz return to it back.
        // Time: O(N) s.length
        // Space: O(1)
        if (s.trim().equals("") || s == null) return true;//An empty string is also valid.
        int min = 0;
        int max = 0;
        var chars = s.toCharArray();
        for (var ch : chars) {

//            max += (ch == '(' || ch == '*') ? 1 : -1;
//            min += (ch == ')' || ch == '*') ? -1 : 1;

            if (ch == '(') {
                min++;
            } else {
                min--;
            }
            if (ch != ')') {
                max++;
            } else {
                max--;
            }

//            min += (ch == '(') ? 1 : -1;
//            max += (ch != ')') ? 1 : -1;
            if (max < 0) return false;
            min = Math.max(0, min);
        }
        return min == 0;
    }


    public static void main(String[] args) {
        //Let diff be count of left parenthesis minus count of right parenthesis.
        //
        //When we meet:
        //
        //(, we increment diff.
        //), we decrement diff.
        //*, we have three choices which makes the diff become a range -- [diff - 1, diff + 1].
        //So we use maxDiff/minDiff to record the maximum/minimum diff we can get.
        //
        //When we meet:
        //
        //(, ++maxDiff and ++minDiff.
        //), --maxDiff and --minDiff.
        //*, ++maxDiff and --minDiff.
        //If maxDiff become negative, it means it's already invalid, we should return false.
        //
        //Whenever minDiff falls below 0, we should force it to be 0 because we never accept negative diff during the process.
        //
        //After scanning through string s, as long as minDiff is 0, this string can be a valid one.
        Solution s = new Solution();
        System.out.println(s.checkValidString("((*)"));
    }
}
