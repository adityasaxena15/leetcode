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
        
           return traversal(p,q);
    }


 public boolean  traversal(TreeNode p, TreeNode q) {
   

        
            if(p== null && q==null){
                return true;
            }
            if(p== null || q==null){
                return false;
            }
            if(p.val != q.val){
                return false;
            }

             boolean leftsubtree =traversal(p.left , q.left);
      boolean rightsubtree=traversal(p.right , q.right);
    
            if(leftsubtree != rightsubtree){
                return false;
            }


     
    
    return leftsubtree && rightsubtree;
 }
}