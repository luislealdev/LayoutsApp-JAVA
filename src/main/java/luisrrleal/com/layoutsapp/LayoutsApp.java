package luisrrleal.com.layoutsapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class LayoutsApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane root = new BorderPane();
        root.setTop(generateTopSection());
        /*
        root.setLeft();
        root.setCenter();
        root.setRight();
        root.setBottom();
         */

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    private HBox generateTopSection(){
        HBox hbox = new HBox(5);

        for(int i=1; i<=10;i++){
            hbox.getChildren().add(new Button("Button "+i));
        }
        return hbox;
    }

    public static void main(String[] args) {
        launch();
    }
}