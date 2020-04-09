package com.company.thirty_day_leetcoding_challenge.week2.BackspaceStringCompare;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> charsS = new Stack<>();
        Stack<Character> charsT = new Stack<>();
        for (var ch : S.toCharArray())
            if (ch != '#') charsS.add(ch);
            else {
                if (!charsS.isEmpty()) charsS.pop();
            }
        for (var ch : T.toCharArray())
            if (ch != '#') charsT.add(ch);
            else {
                if (!charsT.isEmpty()) charsT.pop();
            }
        return charsS.equals(charsT);
    }

    public static void main(String[] args) {

        //main Method for test only :)

        //Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
        //Output:
        //[
        //  ["ate","eat","tea"],
        //  ["nat","tan"],
        //  ["bat"]
        //]

        Solution s = new Solution();
        System.out.println(s.backspaceCompare("a##c", "#a#c"));
    }
}
