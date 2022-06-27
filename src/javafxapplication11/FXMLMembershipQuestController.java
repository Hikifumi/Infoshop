/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication11;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author TUF-GK
 */
public class FXMLMembershipQuestController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private Button noButton;
    
    @FXML
    private void YesButtonAction(ActionEvent event) throws IOException {
        Parent scene2 = FXMLLoader.load(getClass().getResource("FXMLMemberLogin.fxml"));
        Scene scene = new Scene(scene2);
        
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Membership Login");
        stage.show();
        System.out.println("Yes Button is clicked");
    }
    
    @FXML
    private void NoButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMainShop.fxml"));
        Parent scene2 = loader.load();
//        Parent scene2 = FXMLLoader.load(getClass().getResource("FXMLMainShop.fxml"));
//        Scene scene = new Scene(scene2);

        FXMLMainShopController mainshopcontroller = loader.getController();
        mainshopcontroller.getData(getData2());
        
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(scene2));
        stage.setTitle("Main Shop");
        stage.show();
        System.out.println("No Button is clicked");
    }

    private String getData2() {
        return "Guest";
    }
    
}
