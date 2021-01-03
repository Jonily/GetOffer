/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
      if(root == null){
          return true;
      }
      if(Math.abs(getHigh(root.left) - getHigh(root.right))<=1){
          return isBalanced(root.left) && isBalanced(root.right);
      }
      return false;

    }

    public int getHigh(TreeNode root){
        if(root == null){
          return 0;
      }

        return Math.max(getHigh(root.left),getHigh(root.right))+1;
    }

}