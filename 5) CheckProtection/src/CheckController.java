//Max number of places is 9
import java.math.BigDecimal;
import java.text.NumberFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/* FORMAL BIGDECIMAL TO CURRENCY FORM:
		public static String currencyFormat(BigDecimal n) { 	 //say i pass in: 33
		    return NumberFormat.getCurrencyInstance().format(n); //returns:       $33.00
		}	
 * OR:
		private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.format(n)	
 */

/* ROUND BIG DECIMAL:
		BigDecimal bg1
		bg1 = new BigDecimal("5.46497");
		
		MathContext mc = new MathContext(3); // 3 precision
		bg1 = bg1.round(mc);// bg1 is rounded using mc 
 */

/* TEXTFIELDS MANUPULATION:
  		GET:  BigDecimal amount = new BigDecimal(aTextField.getText()); 
  		SET:  aTextField.setText("bla");	
  
  private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
  private BigDecimal tipPercentage = new BigDecimal(0.15); //15% default
  BigDecimal tip = amount.multiply(tipPercentage);     
  tipTextField.setText(currency.format(tip));
 */

public class CheckController {
	public static String BigDecimalToCurrency(BigDecimal n) {
		return NumberFormat.getCurrencyInstance().format(n);
	}
	
    @FXML
    private Button enterButton;

    @FXML
    private TextField showTextBox;

    @FXML
    private TextField amountTextBox;

    @FXML
    void clicked(ActionEvent event) {
    	try {
    		BigDecimal amount = new BigDecimal(amountTextBox.getText()); //ex: pass in: 33 (length 2)
    		//Using Stringbuilder so that i can easily delete the first character which is a $:
	    	StringBuilder inputSB = new StringBuilder(BigDecimalToCurrency(amount)); //Will be: "$33.00" (length 6)
	    	inputSB.deleteCharAt(0);//Deletes the $ -> so now its: "33.00" (length 5)
    		StringBuilder entendedSB = new StringBuilder("*********"); //Strategy: 1) will add inputString to this. 2) delete size of inputStr from front
    		System.out.println("lenght of input: "+inputSB.length());
    		
    		if (inputSB.length() <= 9) { 
    			entendedSB.append(inputSB); //Will be: "*********33.00" (length 14)
    			int deleteFrom = inputSB.length()-1; //Since we added length of inputStr, will now delete size of inputStr
    			for (int i = deleteFrom; i>=0; i--) {
    				entendedSB.deleteCharAt(i);
    			}
    			String outputStr = entendedSB.toString(); //Wil be: "****33.00" (length 9) 
    			System.out.println(outputStr);
    			showTextBox.setText(outputStr);
    		}
    		else {
    			System.out.println("THE CHECK HAS MORE THAN 9 CHARACTERS WHEN INCLUDING CHANGE!");
    			showTextBox.setText("ERROR: MORE THAN 9 CHARS!");
    		}
    	}
    
		catch(NumberFormatException ex){
			amountTextBox.setText("Enter Amount From Check");
			amountTextBox.selectAll();
			amountTextBox.requestFocus();
		}
    }
}
