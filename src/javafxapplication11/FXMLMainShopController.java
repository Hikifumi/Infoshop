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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author TUF-GK
 */
public class FXMLMainShopController implements Initializable {
    FXMLMainShopOpenScene openScene = new FXMLMainShopOpenScene();
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    private Label lMember;
        
    @FXML
    private ChoiceBox cbPrice;
    
    @FXML
    private ChoiceBox cbType;
    
    @FXML
    private Button setButton;
    
    public void getData(String d){
        lMember.setText(d);
        System.out.println("getData method is invoked");
    }
    
    private String getData2() {
        return "Guest";
    }
    
    @FXML
    private void orderListButton(ActionEvent event) {
        Pane page = openScene.getPane("FXMLMainShopOrderList");
        mainPane.setCenter(page);
    }
    
    @FXML
    private void setButton(ActionEvent event) {
        if(cbPrice.equals("Normal") && cbType.equals("Type2")){
            Pane page = openScene.getPane("FXMLMainShopNormal2");
            mainPane.setCenter(page);
        }else{
            Pane page = openScene.getPane("FXMLMainShopNormal2");
            mainPane.setCenter(page);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbPrice.setValue("Normal");
        cbType.setValue("Type2");
        cbPrice.getItems().addAll("Cheap", "Normal", "Expensive");
        cbType.getItems().addAll("Type1", "Type2", "Type3");
    }    
    
    @FXML
    private void ExitButtonAction(ActionEvent event) throws IOException {
        Parent scene2 = FXMLLoader.load(getClass().getResource("FXMLExitPage.fxml"));
        Scene scene = new Scene(scene2);
        
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Exit?");
        stage.show();
        System.out.println("Exit Button is clicked");
    }
    
}
