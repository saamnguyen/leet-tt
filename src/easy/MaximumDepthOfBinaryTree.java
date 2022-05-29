package easy;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode2 root) {
        if(root == null) return 0;

        int left = maxDepth(root.left);
        System.out.println(left + " left");
        int right = maxDepth(root.right);
        System.out.println(right + " right");

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        TreeNode2 treeNode3 = new TreeNode2(1);
        treeNode3.left = new TreeNode2(2);
        treeNode3.right = new TreeNode2(20);
        treeNode3.right.left = new TreeNode2(14);
        treeNode3.right.right = new TreeNode2(7);

        System.out.println(maximumDepthOfBinaryTree.maxDepth(treeNode3));
    }
}
