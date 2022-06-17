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
public class IdrarTestiController implements Initializable {

    @FXML
    public Button button;
    @FXML
    public Label dateLabel;
    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    public Label Udata0;
    @FXML
    public Label Udata1;
    @FXML
    public Label Udata2;
    @FXML
    public Label Udata3;
    @FXML
    public Label Udata4;
    @FXML
    public Label Udata5;
    @FXML
    public Label Udata6;
    @FXML
    public Label Udata7;
    @FXML
    public Label Udata8;
    @FXML
    public Label Udata9;
    @FXML
    public Label Udata10;
    @FXML
    public Label Udata11;
    @FXML
    public Label Udata12;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LabTest.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
