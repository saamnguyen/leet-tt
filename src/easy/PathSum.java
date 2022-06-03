package easy;

public class PathSum {
    public boolean hasPathSum(TreeNode2 root, int targetSum) {
        if(root == null || targetSum == 0) return false;

        if(root.left == null && root.right == null && targetSum - root.val == 0) return true;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        PathSum pathSum = new PathSum();

        TreeNode2 treeNode2 = new TreeNode2(5);
        treeNode2.left = new TreeNode2(4);
        treeNode2.right = new TreeNode2(8);
        treeNode2.left.left = new TreeNode2(11);
        treeNode2.left.left.left = new TreeNode2(7);
        treeNode2.left.left.right = new TreeNode2(2);
        treeNode2.right.left = new TreeNode2(13);
        treeNode2.right.right = new TreeNode2(4);
        treeNode2.right.right.right = new TreeNode2(1);

        System.out.println(pathSum.hasPathSum(treeNode2, 22));
    }
}

//Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
//        Output: true
//        Explanation: The root-to-leaf path with the target sum is shown.
//        Input: root = [1,2,3], targetSum = 5
//        Output: false
//        Explanation: There two root-to-leaf paths in the tree:
//        (1 --> 2): The sum is 3.
//        (1 --> 3): The sum is 4.
//        There is no root-to-leaf path with sum = 5.
//        Input: root = [], targetSum = 0
//        Output: false
//        Explanation: Since the tree is empty, there are no root-to-leaf paths.