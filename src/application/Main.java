package application;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application 
{
	Level level0 = new Level(0, Color.GREEN);
	{level0.addName("Bob");}
	
	@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("JavaFX Welcome");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Text sceneTitle = new Text("Welcome");
		sceneTitle.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
		grid.add(sceneTitle, 0, 0, 2, 1);
		
		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);
		
		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		
		//Label password = new Label("Password:");
		//grid.add(password, 0, 2);
		
		//PasswordField pwBox = new PasswordField();
		//grid.add(pwBox, 1, 2);
		
		Text randomText = new Text(displayLevel(level0.getNames()));
		randomText.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 20));
		grid.add(randomText, 0, 3);
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	/*void initializeLevel(Level level) {
		
	}*/
	String displayLevel(ArrayList<String> list) 
	//method will make a bunch of student names appear in a column
	{
		StringBuilder textToDisplay = new StringBuilder("");
		for(String s: list)
		{
			textToDisplay.append(s+"\n");
		}
		return textToDisplay.toString();
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}