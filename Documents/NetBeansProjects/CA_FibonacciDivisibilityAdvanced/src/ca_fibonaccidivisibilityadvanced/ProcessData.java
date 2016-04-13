package ca_fibonaccidivisibilityadvanced;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessData {

    ArrayList<Integer> input;
    String pName;

    ProcessData(String name, ArrayList<Integer> input) {
        pName=name;
        this.input = input;
    }

    public ArrayList processValues() {
        //System.out.println("ProcessData.processValues method has been started by  "+pName + " with input " +input);
        ArrayList<Integer> intArr=new ArrayList<Integer>();
        for (int k=0; k<input.size(); k++) {
            int i = 1; int j=0;

            BigInteger value = BigInteger.valueOf(input.get(k).intValue());

            BigInteger fibP = BigInteger.ZERO;
            BigInteger fibC = BigInteger.ZERO;
            BigInteger fibN = BigInteger.ONE;
            while (fibN.remainder(value) != BigInteger.ZERO) {
                fibC = fibN;
                fibN = fibP.add(fibN);
                fibP = fibC;

                i++;
            }
intArr.add(i); j++;
            
            
        }
        return intArr;
    }

}
