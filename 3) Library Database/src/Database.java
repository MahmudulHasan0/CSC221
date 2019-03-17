import java.util.ArrayList; 
public class Database {
	ArrayList<Item> itemArray = new ArrayList<Item>(); //making an aray called item, that holds Item objects
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
		System.out.println("AUTOMATICALLY SORTED BY ID UPON INSERT:\nID, Author/Artist/Director, Title,  AddedOn\n");
		itemArray =  itemTree.printTree(root);
		for (int i = 0; i<this.itemArray.size(); i++) {
			System.out.print(itemArray.get(i).getId()+",  ");
			//Print the author, artist, director if its a book, CD, or Video only
			if(itemArray.get(i).isTextbook() == true) { 
				System.out.print(itemArray.get(i).getAuthor()+",  "); 
			}
			if(itemArray.get(i).isCD() == true) { 
				System.out.print(itemArray.get(i).getArtist()+",  "); 
			}
			if(itemArray.get(i).isVideo() == true) { 
				System.out.print(itemArray.get(i).getDirector()+",  "); 
			}
			System.out.print(itemArray.get(i).getTitle()+",  ");
			System.out.println(itemArray.get(i).getAddedOn());
		}
		

	}
	
	
	

	
	
}
