/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author asli
 */
public class PersonelKanTestiController implements Initializable {



    @FXML
    public TextField PeBdata0;

    @FXML
    public TextField PeBdata1;

    @FXML
    public TextField PeBdata2;

    @FXML
    public TextField PeBdata3;

    @FXML
    public TextField PeBdata4;

    @FXML
    public TextField PeBdata5;

    @FXML
    public TextField PeBdata6;

    @FXML
    public TextField PeBdata7;
    
    @FXML
    public TextField PeBdata8;
    
    @FXML
    public TextField tcNO;
    @FXML
    public TextField nameField;
    @FXML
    public TextField dateField;
    @FXML
    public TextField phoneField;


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
    private void saveData(ActionEvent event) throws IOException, ParseException {
        
            KanTesti kanTesti = new KanTesti(nameField.getText(), tcNO.getText(), dateField.getText());
            Hasta hasta = new Hasta(nameField.getText(), tcNO.getText(), dateField.getText(), phoneField.getText());
            try 
            {
            Test test2 = new Test();
            FXMLLoader loader = test2.loader;
            Parent root = (Parent)loader.load();
            KanTestiController c = loader.getController();
            c.PBdata0.setText(PeBdata0.getText());
            c.PBdata1.setText(PeBdata1.getText());
            c.PBdata2.setText(PeBdata2.getText());
            c.PBdata3.setText(PeBdata3.getText());
            c.PBdata4.setText(PeBdata4.getText());
            c.PBdata5.setText(PeBdata5.getText());
            c.PBdata6.setText(PeBdata6.getText());
            c.PBdata7.setText(PeBdata7.getText());
            c.PBdata8.setText(PeBdata8.getText());
            
            c.timeLabel.setText(kanTesti.getTime() + " tarihinde oluşturuldu");
            c.button.setVisible(false);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(kanTesti.getName() + " adlı hastanın test sonuçları");
            stage.show();
            } catch (IOException ex) {
            Logger.getLogger(KanTesti.class.getName()).log(Level.SEVERE, null, ex);
            }
      
    }
    @FXML
    void goBackBtnClicked(ActionEvent event) throws IOException {
            
            Test test = new Test();
            Parent root = (Parent)test.loader7.load();
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
    }
}
