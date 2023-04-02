package com.fstt.trackingli;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class  App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Fxml/Login.fxml")));
Scene scene = new Scene(parent);
stage.setTitle("TrackingLi");
stage.setScene(scene);
stage.show();


    }
    public static  void main(String[] args){
        launch();
    }
}
