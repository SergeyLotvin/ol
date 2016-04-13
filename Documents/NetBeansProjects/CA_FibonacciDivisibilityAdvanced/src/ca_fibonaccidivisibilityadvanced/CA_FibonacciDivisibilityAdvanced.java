package ca_fibonaccidivisibilityadvanced;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CA_FibonacciDivisibilityAdvanced {

    public static void main(String[] args) {

        double sqrt5 = Math.sqrt(5);
        double a = (1 + sqrt5) / 2;
        double b = (1 - sqrt5) / 2;
        int n = 1900000;
        long Bine = 0;

        Bine = (long) ((Math.pow(a, n) - Math.pow(b, n)) / sqrt5);
        //System.out.println(Bine);
        
//"458138 916003 466450 408165 607967 832757 624627 483108 399869 1007599 574657 874404 990952 641261 358206 949316 649579 274991 374884 566375 549681";
        String in = "458138 12 61 17 12 17 12 61 17 12 17";
        String[] in_arr=in.split("\\s");
        int nextI = 0; int i=1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        List<ThreadClass> tclist=new ArrayList<>();
        for (int k=0; k<in_arr.length; k++) {
            nextI = Integer.parseInt(in_arr[k]);
            al.add(nextI);
            
            if (k!=0 & (al.size()==5 || k==in_arr.length-1)){
               //tclist.add( new ThreadClass("tc"+i, al));
                System.out.println("al from main "+al.toString());
               ThreadClass tc= new ThreadClass("tc"+i, al);
                System.out.println("tc.input from main "+tc.input);
 
                i++;
                al.clear();
            }
            

        }
        
        //for (ThreadClass t: tclist) {System.out.println(t.output);}
        //System.out.println(tc.output);
        
//        al1.addAll(Arrays.asList(458138, 12, 61));
//        ThreadClass tc1= new ThreadClass("tc1", al1);
//        
//        
//        al2.addAll(Arrays.asList(17, 12, 61));
//        ThreadClass tc2= new ThreadClass("tc2", al2);
//        
//        
//        al3.addAll(Arrays.asList(17, 12, 611));
//        ThreadClass tc3= new ThreadClass("tc3", al3);
        
    }

}
