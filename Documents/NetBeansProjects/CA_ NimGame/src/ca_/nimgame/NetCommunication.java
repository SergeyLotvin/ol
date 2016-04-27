
package ca_.nimgame;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class NetCommunication {
    
    URL urlCon;
    HttpURLConnection yc; 
    DataOutputStream wr;
    static int[] currentHeapState=new int[3];
    int[] myMove=new int[2];
    
     public NetCommunication() throws IOException {
        urlCon = new URL("http://codeabbey.sourceforge.net/nim-game.php");

    }
     
     public void writeData(String token) throws IOException {
        setConnection();
        wr = new DataOutputStream(yc.getOutputStream());
        String t = "token: " + token;
        System.out.println("goes to server - " + t);
        wr.writeBytes(t);
        wr.flush();
        wr.close();

    }
     
     public void writeData(String token, int[] intArr) throws IOException {
        int[] intArrl=intArr;
        setConnection();
        if (intArrl[0]>0){intArrl[0]=(intArrl[0]-1);}
        wr = new DataOutputStream(yc.getOutputStream());
        String t = "token: " + token+"\nmove: 0 "+intArrl[0];
        System.out.println("goes to server - " + t);
        wr.writeBytes(t);
        wr.flush();
        wr.close();

    }
     
    public void writeDatasFC(String token, String sResponse) throws IOException {
        setConnection();
        String temp=sResponse.substring(6);
        Scanner sc=new Scanner(temp);
        int heapN=sc.nextInt(); int moveQnty=sc.nextInt();
        currentHeapState[heapN]=currentHeapState[heapN]-moveQnty;
        getHeapCurrentState();

        wr = new DataOutputStream(yc.getOutputStream());
        String t = "token: " + token + sResponse;
        System.out.println("goes to server - " + t);
        wr.writeBytes(t);
        wr.flush();
        wr.close();
    }
     
     public void writeData(String token, String sResponse) throws IOException {
        setConnection();
        String typeOfAnswer=sResponse.substring(0, 4);
        
        switch(typeOfAnswer){
            case "heap": takeHeapArray(sResponse.substring(7)); makeMove(0); break;
            case "move": makeMove(takeServerMove(sResponse.substring(6))); break;    
        }
           
        
        
        wr = new DataOutputStream(yc.getOutputStream());
        String t = "token: " + token+"\nmove: "+myMove[0]+" "+myMove[1];
        System.out.println("goes to server - " + t);
        wr.writeBytes(t);
        wr.flush();
        wr.close();

    }
     
     public String readData() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String response;       
        response=in.readLine();   
        in.close();
        System.out.println("server response - " + response);        
        return response;
    }
     
     public void setConnection()throws IOException{   
        
        yc = (HttpURLConnection) urlCon.openConnection();
        yc.setRequestMethod("POST");
        yc.setRequestProperty("Content-Type", "text/plain");
        yc.setRequestProperty("User-Agent", "");
        yc.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        yc.setDoOutput(true);

    }
     
     public void takeHeapArray(String response){
        Scanner sc=new Scanner(response.substring(6));      
        int i=0;
        
        while(sc.hasNext()){
        currentHeapState[i]=sc.nextInt();
        i++;
        }
        int s=currentHeapState[0]+currentHeapState[1]+currentHeapState[2];
         System.out.println("takeHeapArray state: "+currentHeapState[0]+" "+currentHeapState[1]+" "+currentHeapState[2]+"sum="+s); 
         sc.close();
         sc=null;
         
     }
     
     public String getHeapCurrentState(){
     int s=currentHeapState[0]+currentHeapState[1]+currentHeapState[2];
         System.out.println("getHeapCurrentState state: "+currentHeapState[0]+" "+currentHeapState[1]+" "+currentHeapState[2]+" sum="+s); 
         return "getHeapCurrentState state: "+currentHeapState[0]+" "+currentHeapState[1]+" "+currentHeapState[2]+" sum="+s;
     }
     
     public int takeServerMove (String response){
        Scanner sc=new Scanner(response);
        int heapN=sc.nextInt();
        int valueTaken=sc.nextInt();
        currentHeapState[heapN]=currentHeapState[heapN]-valueTaken;
        
        System.out.println("takeServerMove: "+currentHeapState[0]+" "+currentHeapState[1]+" "+currentHeapState[2]); 
        sc.close();
        sc=null;
        return heapN;
     
     }
     
     public void makeMove(int heapN){
     if (currentHeapState[heapN]>0){myMove[0]=0; myMove[1]=(currentHeapState[heapN]); currentHeapState[heapN]=currentHeapState[heapN]-myMove[1];}
     System.out.println("makeMove array state: "+currentHeapState[0]+" "+currentHeapState[1]+" "+currentHeapState[2]); 
     }
     
     public void serverMadeMove(String sResponse){
     String temp=sResponse.substring(6);
        Scanner sc=new Scanner(temp);
        int heapN=sc.nextInt(); int moveQnty=sc.nextInt();
        currentHeapState[heapN]=currentHeapState[heapN]-moveQnty;
     }
     
         
     }
    

