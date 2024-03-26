/**
 *  297. Serialize and Deserialize Binary Tree
 *
 *  Serialization is the process of converting a data structure or object
 *  into a sequence of bits so that it can be stored in a file or memory
 *  buffer, or transmitted across a network connection link to be
 *  reconstructed later in the same or another computer environment.
 *
 *  Design an algorithm to serialize and deserialize a binary tree. There
 *  is no restriction on how your serialization/deserialization algorithm
 *  should work. You just need to ensure that a binary tree can be serialized
 *  to a string and this string can be deserialized to the original tree
 *  structure.
 *
 */

import datastructure.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Problem297 {

    private static final String DELIMITER = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    // Pre-Order
    private void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null").append(DELIMITER);
            return;
        }
        sb.append(node.val).append(DELIMITER);
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(DELIMITER)));
        return deserializeHelper(nodes);
    }

    private TreeNode deserializeHelper(Queue<String> nodes) {
        String val = nodes.poll();
        if (val.equals("null")) { return null; }

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeHelper(nodes);
        node.right = deserializeHelper(nodes);
        return node;
    }
}