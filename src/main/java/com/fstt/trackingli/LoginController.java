package com.fstt.trackingli;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Login;
import model.LoginDAO;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;



public class LoginController implements Initializable {
    public TextField tname;
    public TextField tpass;
    public Button BtnCon;

    public void initialize(URL url, ResourceBundle resourceBundle){


    }
    private Stage stage;
    private Scene scene;
    @FXML
    void switchToTracking(ActionEvent event) throws IOException {
        Login lo=new Login();
        LoginDAO log=new LoginDAO();
        lo.setUsername(tname.getText());
        lo.setPassword(tpass.getText());

        boolean test =log.login(lo);
        if(test){
        Parent trackingParent = FXMLLoader.load(getClass().getResource("/Fxml/dashboard.fxml"));
        Scene trackingScene = new Scene(trackingParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(trackingScene);
        window.show();}
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid username or password");
            alert.showAndWait();
        }
    }



}
