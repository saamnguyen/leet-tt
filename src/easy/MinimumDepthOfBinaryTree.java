package easy;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode2 root) {
        if(root == null) return 0;

        //System.out.println(root.left);

        //Lay vi tri
        //left se tra ve ben trai cua cay
        //right thi nguoc lai
        int left = minDepth(root.left);
        System.out.println("left " + left);
        int right = minDepth(root.right);
        System.out.println("right " + right);
        System.out.println("return");

        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }

    public static void main(String[] args) {
        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();

        TreeNode2 treeNode2 = new TreeNode2(3);
        treeNode2.left = new TreeNode2(9);
        treeNode2.right = new TreeNode2(20);
        treeNode2.right.left = new TreeNode2(15);
        treeNode2.right.left = new TreeNode2(7);

        System.out.println(minimumDepthOfBinaryTree.minDepth(treeNode2));
    }
}
