import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Say i input a weekly check number. It will output a 8 position check. Ex: If i input 99.87, it will output: ***99.87. 
public class CheckProtection extends Application{
	@Override
	public void start(Stage stage){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Check.fxml")); //1) Loading the fxml file by using the FXMLLoader class's static load method to create the GUI's scene graph. 
			Scene scene = new Scene(root); //2) The window will display the app (attaching scene graph to the scene)
			stage.setTitle("Check Protector"); //2) The title of the window
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
