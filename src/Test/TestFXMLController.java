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
public class TestFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML

      private Parent root;
      private Scene scene;
      private Stage stage;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btn1Clicked(ActionEvent event) throws IOException {
        
        
   
       root = FXMLLoader.load(getClass().getResource("HastaGiris.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
       
    }

    @FXML
    private void btn2Clicked(ActionEvent event) throws IOException {
       
       
       root = FXMLLoader.load(getClass().getResource("PersonelGiris.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
       
        
    }
    
}
