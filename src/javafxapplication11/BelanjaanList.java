/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication11;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author TUF-GK
 */
public class BelanjaanList {
    private ObservableList<Belanjaan> dataList;
    
    public BelanjaanList(){
        dataList = FXCollections.observableArrayList();
    }
    public ObservableList<Belanjaan> getData(){
        return this.dataList;
    }
    public void setData(String nama, int jumlah, String type, int harga){
        dataList.add(new Belanjaan(nama, jumlah, type, harga));
    }
}

