package luisrrleal.com.layoutsapp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class LayoutsApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane root = new BorderPane();
        root.setTop(generateTopSection());
        root.setLeft(generateLeftSection());
        root.setCenter(generateCenterSection());
        root.setRight(generateRightSection());
        root.setBottom(generateBottomSection());

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    //GENERATE SECTIONS
    private HBox generateTopSection(){
        HBox hbox = new HBox(5);
        hbox.setAlignment(Pos.CENTER);

        for(int i=1; i<=10;i++){
            hbox.getChildren().add(new Button("Button "+i));
        }
        return hbox;
    }

    private VBox generateLeftSection(){
        VBox vbox = new VBox(5);
        vbox.setAlignment(Pos.CENTER);
        String names[] = {"Juan","Pepe","Ernesto","Norma","Eden","Teresa","Luis","Guillermo","Martha"};
        for(int i=1; i<=10;i++){
            vbox.getChildren().add(new ComboBox<>(FXCollections.observableArrayList(names)));
        }

        return vbox;
    }

    private StackPane generateCenterSection(){
        StackPane stackPane = new StackPane();
        stackPane.setAlignment(Pos.CENTER);

        Circle circle = new Circle();
        circle.setRadius(200);
        circle.setFill(Color.BLACK);

        stackPane.getChildren().add(circle);
        return stackPane;
    }

    private VBox generateRightSection(){
        VBox vbox = new VBox(5);
        vbox.setAlignment(Pos.CENTER);

        //Create group for radio buttons
        ToggleGroup group = new ToggleGroup();

        for(int i=1; i<=10;i++){
            RadioButton rb = new RadioButton("Option "+i );
            rb.setToggleGroup(group);
            vbox.getChildren().add(rb);
        }

        return vbox;
    }

    private HBox generateBottomSection(){
        HBox hBox = new HBox(5);
        for (int i = 1; i<=10;i++){
            hBox.getChildren().add(new DatePicker());
        }

        return hBox;
    }



    public static void main(String[] args) {
        launch();
    }
}