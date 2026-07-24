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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        levelOrder(root, res);
        return res;
    }
    public static void levelOrder(TreeNode root, List<List<Integer>> res) {
        Queue<TreeNode> elementQueue = new LinkedList<>();
        elementQueue.add(root);
        while(!elementQueue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = elementQueue.size();
            for(int i = 0; i < size; i++) {
                TreeNode element = elementQueue.poll();
                level.add(element.val);
                if(element.left != null) elementQueue.add(element.left);
                if(element.right != null) elementQueue.add(element.right);
            }
            res.add(level);
        }
    }
}