//T = integer to indicate the # of time periods. (this is the depth/length  of a tree). 
//P = probability of going up -> integer 0 to 100 to indicate prob of movement (whats the probability of the stock going up or down?) Prob of down = 100-P
public final class BinaomialTreeFactory 
{
	private static int size; 	   //size of list or totla number of ndes in list
	public static int heighOfTree; //a way to keep track of the user input T (height of tree) so it doesnt change during recall
	
	public BinaomialTreeFactory() {
		size = 0;
		heighOfTree = 0;
	}
	
	public static int getSize() {
		return size;
	}
	public static void setSize(int size) {
		BinaomialTreeFactory.size = size;
	}
	
	public static Node create(int T, int P) 
	{   
		//THIS IS TO STORE THE INITIAL T: (since T will change throughout the recursion)
		if (size==0) { 
			heighOfTree = T;
		}			
		//MAKING THE TREE:
		size++;
		Node root = new Node(heighOfTree-T, P, size);
		if (T>0) //MAKING ALL LEVELS MINUS THE FINAL LEVEL OF TREE:
		{
			//Depending on if this is the up or down porbability node, Im setting its price:
			if(root.getP()>=50) { 
				root.setPrice(root.getPrice()*1.2);
			}
			else { 
				root.setPrice(root.getPrice()*0.8);
			}
			//Linking one up and one down node to the current node. Im also creating and then passing the up/down probability of those nodes:
			T--;
			P=Test.generateProb(); //generating probability of going up or down for next two nodes
			root.setUpLink(create(T, P));
			root.setDwnLink(create(T, 100-P));
		}
		return root;
	}
}
	
	
	
	
	
	