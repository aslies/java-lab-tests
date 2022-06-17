/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author asli
 */
public class HastaGirisController implements Initializable {
    @FXML
    private TextField tcNoField;
    @FXML
    private PasswordField passwordField1;
    private Parent root;
    private Stage stage;
    private Scene scene;
    public Label label1;
    public Label label2;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tcNoField.textProperty().addListener(new ChangeListener<String>() {
        @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, 
        String newValue) {
        if (!newValue.matches("\\d*")) {
            tcNoField.setText(newValue.replaceAll("[^\\d]", ""));
        }
    }
});
        
       
    }    
    
    @FXML
    private void goBackBtnClicked(ActionEvent event) throws IOException {
        Test test = new Test();
        root = FXMLLoader.load(getClass().getResource("TestFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        
    }
    
    @FXML
    private void login(ActionEvent event) throws IOException {
        int a = tcNoField.getLength();
        int b = passwordField1.getLength();
        if(a != 11) {
            label1.setVisible(true);
            label1.setText("Geçerli bir TC numarası giriniz!");
        }
    
        else if (a == 11) {
            label1.setVisible(false);
        }
        if(b < 6) {
            label2.setVisible(true);
            label2.setText("Yanlış şifre");
        }
        else if (b >= 6) 
            label2.setVisible(false);
        
        if (a == 11 && b >= 6) {
        
        root = FXMLLoader.load(getClass().getResource("LabTest.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        }
    }

    

   
    

    
    
    
    
   
}
