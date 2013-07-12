package joe.Chapter4_5;

import joe.FourOne.TreeNode;

/**
 * @author Joe Zhang
 * Implement a function to check if a binary tree is a binary search tree.
 *
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static Boolean isBST(TreeNode node) {
		if (node == null) return false;
		if(node.left != null) {
			if(node.left.data < node.data) isBST(node.left);
			else return false;
		}
		if(node.right != null) {
			if(node.right.data > node.data) isBST(node.right);
		}
		return true;
	}
}
