class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        

        if(root == null){
            return null;
        }
          return solution(root,p,q);

    }


        public TreeNode solution(TreeNode node , TreeNode p ,TreeNode q){

               if(node == null || node == p || node ==q){
                return node;
            
            }  

            TreeNode left = solution(node.left,p,q);
            TreeNode right = solution(node.right,p,q);

                
          
              if(left != null && right != null){
                return node;
              } 

            if(left == null){
            return right;
            }
           return left;

        }
        
    }













