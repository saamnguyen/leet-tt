package easy;

public class SameTree {
    public boolean isSameTree(TreeNode1 p, TreeNode1 q) {
        if(p == null && q == null) return  true;
        if(p == null || q == null) return false;
        if(p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        TreeNode1 treeNode1 = new TreeNode1(1);
        TreeNode1 treeNode11 = new TreeNode1(1);

        treeNode1.left = new TreeNode1(2);
        treeNode1.right = new TreeNode1(3);

        treeNode11.left = new TreeNode1(2);
        treeNode11.right= new TreeNode1(3);

        System.out.println(sameTree.isSameTree(treeNode1, treeNode11));
    }
}



class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

//Input: p = [1,2,3], q = [1,2,3]
//        Output: true
//        Input: p = [1,2], q = [1,null,2]
//        Output: false
//        Input: p = [1,2,1], q = [1,1,2]
//        Output: false