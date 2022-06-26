package javafxapplication11;

import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class FXMLMainShopOpenScene {
    private Pane page;
    
    public Pane getPane(String fileName){
        try {
            URL pageFile = FXMLMainShop.class.getResource("/javafxapplication11/" + fileName + ".fxml");
            
            if (pageFile == null){
                throw new java.io.FileNotFoundException("Cannot find the page");
            }
            
            page = FXMLLoader.load(pageFile);
        } catch (Exception e) {
            System.out.println("Cannot find the requested page");
        }
        
        return page;
    }

    private static class FXMLMainShop {

        public FXMLMainShop() {
        }
    }
}
