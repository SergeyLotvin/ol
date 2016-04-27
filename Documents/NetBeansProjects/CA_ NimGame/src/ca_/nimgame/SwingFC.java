package ca_.nimgame;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class SwingFC extends javax.swing.JFrame implements ActionListener {
NetCommunication nc;
    JTextField jtf1;
    JTextField jtf2;
    JLabel jlab1, jlab2, jlab3;
    JTextArea jta;
    JFrame jfrm;
    static String myMove="";

    SwingFC() throws IOException{
        nc=new NetCommunication();

        jfrm = new JFrame("Nim Game");
        JPanel p = new JPanel();
        jfrm.add(p);

        p.setLayout(new BorderLayout());

        jfrm.setSize(400, 400);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf1 = new JTextField(3);
        Font f = new Font("Arial", 1, 28);
        jtf2 = new JTextField(5);
        jtf1.setFont(f);
        jtf2.setFont(f);
        jta = new JTextArea();
        jta.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3, true));

        jtf1.setActionCommand("jtf1I");
        jtf2.setActionCommand("jtf2I");

        // Create the Compare button.
        JButton jbtnSend = new JButton("Send");
        Dimension d1 = new Dimension(100, 5);
        Dimension d2 = new Dimension(5, 300);
        jbtnSend.setPreferredSize(d1);
        jta.setPreferredSize(d2);
        // Add action listener for the Compare button.
        jbtnSend.addActionListener(this);

        // Create the labels.
        jlab1 = new JLabel(" Heap                  Quantity");
//    jlab2 = new JLabel("2");
//    jlab3 = new JLabel("3");

        // Add the components to the content pane.
//    p.add(jlab1, BorderLayout.PAGE_START);
//    p.add(jlab2);
//    p.add(jlab3);
        p.add(jlab1, BorderLayout.NORTH);
        p.add(jtf1, BorderLayout.WEST);
        p.add(jtf2, BorderLayout.CENTER);
        p.add(jbtnSend, BorderLayout.EAST);
        p.add(jta, BorderLayout.SOUTH);
    //jfrm.setVisible(true);

    }
    
    public void addStringTojta(String response){
    jta.append("\n"+response);
    jta.repaint();
    jfrm.repaint();
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        int heapN=Integer.parseInt(jtf1.getText());
        int moveQnt=Integer.parseInt(jtf2.getText());
        String sResponse;
        
        myMove="\nmove: "+heapN+" "+moveQnt;
        try{
        nc.writeDatasFC(CA_NimGame.inputDataToken, myMove);
        } catch (Exception e) {System.out.println("actionPerformed e - "+e);}
        try {
        sResponse = nc.readData();
        //System.out.println("sResponse - " + sResponse.substring(0, 3));
        if(sResponse.substring(0, 3).equals("mov")==true){
        addStringTojta(sResponse);
        nc.serverMadeMove(sResponse);
        addStringTojta(nc.getHeapCurrentState());}
        } catch (Exception e) {            System.out.println("readData - " + e);        }
    }

}
