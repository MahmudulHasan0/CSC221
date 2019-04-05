import java.util.ArrayList; 
public class Database {
	ArrayList<Item> item = new ArrayList<Item>(); //making an aray called item, that holds Item objects
	ItemTree itemTree;
	Node root;	
	
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	Database(){
		itemTree = new ItemTree();
		root = new Node();
	}
	
	public void addItem(Item item) {
		root = itemTree.insert(root, item);	
	}

	
	
	
	public void list() {
		System.out.println("PRINTING:");
		item =  itemTree.print(root);
		for (int i = 0; i<this.item.size(); i++) {
			System.out.print(item.get(i).getId()+"   ");
		}
		System.out.println("");
	}
	
	
	

	
	
}
