package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Cows and bulls");
        primaryStage.setScene(new Scene(root, 300, 350));
        primaryStage.show();

        GridPane InputArea = new GridPane();
        InputArea.setPadding(new Insets(10, 10, 10, 10));
        InputArea.setVgap(5);
        InputArea.setHgap(5);

        TextField Input = new TextField();
        Input.setText("0000");
        Input.setColumns(4);
        Input.enableInputMethods(true);
        Input.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
