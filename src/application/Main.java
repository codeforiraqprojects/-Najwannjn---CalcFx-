package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("fxml.fxml"));
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@FXML
	RadioButton rdSum,rdSub,rdMulti,rdDivide;
	@FXML
	Label lblResult;
	@FXML
	TextField txtFirst,txtSecond;
	public void calculate () {
		Integer x = Integer.parseInt(txtFirst.getText());
		Integer y = Integer.parseInt(txtFirst.getText());
		if (rdSum.isSelected())
			{lblResult.setText(Calc.sum(x, y).toString());}
		if (rdSub.isSelected())
		{lblResult.setText(Calc.sub(x, y).toString());}
		if (rdMulti.isSelected())
		{lblResult.setText(Calc.multiply(x, y).toString());}
		if (rdDivide.isSelected())
		{lblResult.setText(Calc.division(x, y).toString());}
		}
	}

