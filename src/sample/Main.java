package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Cows and bulls");
        primaryStage.setScene(new Scene(root, 300, 350));
        primaryStage.show();

        JFrame InputFrame = new JFrame();
        TextField Input = new TextField();
        Input.setText("0000");
        Input.setColumns(4);
        Input.enableInputMethods(true);
        InputFrame.setBounds(10, 10, 200, 200);
        InputFrame.add(Input);
        InputFrame.setVisible(true);

        Button Submit = new Button();
        Frame f = new Frame();
        f.add(Submit);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
