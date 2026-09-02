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

     return solution(root);

    }

        public int solution(TreeNode node ){

      if(node == null){
        return 0 ;
      }

      int left = solution(node.left);
      int right = solution(node.right);
      
      return Math.max(left , right ) + 1;
      }
        }

      