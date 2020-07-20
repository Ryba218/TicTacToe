package Tutorial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class SwitchingScenes extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to the scene2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout1 - children are laid out in vertical column
        VBox latout1 = new VBox(20);
        latout1.getChildren().addAll(label,button1);
        scene1 = new Scene(latout1,200,200);

        //Button 2
        Button button2 = new Button("This scene sucks, go back to the scene1");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2,600,300);

        window.setScene(scene1);
        window.setTitle("Title");
        window.show();


    }
}
