/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author TUF-GK
 */
public class FXMLMainShopOrderListController implements Initializable {
    BelanjaanList data;
    
    @FXML
    private TableColumn<Belanjaan, String> tcName;
    
    @FXML
    private TableColumn<Belanjaan, Integer> tcAmount;
    
    @FXML
    private TableColumn<Belanjaan, String> tcType;
    
    @FXML
    private TableColumn<Belanjaan, Integer> tcPrice;
    
    @FXML
    private TableView<Belanjaan> tvOrderList;
    
    public void getData(String a, int b, String c, int d){
//        tvOrderList.belanjaan(a,b,c,d);
        System.out.println("getData method is invoked");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        tcType.setCellValueFactory(new PropertyValueFactory<>("type"));
        tcPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        
        tvOrderList.setItems(data.getData());
    }    
    
}
