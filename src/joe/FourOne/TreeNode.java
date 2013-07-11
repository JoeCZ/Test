package joe.FourOne;

public class TreeNode {
	public TreeNode right;
	public TreeNode left;
	public int data;
	public Boolean isVisited;
	
	public TreeNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.isVisited = false;
	}
	
	public void setNodeStatus(){
		this.isVisited = true;
	}
}
