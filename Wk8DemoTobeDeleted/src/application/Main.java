package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		/*
		 * Implementing GridPane template.. for creating a form with ui components..
		 */
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(12, 13, 14, 15));
		// spacing..
		pane.setHgap(6.5); // horizontal gap..
		pane.setVgap(6.5);

		pane.add(new Label("FirstName"), 0, 0);
		// 1st param is the UI component you need to add.
		// 2nd param is the column no.
		// 3rd param is the row no.
		pane.add(new TextField(), 1, 0);

		// you can add other ui components..

		Button btn = new Button("Submit");
		pane.add(btn, 3, 3);
		GridPane.setHalignment(btn, HPos.RIGHT);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowGridPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	public static void main(String[] args) {
		launch(args);
	}
}
