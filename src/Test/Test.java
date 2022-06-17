/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author asli
 */
public class Test extends Application {
        final FXMLLoader loader = new FXMLLoader(getClass().getResource("KanTesti.fxml"));
        final FXMLLoader loader2 = new FXMLLoader(getClass().getResource("TestFXML.fxml"));
        final FXMLLoader loader3 = new FXMLLoader(getClass().getResource("PersonelKanTesti.fxml"));
        final FXMLLoader loader4 = new FXMLLoader(getClass().getResource("LabTest.fxml"));
        final FXMLLoader loader5 = new FXMLLoader(getClass().getResource("HastaGiris.fxml"));
        final FXMLLoader loader6 = new FXMLLoader(getClass().getResource("PersonelGiris.fxml"));
        final FXMLLoader loader7 = new FXMLLoader(getClass().getResource("PersonelLabTest.fxml"));
    @Override
    public void start(Stage primaryStage) throws IOException {
       
        Parent root = FXMLLoader.load(getClass().getResource("TestFXML.fxml"));
     

        Scene scene = new Scene(root, 323, 400);
        primaryStage.setTitle("Laboratuvar Testlerinin Takibi");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
