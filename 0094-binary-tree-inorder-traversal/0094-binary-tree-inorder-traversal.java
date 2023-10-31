/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> inorderValues = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return inorderValues;
        
        if (root.left != null) inorderTraversal(root.left);
        inorderValues.add(root.val);
        if (root.right != null) inorderTraversal(root.right);

        return inorderValues;
    }
}