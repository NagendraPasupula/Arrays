/**
 * Given preorder and inorder traversal of a tree, construct the binary tree. 
 */
 
 class TreeNode {
    int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
 }
 
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) return null;
        if(preorder.length==1) return new TreeNode(preorder[0]); 
        return Btree(preorder, inorder, 0, 0, inorder.length-1);
            }
    public TreeNode Btree(int[] preorder, int[] inorder, int pstart, int istart, int iend){
        if(istart > iend){return null;}
        TreeNode root = new TreeNode(preorder[pstart]);
        int temp =0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[pstart]){
                temp = i;
                break;
            }
        }
        root.left = Btree(preorder, inorder, pstart+1, istart, temp-1);
        root.right = Btree(preorder, inorder, pstart+temp-istart+1, temp+1, iend);
        return root;
    }	
	// preorder traversal
	static void display(TreeNode root){
	if(root==null) return;
	System.out.println(root.val);
	display(root.left);
	display(root.right);
	}
	public static void main(String[] args){
		Solution s = new Solution();
		display(s.buildTree(new int[]{1,2,4,5,3,7,6,8},new int[]{4,2,5,1,6,7,3,8}));		
	}
}