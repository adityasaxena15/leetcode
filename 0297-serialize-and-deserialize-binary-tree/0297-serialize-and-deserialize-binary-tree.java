/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Codec {

    int index = 0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuilder ans = new StringBuilder();

        serializeHelper(root, ans);

        return ans.toString();
    }

    public void serializeHelper(TreeNode node, StringBuilder ans) {

        if (node == null) {
            ans.append("null ");
            return;
        }

        ans.append(node.val).append(" ");

        serializeHelper(node.left, ans);
        serializeHelper(node.right, ans);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        index = 0;

        String[] values = data.split(" ");

        return deserializeHelper(values);
    }

    public TreeNode deserializeHelper(String[] values) {

        if (values[index].equals("null")) {
            index++;
            return null;
        }

        TreeNode node =
            new TreeNode(Integer.parseInt(values[index]));

        index++;

        node.left = deserializeHelper(values);
        node.right = deserializeHelper(values);

        return node;
    }
}