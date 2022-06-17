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
public class PersonelIdrarTestiController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    public TextField PUdata0;
    @FXML
    public TextField PUdata1;
    @FXML
    public TextField PUdata2;
    @FXML
    public TextField PUdata3;
    @FXML
    public TextField PUdata4;
    @FXML
    public TextField PUdata5;
    @FXML
    public TextField PUdata6;
    @FXML
    public TextField PUdata7;
    @FXML
    public TextField PUdata8;
    @FXML
    public TextField PUdata9;
    @FXML
    public TextField PUdata10;
    @FXML
    public TextField PUdata11;
    @FXML
    public TextField PUdata12;
    @FXML
    public TextField tcField;
    @FXML
    public TextField nameField;
    @FXML
    public TextField birthdateField;
    @FXML
    public TextField phoneField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBack(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PersonelLabTest.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void saveData(ActionEvent event) throws IOException, ParseException {
       IdrarTesti test = new IdrarTesti(nameField.getText(), tcField.getText(), birthdateField.getText());
       Hasta hasta = new Hasta(nameField.getText(), tcField.getText(), birthdateField.getText(), phoneField.getText());
       
       FXMLLoader loader = new FXMLLoader(getClass().getResource("IdrarTesti.fxml"));
       root = loader.load();
       IdrarTestiController c = loader.getController();
       c.Udata0.setText(PUdata0.getText());
       c.Udata1.setText(PUdata1.getText());
       c.Udata2.setText(PUdata2.getText());
       c.Udata3.setText(PUdata3.getText());
       c.Udata4.setText(PUdata4.getText());
       c.Udata5.setText(PUdata5.getText());
       c.Udata6.setText(PUdata6.getText());
       c.Udata7.setText(PUdata7.getText());
       c.Udata8.setText(PUdata8.getText());
       c.Udata9.setText(PUdata9.getText());
       c.Udata10.setText(PUdata10.getText());
       c.Udata11.setText(PUdata11.getText());
       c.Udata12.setText(PUdata12.getText());
       stage = new Stage();
       stage.setScene(new Scene(root));
       c.button.setVisible(false);
       c.dateLabel.setText(test.getTime() + " tarihinde oluşturuldu");
       stage.setTitle(nameField.getText() + " adlı hastanın test sonuçları");
       
       
       stage.show();
    }
    
}
