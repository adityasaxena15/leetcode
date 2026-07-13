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
    public int countNodes(TreeNode root) {
       
      return  solution(root);
        
    }
        public int solution(TreeNode node){
             if(node == null){
            return 0;
        }

            int left = solution(node.left);
            int  right= solution(node.right);
        
        return left + right + 1;
        }
        
    }
