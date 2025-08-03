package BinaryTree;

public class diameteroftree {
    int maxD = 0; // Use an instance variable instead of static

    int diameter(Node root) {
        height(root); // Start calculating heights
        return maxD; // Return the diameter
    }

    int height(Node root) {
        if (root == null) {
            return -1; // Height of a null node is -1
        }

        // Calculate the height of the left and right subtrees
        int leftH = height(root.left);
        int rightH = height(root.right);

        // Update the diameter if the current path is longer
        maxD = Math.max(maxD, leftH + rightH + 2);

        // Return the height of the current node
        return Math.max(leftH, rightH) + 1;
    }
}
