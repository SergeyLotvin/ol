package tankreportapp.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 29.04.2016 
 * @Sergey Lotvin
 */
public class Main extends Application {
    private  Stage primaryStage;
    private static BorderPane mainLayout;
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        this.primaryStage=primaryStage;
        this.primaryStage.setTitle("Tank Report System");
        showMainView();
        showMainItems();


    }
 
    private void showMainView() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/tankreportapp/fxml/Main.fxml"));
        mainLayout=loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void showMainItems() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/tankreportapp/fxml/MainItems.fxml"));
        BorderPane mainItems=loader.load();
        mainLayout.setCenter(mainItems);
    }
    
    public static void showSubScreen1Scene() throws IOException {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("/SubScreen1/SubScreen1.fxml"));
        BorderPane subScreen1=loader.load();
        mainLayout.setCenter(subScreen1);
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
