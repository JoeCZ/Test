package joe.Chapter4_4;

import joe.FourOne.TreeNode;

public class Question4_4 {
	static int listCount = 0;
	static LinkedListNode[] linkNode = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static LinkedListNode[] treeDepthList(TreeNode root) {
		if(root == null) return null;
		
		linkNode[listCount] = new LinkedListNode(root);
		if(root.left != null) {
			LinkedListNode newNode = new LinkedListNode(root.left);
			LinkedListNode.appendNode(newNode, linkNode[listCount + 1]);
		}
		if(root.right != null) {
			LinkedListNode newNode = new LinkedListNode(root.right);
			LinkedListNode.appendNode(newNode, linkNode[listCount + 1]);
		}
	}
	
	static Boolean checkNextList() {
		
	}
}

class LinkedListNode {
	private TreeNode root;
	private int data;
	private LinkedListNode head;
	private LinkedListNode end;
	private LinkedListNode next;
	
	public LinkedListNode(TreeNode root) {
		// TODO Auto-generated constructor stub
		this.root = root;
		
	}
	
	static public LinkedListNode appendNode(LinkedListNode n, LinkedListNode head) {
		if(head == null) {
			head.head = n;
			head.end = n;
		} else {
			head.end.next = n;
			head.end = n;
		}
		return head;
	}
	
	static public LinkedListNode removeFirst(LinkedListNode n) {
		if(n == null) return null;
	}
	static public Boolean isEmpty(LinkedListNode n) {
		
	}
}
