package easy;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode2 sortedArrayToBST(int[] nums){
        if(nums.length == 0) return null;

        TreeNode2 head = helper(nums, 0,nums.length - 1);
        return head;
    }

    public TreeNode2 helper(int[] num, int low, int high){
        if(low > high) return null;

        int mid = (low + high) / 2;
        TreeNode2 node = new TreeNode2(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);

        return node;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();

        System.out.println(convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[]{-10,-3,0,5,9}).right.val);
    }
}
//Input: nums = [-10,-3,0,5,9]
//        Output: [0,-3,9,-10,null,5]
//        Explanation: [0,-10,5,null,-3,null,9] is also accepted:
//        Input: nums = [1,3]
//        Output: [3,1]
//        Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.