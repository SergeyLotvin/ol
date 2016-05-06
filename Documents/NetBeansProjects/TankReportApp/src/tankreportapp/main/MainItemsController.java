
package tankreportapp.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author J
 */
public class MainItemsController implements Initializable {
    private Main main;

@FXML private Button btn1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void btn1Clicked(ActionEvent ae) throws IOException{
       
    System.out.println("btn1Clicked - ed");
    main.showSubScreen1Scene();
    
    }
}
