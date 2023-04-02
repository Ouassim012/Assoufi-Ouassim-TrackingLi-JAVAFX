package com.fstt.trackingli;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void switchToTracking1(ActionEvent event) {
        Parent trackingParent = null;
        try {
            trackingParent = FXMLLoader.load(getClass().getResource("/Fxml/TrackingLi1.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene trackingScene = new Scene(trackingParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(trackingScene);
        window.show();
    }
    @FXML
    void switchToTracking2(ActionEvent event) {
        Parent trackingParent = null;
        try {
            trackingParent = FXMLLoader.load(getClass().getResource("/Fxml/Commande.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene trackingScene = new Scene(trackingParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(trackingScene);
        window.show();
    }
    @FXML
    void switchToTracking3(ActionEvent event) {
        Parent trackingParent = null;
        try {
            trackingParent = FXMLLoader.load(getClass().getResource("/Fxml/Produit.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene trackingScene = new Scene(trackingParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(trackingScene);
        window.show();
    }
}
