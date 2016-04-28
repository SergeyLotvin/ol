package ca_.nimgame;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CA_NimGame {
<<<<<<< HEAD
static String inputDataToken = "HcYa0YjXdEVpS4Gp6NWewjE0";
=======
static String inputDataToken = "Wo0DziSXaJzlH7p5nW0g+TU4";
>>>>>>> origin/master
    public static void main(String[] args) throws IOException, InterruptedException {

        
        String sResponse = "";
        NetCommunication nc = new NetCommunication();

        SwingFC sFC = new SwingFC();

        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                sFC.jfrm.setVisible(true);
            }
        });

        try {
            nc.writeData(inputDataToken);
        } catch (Exception e) {            System.out.println("writeData - " + e);        }
        
        try {
            sResponse = nc.readData();
            sFC.addStringTojta(sResponse);
        } catch (Exception e) {            System.out.println("readData - " + e);        }
        nc.takeHeapArray(sResponse);

    }

}
//        try
//        {
//            nc.writeData(inputDataToken);
//        } catch(Exception e){System.out.println("writeData - "+e);}
//        
//        try
//        {
//           sResponse= nc.readData();
//        } catch(Exception e){System.out.println("readData - "+e);}
//        
//        do{
//         try
//        {
//            nc.writeData(inputDataToken, sResponse);
//        } catch(Exception e){System.out.println("writeData - "+e);}
//         
//        try
//        {
//           sResponse= nc.readData(); System.out.println(sResponse.substring(0, 4));
//        } catch(Exception e){System.out.println("readData - "+e);}
//        } while(sResponse.substring(0, 4).equals("move"));
