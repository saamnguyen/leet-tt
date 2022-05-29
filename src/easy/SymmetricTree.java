package easy;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode2 root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }


    public boolean isSymmetricHelp(TreeNode2 left, TreeNode2 right){
        if(left == null || right == null){
            return left == right;
        }
        if(left.val != right.val){
            return false;
        }
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();

        TreeNode2 treeNode2 = new TreeNode2(1);
        treeNode2.left = new TreeNode2(2);
        treeNode2.right = new TreeNode2(2);
        treeNode2.left.left = new TreeNode2(3);
        treeNode2.left.right = new TreeNode2(4);
        treeNode2.right.left = new TreeNode2(4);
        treeNode2.right.right = new TreeNode2(4);

        System.out.println(symmetricTree.isSymmetric(treeNode2));
    }
}

 class TreeNode2 {
      int val;
      TreeNode2 left;
      TreeNode2 right;
      TreeNode2() {}
      TreeNode2(int val) { this.val = val; }
      TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
//
//  Input: root = [1,2,2,3,4,4,3]
//          Output: true
//Input: root = [1,2,2,null,3,null,3]
//        Output: false