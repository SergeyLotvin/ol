//Data Structures& Algorithms in Java Second Edition, Robert Lafore
//International Standard Book Number: 0-672-32453-9
//CHAPTER 12 Heaps
package ca_binaryheap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CA_BinaryHeap {

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
// -------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
//-------------------------------------------------------------

    public static void main(String[] args) throws IOException {

        int size=0, j;
        String str_input="12 7 17 18 31 10 21"; 
        String[] strArr=str_input.split("\\s");
        int[] intArr=new int[strArr.length];
        for(int i=0; i<strArr.length; i++){intArr[i]=Integer.valueOf(strArr[i]);}
        size=7;
        Heap theHeap = new Heap(size);
        
        for (int q = 0; q < size; q++) {
            if (intArr[q] != 0) {
                
                Node newNode = new Node(intArr[q]);
                theHeap.insertAt(q, newNode);
                theHeap.incrementSize();

            }
            
        }
        theHeap.displayArray();
        theHeap.displayHeap();
        
            for (j = size / 2 - 1; j >= 0; j--) // make random array into heap
        {
                
            theHeap.trickleDown(j);
        }
        
        
        theHeap.displayHeap();
        theHeap.remove();
        theHeap.displayHeap();
        
        
        System.out.println("---------------------------------------------");
        
        Scanner scan=new Scanner("35 2 33 22 0 19 0 24 27 15 20 0 32 26 6 30 3 13 0 16 0 5 0 14 9 34 1 11 0 28 23 8 36 29 0 4 25 0");
        int t=0;
        while(scan.hasNext()){
        t=scan.nextInt();
        if (t!=0){
                theHeap.insertAt(theHeap.currentSize, new Node(t));
                theHeap.incrementSize();
                theHeap.trickleUp(theHeap.currentSize-1);
                
        } else {theHeap.remove();}

        }
                        

                

        theHeap.displayHeap();
                


        
      
}
}