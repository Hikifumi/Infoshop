package javafxapplication11;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
        
public class Belanjaan {
    private SimpleStringProperty nama;
    private SimpleIntegerProperty jumlah;
    private SimpleStringProperty type;
    private SimpleIntegerProperty harga;
   
    
    public Belanjaan(){
        this("",0,"",0);
    }
    public Belanjaan(String nama, int jumlah, String type, int harga){
        this.nama = new SimpleStringProperty(nama);
        this.jumlah = new SimpleIntegerProperty(jumlah);
        this.type = new SimpleStringProperty(type);
        this.harga = new SimpleIntegerProperty(harga);
       
    }
        public String getNama(){
            return nama.get();
        }
        public void setNama(String nama){
            this.nama.set(nama);
        }
        public int getJumlah(){
            return jumlah.get();
        }
        public void setJumlah(int jumlah){
            this.jumlah.set(jumlah);
        }
        public String getType(){
            return type.get();
        }
        public void setType(String type){
            this.type.set(type);
        }
        public int getHarga(){
            return harga.get();
        }
        public void setHarga(int harga){
            this.harga.set(harga);
        }
}
