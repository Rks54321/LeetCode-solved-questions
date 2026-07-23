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
        Queue<TreeNode> elementQueue = new LinkedList<>();
        if(root == null) return 0;
        elementQueue.add(root);
        int numbersOfLevels = 0;

        // Loop untill elementQueeue is not empty
        while(!elementQueue.isEmpty()) {
            int nodesAtLevels = elementQueue.size();
            if(nodesAtLevels == 0) return numbersOfLevels;
            if(nodesAtLevels > 0) {
                int size = elementQueue.size();
                for(int i = 0 ; i < size; i++) {
                    TreeNode element = elementQueue.poll();
                    if(element.left != null) elementQueue.add(element.left);
                    if(element.right != null) elementQueue.add(element.right); 
                }
                nodesAtLevels--;
            }
            numbersOfLevels++;
        } 
        return numbersOfLevels;
    }
}