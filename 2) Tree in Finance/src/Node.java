//import BinaomialtimereeFactory.Node;

public class Node {
		private Node upLink;	//up_link_field
		private Node dwnLink;	//up_link_field
		private double price;   //Data_field
		private int P; //probability of node to go up
		private int T; //time level of this node in the brance. T=0 for root
		private int ID;//the specific ID of each node so that i can find them in my tests. This is assigned during the recursion in create(). 
		
		// CONSTRUCTORS: 
		public Node() {
			this.upLink = null; 
			this.dwnLink = null; 
		}
		public Node(double price) 
		{
			this.price = price;
			this.upLink = null; 
			this.dwnLink = null;
		}
		public Node(int T) 
		{
			this.T = T;
			this.upLink = null; 
			this.dwnLink = null;
		}
		public Node(Node upLink, Node dwnLink) 
		{
			this.upLink = upLink; //like NEXT POINTER
			this.dwnLink = dwnLink;
		}
		public Node(int T, int P) 
		{
			this.T = T;
			this.P = P; 
			this.upLink = null; 
			this.dwnLink = null;
		}
		public Node(int T, int P, int ID) 
		{
			this.T = T;
			this.P = P; 
			this.ID = ID;
			this.upLink = null; 
			this.dwnLink = null;
		}
		public Node(int T, int P, int ID, int price) 
		{
			this.T = T;
			this.P = P; 
			this.ID = ID;
			this.price = price;
			this.upLink = null; 
			this.dwnLink = null;
		}
		
		//GETTERS & SETTERS
		public Node getUpLink() {
			return upLink;
			
		}
		public void setUpLink(Node upLink) {
			this.upLink = upLink;
		}
		public Node getDwnLink() {
			return dwnLink;

		}
		public void setDwnLink(Node dwnLink) {			
			this.dwnLink = dwnLink;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getP() {
			return P;
		}
		public void setP(int p) {
			P = p;
		}
		public int getT() {
			return T;
		}
		public void setT(int t) {
			T = t;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		
		
	
}