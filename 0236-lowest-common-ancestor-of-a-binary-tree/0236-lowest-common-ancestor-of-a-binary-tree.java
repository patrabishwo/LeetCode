/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if the current node is null, or matches p or q, return the current node
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search for LCA in the left and right subtrees
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        // If both left and right subtrees return non-null values, the current root is the LCA
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // Otherwise, return the non-null value between leftLCA and rightLCA
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
}
