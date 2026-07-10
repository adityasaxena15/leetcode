class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;

        while (!q.isEmpty()) {

            List<Integer> currentLevel = new ArrayList<>();

            int size = q.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                currentLevel.add(node.val);

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            if (level % 2 == 1) {
                Collections.reverse(currentLevel);
            }

            ans.add(currentLevel);
            level++;
        }

        return ans;
    }
}