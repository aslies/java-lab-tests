/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class PersonelGirisController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Parent root;
    private Stage stage;
    private Scene scene;
    public TextField nicknameTxt;
    public Label label2;
    public Label label3;
    public PasswordField passwordField;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }

    @FXML
    private void goBackBtn2Clicked(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("TestFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
    @FXML
    private void staffLogin(ActionEvent event) throws IOException {
       
       String str = nicknameTxt.getText();
       Pattern my_pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
       Matcher match = my_pattern.matcher(str);
       int b = nicknameTxt.getLength();
       int a = passwordField.getLength();
       if(match.find() || b<6) {
            label2.setVisible(true);
            label2.setText("Geçersiz kullanıcı adı");
       }
       else if(!match.find() && b>=6)
            label2.setVisible(false);
       
       if(a < 6) {
           label3.setVisible(true);
           label3.setText("Yanlış şifre");
       }
       else if (a >= 6)
           label3.setVisible(false);
       
       if (!match.find() && b >= 6 && a >=6) {
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PersonelLabTest.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       } 
    } 
        
}
