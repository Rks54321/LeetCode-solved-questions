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
        Queue<TreeNode> leftElementQueue = new LinkedList<>();
        Queue<TreeNode> rightElementQueue = new LinkedList<>();

        leftElementQueue.add(p);
        rightElementQueue.add(q);

        while(!leftElementQueue.isEmpty() && !rightElementQueue.isEmpty()) {
            TreeNode leftElement = leftElementQueue.poll();
            TreeNode rightElement = rightElementQueue.poll();
            if(leftElement == null && rightElement == null) continue;
            if(leftElement == null || rightElement == null || leftElement.val != rightElement.val) return false;

            leftElementQueue.add(leftElement.left);
            rightElementQueue.add(rightElement.left);

            leftElementQueue.add(leftElement.right);
            rightElementQueue.add(rightElement.right);
        }
        return true;
    }
}