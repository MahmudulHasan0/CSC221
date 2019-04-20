
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Loan extends Application{
	//EXPLAINED IN LECTUER 12 SLIDES 81-82
	//start method creates a GUI, attaches it to a Scene and places it on the Stage. The start method gets that Stage as its argument.
	@Override
	public void start(Stage stage){
		try {
			Parent root = FXMLLoader.load(getClass()
					.getResource("Loan.fxml")); //1) Loading the fxml file by using the FXMLLoader class's static load method to create the GUI's scene graph. 
			Scene scene = new Scene(root); //2) The window will display the app (attaching scene graph to the scene)
			stage.setTitle("Tip Calculator"); //2) The title of the window
			stage.setScene(scene); //3) Attaching the scene to the stage (attaching the scene to the window)
			//stage.setScene(new Scene(root));
			stage.show(); //4) display the stage
		}
		catch(Exception e) {
	         e.printStackTrace();
	    }
	}
	public static void main(String[] args) {
		launch(args); //5) create a TipCalculator object and call its start method
	}
}
