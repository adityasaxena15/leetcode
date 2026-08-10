class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return ans;
        }

        int level = 0;
        q.offer(root);

        while (!q.isEmpty()) {

            List<Integer> levellist = new ArrayList<>();
            int size = q.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();
                levellist.add(node.val);

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            if (level % 2 == 1) {
                Collections.reverse(levellist);
            }

            ans.add(levellist);
            level++;
        }

        return ans;
    }
}
