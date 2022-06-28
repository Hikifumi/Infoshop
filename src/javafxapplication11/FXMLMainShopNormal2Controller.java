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
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author TUF-GK
 */
public class FXMLMainShopNormal2Controller implements Initializable {
    BelanjaanList data;
    
    @FXML
    private Button Cart1;
    
    @FXML
    private Button Cart2;
    
    @FXML
    private Button Cart3;
    
    @FXML
    private Button Cart4;
    
    @FXML
    private Label lstatus;
    
    @FXML
    private void cart1ButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMainShopOrderList.fxml"));
        Parent scene2 = loader.load();
        
        String name = "Produk 1";
        int amount = 1;
        String type = "Type2";
        int price = 100000;
        
        FXMLMainShopOrderListController orderlistcontroller = loader.getController();
        orderlistcontroller.getData(name, amount, type, price);
        
        data.setData(name,amount,type,price);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
