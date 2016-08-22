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
        String str_input="3 9 6 5 7 1 11 2 0 10 4 8 0"; 
        String[] strArr=str_input.split("\\s");
        int[] intArr=new int[strArr.length];
        for(int i=0; i<strArr.length; i++){intArr[i]=Integer.valueOf(strArr[i]); if(intArr[i]!=0){size++;}}
        

        Heap theHeap = new Heap(size);
         
        
        
        for (j = 0; j < size; j++) // fill array with
        { // random nodes
            int random = (int) (java.lang.Math.random() * 100);
            Node newNode = new Node(random);
            theHeap.insertAt(j, newNode);
            theHeap.incrementSize();
        }
        System.out.print("Random: ");
        theHeap.displayArray(); // display random array
        for (j = size / 2 - 1; j >= 0; j--) // make random array into heap
        {
            theHeap.trickleDown(j);
        }
        System.out.print("Heap: ");
        theHeap.displayArray(); // display heap array
        theHeap.displayHeap(); // display heap
        for (j = size - 1; j >= 0; j--) // remove from heap and
        { // store at array end
            Node biggestNode = theHeap.remove();
            theHeap.insertAt(j, biggestNode);
        }
        System.out.print("Sorted: ");
        theHeap.displayArray(); // display sorted array
    } // end main()

// -------------------------------------------------------------
}