
// COntroller imports that handle calculateButton and tipPercentageSlider events
import java.math.BigDecimal;
import java.math.RoundingMode; //will be used to specify how much BigDecimal vals are rounded during calculations 
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;


public class LoanController{
	// FORMATTERS FOR CURRENCY AND PERCENTAGES
	private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
	private static final NumberFormat percent = NumberFormat.getPercentInstance();
	private BigDecimal sliderDuration = new BigDecimal(0); //0% default
	
	// GUI controlls defines in FXML and used by the controller's code:
	@FXML
    private Slider slider;
	
	@FXML
    private Label sliderLabel;

    @FXML
    private TextField loan30TextBox;

    @FXML
    private TextField purchaseTextBox;

    @FXML
    private TextField intrestTextBox;

    @FXML
    private TextField loan10TextBox;

    @FXML
    private TextField loanCustomTextBox;

    @FXML
    private TextField loan20TextBox;

    @FXML
    private TextField downTextBox;

    @FXML
    private Button calculateButton;
    
    @FXML
    void calculateButtonPressed(ActionEvent event) {
    	try {
    		BigDecimal purchase = new BigDecimal(purchaseTextBox.getText()); 
    		BigDecimal downPayment = new BigDecimal(downTextBox.getText()); 
    		BigDecimal intrest = new BigDecimal(intrestTextBox.getText()); 
    		
    		// FORMULA: Using the loan payment calculation formula: monthly bill = A = P * r(1+r)^n / [(1+r)^n -1]
    		// A = payment Amount per period       
    		// P = initial Principal (loan amount)
    		// r = interest rate per period            = yearly intrest / 12 months in a cycle
			// n = total number of payments or periods = whatever years you taking the loan out for * 12 months in a cycle
    		BigDecimal P = purchase.subtract(downPayment);
    		BigDecimal r = intrest.divide(new BigDecimal(12)); 					//r = intrest yearly / 12 months 
    		BigDecimal n10 = (new BigDecimal(10)).multiply(new BigDecimal(12)); //n = 10 yrs * 12 months
    		BigDecimal n20 = (new BigDecimal(20)).multiply(new BigDecimal(12)); 
    		BigDecimal n30 = (new BigDecimal(30)).multiply(new BigDecimal(12));

    		//TURNING BigDecimal to Double to make it easier to code the formula:
    		double monthly10 = (P.doubleValue()*r.doubleValue()*Math.pow((r.doubleValue()+1), n10.doubleValue()))/(Math.pow(r.doubleValue()+1, n10.doubleValue())-1);   
    		double monthly20 = (P.doubleValue()*r.doubleValue()*Math.pow((r.doubleValue()+1), n20.doubleValue()))/(Math.pow(r.doubleValue()+1, n20.doubleValue())-1);   
    		double monthly30 = (P.doubleValue()*r.doubleValue()*Math.pow((r.doubleValue()+1), n30.doubleValue()))/(Math.pow(r.doubleValue()+1, n30.doubleValue())-1);   
    		
    		//slider
    		initialize();
    		BigDecimal nX = sliderDuration.multiply(new BigDecimal(12)); //X year loan /12 months = how many cycles
    		double monthlyX = (P.doubleValue()*r.doubleValue()*Math.pow((r.doubleValue()+1), nX.doubleValue()))/(Math.pow(r.doubleValue()+1, nX.doubleValue())-1);
    		
    		
    		System.out.println(monthly10);
    		System.out.println(monthly20);
    		System.out.println(monthly30);
    		System.out.println(monthlyX);
    		loan10TextBox.setText(Double.toString(monthly10));
    		loan20TextBox.setText(Double.toString(monthly20));
    		loan30TextBox.setText(Double.toString(monthly30));
    		loanCustomTextBox.setText(Double.toString(monthlyX));
    	}
    	catch(NumberFormatException ex){
    		purchaseTextBox.setText("Enter Purchase Amount");
    	    purchaseTextBox.selectAll();
    		purchaseTextBox.requestFocus();
    		
    		downTextBox.setText("Enter Downpayment Amount");
    	    downTextBox.selectAll();
    		downTextBox.requestFocus();
    		
    		intrestTextBox.setText("Enter Intrest in Decimal Form");
    		intrestTextBox.selectAll();
    		intrestTextBox.requestFocus();
    	}
    }
    
    // called by FXMLLoader to initialize the controller
    public void initialize() 
    {
    	//0-4 round down. 5-9 round up
    	currency.setRoundingMode(RoundingMode.HALF_UP);
    	//listen for changes to tipPercentageSlider's value
    	slider.valueProperty().addListener
    	(
    		new ChangeListener<Number>() 
    		{
    			@Override
    			public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
					sliderDuration = BigDecimal.valueOf(newValue.intValue());
					System.out.println(sliderDuration);
					sliderLabel.setText(sliderDuration.toString()+" Year Loan");
		    		   

    			}  			 	
    		}
		);
    }
}
    
    
    
    
    /* TEXTFIELDS (aTextField)
     * 		GET INFO:  BigDecimal amount = new BigDecimal(aTextField.getText()); 
     * 		SET: aTextField.setText("bla");	
     * 
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
