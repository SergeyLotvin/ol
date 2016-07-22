
package ca_treebuilder;
import ca_treebuilder.BSTree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CA_TreeBuilder {


    public static void main(String[] args) {

        String str_input="3 5 4 2 8";
        String str_arr[]=str_input.split("\\s");    
                int value=0;
                
                List<Integer> values = new ArrayList<Integer>();
                
                for(String i: str_arr){values.add(Integer.valueOf(i));}
                
        BSTree myTree=new BSTree();
        
       for (int i=0; i<str_arr.length; i++) {
            value=values.get(i);
            myTree.add(value, value);   
            
        }
        int key=0; String l="-", r="-";
        
        String[] resStrArr= new String[20];
        
        for (int i=0; i<str_arr.length; i++) {
        key=values.get(i);
        if (myTree.getNode(key).getLeft()!=null) {l=myTree.getNode(key).getLeft().value.toString();} 
        if (myTree.getNode(key).getRight()!=null) {r=myTree.getNode(key).getRight().value.toString();} 
        String s="("+l+", "+ myTree.getNode(key).value+", "+r+")";
        resStrArr[key]=s;
        System.out.print(s);
                l="-"; r="-";
        }
        System.out.println("");
        
//for(int j=0; j<20; j++) System.out.println(resStrArr[j]);
    }
    
}
