
package ca_breadthfirstsearch;

import java.util.Scanner;

public class CA_BreadthFirstSearch {

    public static void main(String[] args) {
       
       
       String str_input="7 10\n" +
"0 1\n" +
"2 0\n" +
"0 3\n" +
"1 4\n" +
"4 3\n" +
"2 3\n" +
"5 2\n" +
"6 3\n" +
"4 6\n" +
"6 5";
       Scanner scan=new Scanner(str_input);
       
       int vertsQty=scan.nextInt(); scan.nextInt();
       Graph theGraph = new Graph(vertsQty);
       
        for (int i = 0; i < vertsQty ; i++) {
            theGraph.addVertex(i); // 0 (start for dfs)

        }
        

        
        int m = 0, e = 0;
        while (scan.hasNext()) {
            m = scan.nextInt();
            e = scan.nextInt();            
            theGraph.addEdge(m, e);

        }
        
        int[][] am=new int [vertsQty][vertsQty];
        am=theGraph.getAdjMat();
        for (int h = 0; h < vertsQty; h++) {
             System.out.println(am[h][0]+" "+am[h][1]+" "+am[h][2]+" "+am[h][3]+" "+am[h][4]+" "+am[h][5]+" "+am[h][6]);
        }

System.out.print("Visits: ");
theGraph.bfs(); // breadth-first search
System.out.println();
    }
    
}
