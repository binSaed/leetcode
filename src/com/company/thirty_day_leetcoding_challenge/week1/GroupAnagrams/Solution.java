package com.company.thirty_day_leetcoding_challenge.week1.GroupAnagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var hashMap = new HashMap<String, List<String>>();
        for (String str : strs) {
            var chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStringKey = String.valueOf(chars);
            if (!hashMap.containsKey(sortedStringKey))
                hashMap.put(sortedStringKey, new ArrayList<>());
            hashMap.get(sortedStringKey).add(str);
        }
        return new ArrayList(hashMap.values());
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
        System.out.println(s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}

