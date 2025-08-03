package BinaryTree;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

class Solution {
    static int i;  
    static HashMap<Integer, Integer> m;

    public static Node buildTree(int inorder[], int preorder[]) {
        i = 0;  // Reset i before building a new tree
        m = new HashMap<>();
        for (int j = 0; j < inorder.length; j++) 
            m.put(inorder[j], j);
        return build(preorder, 0, inorder.length - 1);
    }

    private static Node build(int[] preorder, int l, int r) {
        if (l > r || i >= preorder.length) return null;  // Added boundary check
        Node n = new Node(preorder[i++]);
        int idx = m.get(n.data);
        n.left = build(preorder, l, idx - 1);
        n.right = build(preorder, idx + 1, r);
        return n;
    }

    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int preorder[] = {3, 1, 4, 0, 5, 2};
        int inorder[] = {0, 1, 3, 4, 2, 5};
        Node root = buildTree(inorder, preorder);
        postorder(root);  // Expected Output: 3 4 1 5 2 0
    }
}
