package joe.Chapter4_4;

import java.util.LinkedList;

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
		if(linkNode[listCount + 1].head == null) return false;
		else return true;
	}
	
	
}

class LinkedListNode {
	public TreeNode root;
	public LinkedListNode head;
	public LinkedListNode end;
	public LinkedListNode next;
	
	public LinkedListNode(TreeNode root) {
		// TODO Auto-generated constructor stub
		this.root = root;
		
	}
	
	static public LinkedListNode appendNode(LinkedListNode n, LinkedListNode listHead) {
		if(listHead == null) {
			listHead.head = n;
			listHead.end = n;
		} else {
			listHead.end.next = n;
			listHead.end = n;
		}
		return listHead;
	}
	
	static public LinkedListNode removeFirst(LinkedListNode n) {
		if(n == null) return null;
		if(n.next == null)  {
			n.head = null;
			n.end = null;
			return n;
		} else {
			n.head = n.next;
			return n;
		}
	}
	static public Boolean isEmpty(LinkedListNode n) {
		if(n.head == null) return true;
		else return false;
	}
}
