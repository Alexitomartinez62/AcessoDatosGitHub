package basicoDinamico;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
public class ListControllerAyuda {


    @FXML
    private TreeView<String> tree1;
    


    @FXML
    private void initialize() {   
       
        TreeItem<String> rootItem = new TreeItem<>("ACERCA DE NUESTRA EMPRESA", new ImageView(new Image("imagenesView/inte.png")));
        TreeItem<String> branchItem1 = new TreeItem<>("PRECIOS");
        TreeItem<String> branchItem2 = new TreeItem<>("AUTOB�S, COCHE Y TREN");
        TreeItem<String> branchItem3 = new TreeItem<>("AVI�N");
        TreeItem<String> branchItem4 = new TreeItem<>("NUEVOS VIAJEROS");
        
        
        TreeItem<String> leafItem1 = new TreeItem<>("En esta pesta�a puede encotrar la variedad de precios que ofrecemos "
        		+ "\n en cada uno de nuestros viajes.");
        TreeItem<String> leafItem2 = new TreeItem<>("En estas 3 pesta�as podemos sacar el billete para viajar en uno de los transportes"
        		+ "\n seleccionados y tanto su destino como el n�mero de billetes, y por supuesto el d�a.");
        TreeItem<String> leafItem3 = new TreeItem<>("Aqu� puedes sacar tu billete de avi�n eligiendo el d�a, hacia donde quieres volar"
        		+ "\n y si viajas acompa�ado puedes conseguir hasta 6 billetes.");
        TreeItem<String> leafItem4 = new TreeItem<>("Esta pesta�a sirve para editar, a�adir o eliminar a los pasajeros de cualquiera de los viajes,"
        		+ "\n sea cual sea su m�todo de transporte.");

        branchItem1.getChildren().addAll(leafItem1);
        branchItem2.getChildren().addAll(leafItem2);
        branchItem3.getChildren().addAll(leafItem3);
        branchItem4.getChildren().addAll(leafItem4);
        
        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3, branchItem4);
        


        tree1.setRoot(rootItem);    

    }
    
    public void selectItem() {
    	TreeItem<String> item = tree1.getSelectionModel().getSelectedItem();
    	
    	if(item!= null) {
    	System.out.println(item.getValue());
   
    	}
    
    }
   }