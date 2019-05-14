import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimeFactorsController {
		
    @FXML
    private TextField setListBox;
    
    @FXML
    private TextField allListBox;

    @FXML
    private Button enterButton;

    @FXML
    private TextField primeBox;

    @FXML
    private TextField inputBox;

    public static List<Integer> primeFactorization(int n) 
	{ 
		// PRIME NUMBERS: 2,3,5,7,11,13,17,19,...
		List<Integer> factors = new ArrayList<Integer>(); 
	    // How many 2's can go into this number?
	    while (n%2==0){ 
	        factors.add(2);
	        n = n / 2;  									//Ex: 54/2 -> 24
	    } 
	    // atm, n is odd (since it cant be divided by 2. 
	    // increments by 2 so that i is only the odd numbers. Ex: 3 5 7 9....
	    // dont need to run the loop past sqrt(n) because 
	    for (int i = 3; i <= Math.sqrt(n); i+= 2)  			//will run from i=3 to i<=5.196.
	    {
	        while (n%i == 0) 
	        { 
	            factors.add(i);
	            n = n / i; 
	        } 
	    } 
	    //This is the case when the remaining n is a prime number itself! The remaining n cant be broken down anymore:
	    if (n > 2) {
	        factors.add(n);
	    }
	    return factors;
	} 
   
    @FXML
    void clicked(ActionEvent event) 
    {    	
    	try 
    	{
    		int n = Integer.parseInt(inputBox.getText());
    		// ALL FACTORS:
    		List<Integer> factorsArray = new ArrayList<Integer>(); 
    	    factorsArray = primeFactorization(n);
    	    if(factorsArray.size() <= 1) { //if this is a prime number, add a 1 to the list
    	    	factorsArray.add(1);
    	    	primeBox.setText("THIS IS A PRIME NUMBER!");
    	    }
    	    else{
    	    	primeBox.setText("THIS IS NOT A PRIME NUMBER!");
    	    }
    	    allListBox.setText(factorsArray.toString());
    	    System.out.println("RAW FACTORS: "+factorsArray);
    	    // UNIQUE FACTORS (SET):
    	    Set<Integer> factorsSet = new HashSet<Integer>(factorsArray);
    	    setListBox.setText(factorsSet.toString());
    	    // PRINTING SET:
    	    System.out.print("LIST OF UNIQUE FACTORS: ");
    	    Iterator<Integer> it = factorsSet.iterator();   
    	    while(it.hasNext()){
    	    	System.out.print(it.next()+" ");
    	    }    
    	}

		catch(NumberFormatException ex){
			inputBox.setText("Enter a number");
			inputBox.selectAll();
			inputBox.requestFocus();
		}
}

   

}
