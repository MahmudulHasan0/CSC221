import java.util.ArrayList;

public class Node {
	private Node right;	//if greater
	private Node left;	//if less
	Item item; 
	// CONSTRUCTORS: 
	public Node() {
		this.right = null; 
		this.left = null; 
	}
	public Node(Item item) {
		this.right = null; 
		this.left = null; 
		this.item = item;
	}
	
	//GETTERS AND SETTERS:
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
}
