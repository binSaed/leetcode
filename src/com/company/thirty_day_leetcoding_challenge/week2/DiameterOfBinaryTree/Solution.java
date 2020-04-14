package com.company.thirty_day_leetcoding_challenge.week2.DiameterOfBinaryTree;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }

    private int diameter(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left) + height(root.right), Math.max(diameter(root.left), diameter(root.right)));
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        return (1 + Math.max(height(node.left), height(node.right)));
    }

    //other solution
    //public class Solution {
    //    int max = 0;
    //
    //    public int diameterOfBinaryTree(TreeNode root) {
    //        maxDepth(root);
    //        return max;
    //    }
    //
    //    private int maxDepth(TreeNode root) {
    //        if (root == null) return 0;
    //
    //        int left = maxDepth(root.left);
    //        int right = maxDepth(root.right);
    //
    //        max = Math.max(max, left + right);
    //
    //        return Math.max(left, right) + 1;
    //    }
    //}
    public static void main(String[] args) {
        //Given a binary tree, you need to compute the length of the diameter of the tree.
        // The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
        // This path may or may not pass through the root.
        //
        //Example:1
        //Given a binary tree
        //          1
        //         / \
        //        2   3
        //       / \
        //      4   5
        //Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
        //
        //Example:2
        //Given a binary tree
        //          1
        //         / \
        //        2   3
        //       / \   \
        //      4   5    5
        //Return 4, which is the length of the path [4,2,1,3,5] or [5,2,1,3,5].
        //Note: The length of path between two nodes is represented by the number of edges between them.
    }

}
