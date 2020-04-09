package com.company.thirty_day_leetcoding_challenge.week2.MiddleOfTheLinkedList;

import java.util.HashMap;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        //slowPointer go to next node every loop +1
        //fastPointer go to next next node every loop +2
        //when fastPointer reach the end slowPointer will be in the middle
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        if (head != null) while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }
    //other Solution
//    public ListNode middleNode(ListNode head) {
//        //add all nodes in hashMap with the count in linkedList
//        //in the end return node in hashMap.size/2
//        HashMap<Integer, ListNode> nodeHashMap = new HashMap<>();
//        int count = 0;
//        if (head != null) while (head != null) {
//            nodeHashMap.put(count++, head);
//            head = head.next;
//        }
//        return nodeHashMap.get(count / 2);
//    }

    //helper
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        //main Method for test only :)

        //Example 1:
        //
        //Input: [1,2,3,4,5]
        //Output: Node 3 from this list (Serialization: [3,4,5])
        //The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
        //Note that we returned a ListNode object ans, such that:
        //ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
        //Example 2:
        //
        //Input: [1,2,3,4,5,6]
        //Output: Node 4 from this list (Serialization: [4,5,6])
        //Since the list has two middle nodes with values 3 and 4, we return the second one.
        //
        //
        //Note:
        //
        //The number of nodes in the given list will be between 1 and 100.

    }
}