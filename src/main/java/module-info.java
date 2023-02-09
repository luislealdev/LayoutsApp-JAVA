module luisrrleal.com.layoutsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens luisrrleal.com.layoutsapp to javafx.fxml;
    exports luisrrleal.com.layoutsapp;
}