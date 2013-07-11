package joe.FourTwo;

public class Node {
	private Node[] adjacent;
	private String vertex;
	private int adjacentCount;
	public Question.State state;
	public Node(String vertex, int adjacentLength) {
		this.vertex = vertex;
		adjacentCount = 0;
		adjacent = new Node[adjacentLength]; 
	}
	
	public void addAdjacent(Node n) {
		this.adjacent[adjacentCount] = n;
		adjacentCount++;
	}
	
	public Node[] getAdjacent() {
		return adjacent;
	}
	
	public String getVertex(){
		return vertex;
	}
}
