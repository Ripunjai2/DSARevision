package org.ripunjai.NeetCode_150;

import javax.swing.tree.TreeNode;


 // Definition for a binary tree node.

public class NC_8_Count_Good_Nodes {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int ans = 0;
    public int goodNodes(TreeNode root) {
        helper(root, 0);
        return ans;
    }

    public void helper(TreeNode root, int currMax){
        if(root != null) {
            if(currMax<=root.val){
                ans++;
                currMax = root.val;
            }
            helper(root.left, currMax);
            helper(root.right, currMax);
        }
    }

    public static void main(String[] args) {
        NC_8_Count_Good_Nodes obj = new NC_8_Count_Good_Nodes();
        TreeNode root = obj.new TreeNode(3);
        root.left = obj.new TreeNode(1);
        root.right = obj.new TreeNode(4);
        root.left.left = obj.new TreeNode(3);
        root.right.right = obj.new TreeNode(5);
        root.right.left = obj.new TreeNode(1);
        System.out.println(obj.goodNodes(root));
    }
}