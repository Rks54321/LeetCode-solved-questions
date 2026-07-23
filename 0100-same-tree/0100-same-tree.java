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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> leftHeight = new LinkedList<>();
        Queue<TreeNode> rightHeight = new LinkedList<>();
        leftHeight.add(p);
        rightHeight.add(q);

        while(!leftHeight.isEmpty() && !rightHeight.isEmpty()) {
            TreeNode leftElement = leftHeight.poll();
            TreeNode rightElement = rightHeight.poll();
            if(leftElement == null && rightElement == null) continue;
            if(leftElement == null || rightElement == null || leftElement.val != rightElement.val) return false;

            leftHeight.add(leftElement.left);
            rightHeight.add(rightElement.left);

            leftHeight.add(leftElement.right);
            rightHeight.add(rightElement.right);
        }
        return true;
    }
}