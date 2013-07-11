package joe.FourOne;

public class test {
	static TreeNode rootNode;
	
	static private TreeNode initNode (TreeNode tree) {
		tree = new TreeNode(0);
		tree.left = new TreeNode(1);
		tree.right = new TreeNode(2);
		tree.left.left = new TreeNode(3);
		tree.left.left.left = new TreeNode(4);
		return tree;
	}
	
	static public int heightOfNode(TreeNode root) {
		int l, r;
		if (root == null) return 0;
		if (root.left == null) {
			l = 0;
		} else {
			l = heightOfNode(root.left);
		}
		if (root.right == null) {
			r = 0;
		} else {
			r = heightOfNode(root.right);
		}
		
		return Math.max(l, r) + 1;
	}
	
	static public Boolean isBalancedTree(TreeNode root) {
		int l, r;
		if(root == null) return true;
		if (root.left == null) {
			l = 0;
		} else {
			l = heightOfNode(root.left);
		}
		if (root.right == null) {
			r = 0;
		} else {
			r = heightOfNode(root.right);
		}
		if (Math.abs(r-l) > 1) return false;
		
		return true;
	}
	
	 void run(){
		TreeNode root = initNode(rootNode);
		if(isBalancedTree(root)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test().run();		
	}

}
