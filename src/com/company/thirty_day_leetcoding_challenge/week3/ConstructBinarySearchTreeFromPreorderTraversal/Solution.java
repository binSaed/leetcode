package com.company.thirty_day_leetcoding_challenge.week3.ConstructBinarySearchTreeFromPreorderTraversal;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) add(root, preorder[i]);
        return root;
    }

    private void add(TreeNode root, int value) {
        if (root == null) return;
        TreeNode newNode = new TreeNode(value);
        while (true) {
            if (value < root.val) {
                if (root.left == null) {
                    root.left = newNode;
                    break;
                }
                root = root.left;

            } else if (value > root.val) {
                if (root.right == null) {
                    root.right = newNode;
                    break;
                }
                root = root.right;

            } else break;
        }
    }

    public static void main(String[] args) {

        //Return the root node of a binary search tree that matches the given preorder traversal.
        //
        //(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)
        //
        //
        //
        //Example 1:
        //
        //Input: [8,5,1,7,10,12]
        //Output: [8,5,10,1,7,null,12]
        //
        //
        //
        //Note:
        //
        //1 <= preorder.length <= 100
        //The values of preorder are distinct.


        Solution s = new Solution();
        s.bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12});
    }
}