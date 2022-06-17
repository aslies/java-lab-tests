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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author asli
 */
public class KanTestiController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Parent root;
    private Scene scene;
    private Stage stage;
    
    /**
     *
     */
    
    @FXML
    public Label PBdata0;
    @FXML
    public Label PBdata1;
    @FXML
    public Label PBdata2;
    @FXML
    public Label PBdata3;
    @FXML
    public Label PBdata4;
    @FXML
    public Label PBdata5;
    @FXML
    public Label PBdata6;
    @FXML
    public Label PBdata7;
    @FXML
    public Label PBdata8;
    @FXML
    public Label timeLabel;
    @FXML
    public Button button;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    @FXML
    private void goBackBtnClicked(ActionEvent event) throws IOException {
        
        
        root = FXMLLoader.load(getClass().getResource("LabTest.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
