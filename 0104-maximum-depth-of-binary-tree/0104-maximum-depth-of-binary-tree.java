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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> elementQueue = new LinkedList<>();
        int maxDepth = 0;
        elementQueue.add(root);
        while(!elementQueue.isEmpty()) {
            
            int size = elementQueue.size();
            for(int i = 0; i < size; i++) {
                TreeNode element = elementQueue.poll();
                if(element.left != null) elementQueue.add(element.left);
                if(element.right != null) elementQueue.add(element.right);

            }
            maxDepth++;
        }
        return maxDepth;
    }
}