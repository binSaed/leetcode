package com.company.thirty_day_leetcoding_challenge.week4.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    static class LRUCache {
        private Map<Integer, Integer> cache;
        private int capacity;

        public LRUCache(int capacity) {
            this.cache = new LinkedHashMap<>(capacity);
            this.capacity = capacity;
        }

        public int get(int key) {
            if (!cache.containsKey(key)) return -1;
            int valueTemp = cache.get(key);
            cache.remove(key);
            cache.put(key, valueTemp);
            return valueTemp;
        }

        public void put(int key, int value) {
            // If already present, then
            // remove it first. Note that
            // we are going to add later
            if (cache.containsKey(key)) cache.remove(key);

                // If cache size is full, remove the least
                // recently used.
            else if (cache.size() >= capacity) cache.remove(cache.keySet().iterator().next());
            cache.put(key, value);
        }
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);
//
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));       // returns -1 (not found)
        System.out.println(cache.get(3));       // returns 3
        System.out.println(cache.get(4));       // returns 4
    }
}
