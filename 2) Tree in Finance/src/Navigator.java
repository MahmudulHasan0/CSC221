public class Navigator{
	public Navigator() {}
	public void navigate(Node root, int N) 
	{	
		//Get number of nodes(N)  in a complete binary tree from a given height (T): N = 2^(T+1) - 1
		//To get the height (T) of complete binary tree from the number of nodes (N) in the tree: T =  [ln(N+1)-ln(2)] / ln(2)
	    //Couldnt input T so i had to calculate it:
		int treeHeightT = (int) Math.ceil( (Math.log(BinaomialTreeFactory.getSize()+1)- Math.log(2)) / Math.log(2) ); //this is basically T (the height of the tree)			    
	    
		for (int i = 1; i<=N; ++i) 
		{		
	    	Node cursor = root; 
			System.out.println("\nITERATION: "+i);
			while(cursor.getUpLink() != null && cursor.getDwnLink() != null ) 
			{
				int r = Test.generateProb();
				System.out.println("   GENERATED RANDOM NUMBER: "+r+ "       PROBABILITY OF THIS NODE: "+cursor.getP());
				if(r<=cursor.getP()) { //0<=r<=P UP
					cursor = cursor.getUpLink();
					System.out.print("       UP       ");		
				}
				else if(r>cursor.getP()) { //P<r<100 DOWN
					cursor = cursor.getDwnLink();
					System.out.print("       DOWN     ");
				}	
				System.out.println("TimePeriod: "+cursor.getT()+".....NodeID: "+cursor.getID()+"    ");				
			}
			
		}
	}
}
