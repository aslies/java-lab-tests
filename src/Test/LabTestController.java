/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author asli
 */
public class LabTestController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Parent root;
    private Scene scene;
    private Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
       
     @FXML
    void firstBtnClicked(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("KanTesti.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
    @FXML
    void secBtnClicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("IdrarTesti.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void logOut(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("TestFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
 
        
    }
    
}
