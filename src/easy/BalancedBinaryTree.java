package easy;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode2 root) {
        if(root == null) return true;

        return height(root) != -1;
    }
    public int height(TreeNode2 treeNode2){
        if(treeNode2 == null) return 0;

        int lH = height((treeNode2.left));
        if(lH == -1){
            return -1;
        }

        int rH = height(treeNode2.right);
        if(rH == -1) return  -1;

        if(lH - rH < -1 || lH - rH > 1) return  -1;

        return  Math.max(rH, lH) + 1;
    }

    public static void main(String[] args) {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

        TreeNode2 treeNode2 = new TreeNode2(3);
        treeNode2.left = new TreeNode2(9);
        treeNode2.right = new TreeNode2(20);
        treeNode2.right.left = new TreeNode2(15);
        treeNode2.right.left = new TreeNode2(7);

        System.out.println(balancedBinaryTree.isBalanced(treeNode2));
    }
}

//Input: root = [3,9,20,null,null,15,7]
//        Output: true
//        Input: root = [1,2,2,3,3,null,null,4,4]
//        Output: false
//        Input: root = []
//        Output: true