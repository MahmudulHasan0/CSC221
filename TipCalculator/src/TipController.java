
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


public class TipController  implements Initializable  {
	// FORMATTERS FOR CURRENCY AND PERCENTAGES
	private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
	private static final NumberFormat percent = NumberFormat.getPercentInstance();
	private BigDecimal tipPercentage = new BigDecimal(0.15); //15% default
	
	// GUI controlls defines in FXML and used by the controller's code:
    @FXML
    private TextField amountTextField;
	
    @FXML
    private Label amountLabel;
	
    @FXML
    private TextField totalTextField; 
	
    @FXML
    private Label totalLabel;

    @FXML
    private TextField tipTextField;

    @FXML
    private Label tipLabel;

    @FXML
    private Slider tipPercentageSlider;

    @FXML
    private Label tipPercentageLabel;
    
    @FXML
    private Button calculateButton;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
    	try {
    		BigDecimal amount = new BigDecimal(amountTextField.getText()); //get the data from amountTextFiled
    		BigDecimal tip = amount.multiply(tipPercentage);     //a.multiply(b) <- how to multiply numbers
    		BigDecimal total = amount.add(tip);
    		
    		tipTextField.setText(currency.format(tip)); //i think its turning decimal tip to string?
    		totalTextField.setText(currency.format(total));
    	}
    	catch(NumberFormatException ex){
    		amountTextField.setText("Enter Amount");
    		amountTextField.selectAll();
    		amountTextField.requestFocus();
    	}
    }
    
    // called by FXMLLoader to initialize the controller
    public void initialize() 
    {
    	//0-4 round down. 5-9 round up
    	currency.setRoundingMode(RoundingMode.HALF_UP);
    	
    	//listen for changes to tipPercentageSlider's value
    	tipPercentageSlider.valueProperty().addListener
    	(
    		new ChangeListener<Number>() 
    		{
    			@Override
    			public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
					tipPercentage = BigDecimal.valueOf(newValue.intValue() / 100.0);
					tipPercentageLabel.setText(percent.format(tipPercentage));
    			}  			 	
    		}
		);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
    
    
    
    
    /* TEXTFIELDS (aTextField)
     * 		GET INFO:  BigDecimal amount = new BigDecimal(aTextField.getText()); 
     * 		SET: aTextField.setText("bla");	
     * 
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
