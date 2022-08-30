/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // error case
        if( p== null && q==null) return true;
        // if one tree is null
        if( p==null || q == null) return false;
        //one of p and q has a different value
        if( p.val != q.val) return false;
        
        //check left and right tree recursively 
        return isSameTree(p.left,q.left) &&  isSameTree(p.right,q.right);
    }
}
//time = O(n) number of nodes in tree
//space = O(n) in the worse case