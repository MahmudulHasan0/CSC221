// Mahmudul Hasan
/* HW 1:
 * Create a class called HeartRates. 
 * The class attributes should include the person's first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth).
 * Your class should have a constructor that receives this data as parameters. 
 * For each attribute provide set and get methods. The class also should include:
	 * a method that calculates and returns the person's age (in years), 
	 * a method that calculates and returns the person's maximum heart rate and 
	 * a method that calculates and returns the person's target heart rate.
 * Write a Java application that prompts for the person's information, instantiates an object of class HeartRates and prints the information from that object�including the person's first name, last name and date of birth�
 * then calculates and prints the person's age in (years), maximum heart rate and target-heart-rate range.*/


import java.util.Scanner; 	//to get user input...didnt use here sinc ei used JOptioPane
import java.lang.Math; 		//to round numbers: int num = input.nextInt();
import javax.swing.JOptionPane; //for getting user integer input from a GUI input dialog
//String to Integer: Integer.toString(num)
//Integer to String: Integer.valueOf(stringNumber)

public class HeartRates 
{
	private String firstname;
	private String lastname;
	private int DOB_year;
	private int DOB_month;
	private int DOB_day;
	private String DOB; 
	//CONSTRUCTOR:
	HeartRates(String firstnamex, String lastnamex, int DOB_monthx, int DOB_dayx, int DOB_yearx )
	{
		this.firstname = firstnamex;
		this.lastname = lastnamex;
		this.DOB_month = DOB_monthx;	
		this.DOB_day = DOB_dayx;
		this.DOB_year = DOB_yearx;
		this.DOB =  Integer.toString(this.DOB_month) +"-"+ Integer.toString(this.DOB_day) +"-"+ Integer.toString(this.DOB_year);
	}
	//GETTERS:
	public String getFirstname() {
		return this.firstname;
	}
	public String getLastname() {
		return this.lastname;
	}
	public String getDOB() {
		return this.DOB;
	}
	//SETTERS:
	public void setFirstname(String x) {
		this.firstname = x;
	}
	public void setLastname(String x) {
		this.lastname = x;
	}
	public void setDOB(String x) {
		this.DOB = x;
	}
	//OTHERS:
	public int age() {
		return 2019-(this.DOB_year);
	}
	public int max_heart_rate() {
		return Math.round(220-age());  //rounding the heart beat to nearest whole #
	}
	public String target_heart_rate() {
		double range_low = Math.round(max_heart_rate() * 0.5);
		double range_high = Math.round(max_heart_rate() * 0.85);
		return (Double.toString(range_low) +" BPM to "+ Double.toString(range_high) + " bpm");
	}
	//PROGRAM:
	public static void main(String[] args) 
	{
        String firstname = JOptionPane.showInputDialog(null, "Enter Your First Name");
        String lastname = JOptionPane.showInputDialog(null, "Enter Your Last Name");
        int DOB_month = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter your birth month in form MM\n"));
		int DOB_day = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter your birth day in form DD\n"));
		int DOB_year = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter your birth year in form YYYY\n"));
		
		HeartRates person = new HeartRates(firstname, lastname , DOB_month, DOB_day, DOB_year);
		System.out.println("Name: "+ person.getFirstname() +" "+ person.getLastname());
		System.out.println("Date of Birth: "+ person.getDOB());
		System.out.println("Approximate Age: " + Integer.toString(person.age()) + " years old");
		System.out.println("Max Heart Rate: " + Integer.toString(person.max_heart_rate()) + " BPM");    
		System.out.println("Target Heart Rate: " + person.target_heart_rate()); 
	}
}
