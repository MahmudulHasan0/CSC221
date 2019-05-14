//Mahmudul Hasan
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class PrimeFactors extends Application
{
	@Override
	public void start(Stage stage) throws Exception 
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("PrimeFactors.fxml"));
			Scene scene = new Scene(root);
			stage.setTitle("Prime Factors");
			stage.setScene(scene);
			stage.show();			
		}
		catch(Exception e) 
		{
	         e.printStackTrace();
	    }
	}
	public static void main(String[] args) {
		launch(args); 
	}
}
