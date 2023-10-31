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
        internalTraversal(root);

        return inorderValues;
    }

    private void internalTraversal(TreeNode currentNode) {
        if (currentNode == null) return;
        
        if (currentNode.left != null) internalTraversal(currentNode.left);

        inorderValues.add(currentNode.val);

        if (currentNode.right != null) internalTraversal(currentNode.right);
    }
}