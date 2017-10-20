/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    String pin ="";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    @FXML
    private Label label;
        @FXML
    private TextField editPin;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    

    @FXML
    private Button b0;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan1(ActionEvent event) {
        pin += "1";
        editPin.setText(pin);
    }

    @FXML
    private void tekan2(ActionEvent event) {
        pin += "2";
        editPin.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
        pin += "3";
        editPin.setText(pin);
    }

    @FXML
    private void tekan4(ActionEvent event) {
        pin += "4";
        editPin.setText(pin);
    }

     @FXML
    void tekan5(ActionEvent event) {
        pin += "5";
        editPin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
        pin += "6";
        editPin.setText(pin);
    }

    @FXML
    private void tekan7(ActionEvent event) {
        pin += "7";
        editPin.setText(pin);
    }

    @FXML
    private void tekan8(ActionEvent event) {
        pin += "8";
        editPin.setText(pin);
    }

    @FXML
    private void tekan9(ActionEvent event) {
        pin += "9";
        editPin.setText(pin);
    }

    @FXML
    private void tekanc(ActionEvent event) {
        pin += "";
        editPin.setText(pin);
    }

    @FXML
    private void tekan0(ActionEvent event) {
        pin += "0";
        editPin.setText(pin);
    }

    @FXML
    private void tekanok(ActionEvent event) {
        if(pin.equals(PIN)){
            try {
                ((Node) (event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader= new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),840,450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            }
            catch(IOException e){
                System.out.println("Failed to create new window." +e);
            }}
            else{
                    kesempatan -=1;
                    JOptionPane.showMessageDialog(null, "PIN Salah \n tersisa : "+kesempatan+"kesempatan lagi");
                       editPin.setText("");
                    pin = "";
                    if (kesempatan == 0){
                    System.exit(0);
                    }
                    }
        
    }
    
}
