import java.util.Random;
import javax.swing.JOptionPane;

public class Test {
	public static int generateProb() {
		Random r = new Random();
        int low = 0;
        int high = 100;
        return( r.nextInt(high-low) + low);
        //return 70;
	}

    public static void main(String[] args) 
    {
        int P = generateProb();
        int T = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter a number for the Time Period (T)\n"));
        int N = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter a number for the number of iterations (N)\n"));       
     
        Node tree = BinaomialTreeFactory.create(T,P);
        System.out.println("SIZE OF TREE: "+ BinaomialTreeFactory.getSize());
        System.out.println("HEIGHT OF TREE: "+T);

        //TEST THE NODES FOR T=2
//        System.out.println("\nTHIS IS A TEST TO CHECK ALL NODES OF T=2");
//        System.out.println("Initial Probability: "+P);
//        System.out.println("T=0: ROOT   : "+tree.getT()+ "    P: "+tree.getP()+ "    ID: "+tree.getID());
//        System.out.println("T=1: up     : "+tree.getUpLink().getT() + "    P: "+tree.getUpLink().getP() + "    ID: "+tree.getUpLink().getID() + "    Price: "+tree.getUpLink().getPrice());
//        System.out.println("T=1: dwn    : "+tree.getDwnLink().getT()+ "    P: "+tree.getDwnLink().getP()+ "    ID: "+tree.getDwnLink().getID()+ "    Price: "+tree.getUpLink().getPrice());
//
//        System.out.println("T=2: up up  : "+tree.getUpLink().getUpLink().getT()+ "    P: "+tree.getUpLink().getUpLink().getP() + "    ID: "+tree.getUpLink().getUpLink().getID() + "    Price: "+tree.getUpLink().getUpLink().getPrice());
//        System.out.println("T=2: up dwn : "+tree.getUpLink().getDwnLink().getT()+"    P: "+tree.getUpLink().getDwnLink().getP() +"    ID: "+tree.getUpLink().getDwnLink().getID() +"    Price: "+tree.getUpLink().getDwnLink().getPrice());
//        
//        System.out.println("T=2: dwn up : "+tree.getDwnLink().getUpLink().getT()+ "    P: "+tree.getDwnLink().getUpLink().getP()+ "    ID: "+tree.getDwnLink().getUpLink().getID()  + "    Price: "+tree.getDwnLink().getUpLink().getPrice());
//        System.out.println("T=2: dwn dwn: "+tree.getDwnLink().getDwnLink().getT()+ "    P: "+tree.getDwnLink().getDwnLink().getP()+ "    ID: "+tree.getDwnLink().getDwnLink().getID()+ "    Price: "+tree.getDwnLink().getDwnLink().getPrice());
//        System.out.println("....................................\n");
        
        Navigator n = new Navigator();
        n.navigate(tree, N); 
    }
}
