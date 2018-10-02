package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MyCounterApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.BASELINE_CENTER);
        root.setVgap(5);
        root.setHgap(10);
        Scene mainScene = new Scene(root, 250, 40);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(mainScene);
        Label numberLabel = new Label("5 + 3 = ");
        TextField numberTextField = new TextField();
        Button setNumberButton = new Button("Check");
        root.getChildren().add(numberLabel);
        root.getChildren().add(numberTextField);
        root.getChildren().add(setNumberButton);
        TextField resultTextField = new TextField();
        setNumberButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (numberTextField.getText().equals("8")) {
                    resultTextField.setText("Correct, het was 8");
                } else {
                    resultTextField.setText("Fout, het was 8");
                }
                root.getChildren().add(resultTextField);
            }
        });

        primaryStage.show();
    }

}
