class Solution {

int diameter = 0 ;


    public int diameterOfBinaryTree(TreeNode root) {

  solution(root);
  return diameter;

    }
  public int solution(TreeNode node){
     if(node == null){
        return 0;
     }
    int left = solution(node.left);
    int right = solution(node.right);

    diameter = Math.max(diameter ,left + right) ;
    return Math.max(left,right)+1;
       

  }
    }
        
        
   