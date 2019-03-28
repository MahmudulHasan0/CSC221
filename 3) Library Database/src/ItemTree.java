import java.util.ArrayList;

public class ItemTree{
	private boolean start = true;
	private static int size; 	   //size of list or totla number of ndes in list
	ArrayList<Item> itemArray = new ArrayList<Item>(); //making an aray called item, that holds Item objects
	Node root;
	public ItemTree() {
		size = 1;
		root = new Node();
	}
	public static int getSize() {
		return size;
	}
	
	/*MAKING A BINARY SEARCH TREE UPON INSERT:*/
	public Node insert(Node root, Item item) 
	{
		if(root.getLeft()==null && root.getRight() == null && start == true) 
		{
			root.setItem(item);
			size++;
			start = false; //so that block dont run during recusrion
		}
		else 
		{
			/*ITEM IS LARGER THAN ROOT NODE (ADD TO RIGHT SUBTREE)*/
			if (root.getItem().getId().compareTo(item.getId()) <= 0) //new item is larger than root node -> add to right subtree
			{
				if (root.getRight() != null){ //if the root has something on the right of it, need to check it
					insert(root.getRight(), item);
				}
				else { //there is nothing on the right of root node, so can add the item
					root.setRight(new Node(item));
					
					size++;
				}
			}
			/*ITEM IS SMALLER THAN ROOT NODE (ADD TO LEFT SUBTREE)*/
			else //new item is smaller than root node -> add to left subtree
			{
				if (root.getLeft() != null){ //if the root has something on the right of it, need to check it
					insert(root.getLeft(), item);
				}
				else { //there is nothing on the right of root node, so can add the item
					root.setLeft(new Node(item));
					size++;
				}
			}	
		}
		this.root = root;
		return root;
	}
	public ArrayList<Item> printTree(Node root) 
	{
		/*TRANSVERSING THROUGH THE TREE AND ADDING TO ARRAYLIST*/
		/*CHECK LEFT SUBTREE*/
		//Recurion through left subtree and print the root nodes(bock below):
		if(root.getLeft() != null) {
			printTree(root.getLeft());	  //If there is a node less than this node, recursion with the left node. 
			itemArray.add(root.getItem()); //Once your done doing the left subtrees, can finally add the root node. Now will check this node's right subtree

		}
		else if(root.getLeft() == null) { 
			itemArray.add(root.getItem()); //If there is no node smaller, add this node since its the next smallest
		}
		/*CHECK RIGHT SUBTREE*/
		if(root.getRight() != null) {
			printTree(root.getRight());	 //If there is a node larger, recursion with that larger node

		}
		return itemArray;
	}
	
	

			
}
