/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankreportapp.main;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JTextField;
import tankreportapp.db.*;

/**
 * 29.04.2016
 *
 * @Sergey Lotvin
 */
public class MainController implements Initializable {
    private Main main;
@FXML Button btnNav1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("MainController initialize method done its work");
    }
    
    public void btnNav1OnClick(ActionEvent ae) throws IOException{
        System.out.println("btnNav1OnClick - ed");
        main.showMainItems();
        
    }

}
