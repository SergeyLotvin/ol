package ca_binaryheap;

import java.util.ArrayList;

public class Heap {

    public ArrayList<Node> heapArray;
    public int maxSize; // size of array
    public int currentSize; // number of nodes in array
    
// -------------------------------------------------------------

    public Heap(int mx) // constructor
    {
        maxSize = mx;
        currentSize = 0;
        heapArray = new ArrayList(); // create array
    }
// -------------------------------------------------------------

    public boolean isEmpty() {
        return currentSize == 0;
    }
// -------------------------------------------------------------

    public boolean insert(int key) {
        if (currentSize == maxSize) {
            return false;
        }
        Node newNode = new Node(key);
        heapArray.add(newNode);
        
        trickleUp(currentSize++);
        return true;
    } // end insert()
// -------------------------------------------------------------

    public void trickleUp(int index) {
        int parent = (index - 1) / 2;
        Node bottom = heapArray.get(index);
        //System.out.println("index "+index+" parent "+parent+" heapArray[index] "+heapArray[index].getKey()+" heapArray[parent] "+heapArray[parent].getKey()+" bottom "+bottom.getKey());
        while (index > 0
                && heapArray.get(parent).getKey() > bottom.getKey()) {
            
            heapArray.set(index, heapArray.get(parent));            // move it down
            index = parent;
            parent = (parent - 1) / 2;
        } // end while
        heapArray.set(index, bottom); 
        //System.out.println("index "+index+" steps "+steps);
    } // end trickleUp()
// -------------------------------------------------------------

    public Node remove() // delete item with max key
    { // (assumes non-empty list)
        Node root = heapArray.get(0);
        heapArray.set(0, heapArray.get(--currentSize));
        trickleDown(0);
        return root;
    } // end remove()
// -------------------------------------------------------------

    public void trickleDown(int index) {
        int smallerChild;
        Node top = heapArray.get(index); // save root
        //System.out.println("index "+index+" heapArray[index].getKey() "+heapArray[index].getKey()+" currentSize "+currentSize);
        while (index < currentSize / 2) // while node has at
        { // least one child,
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
// find smaller child
            if (rightChild < currentSize
                    && // (rightChild exists?)
                    heapArray.get(leftChild).getKey()
                    > heapArray.get(rightChild).getKey()) {
               //System.out.println("heapArray[leftChild].getKey() "+heapArray[leftChild].getKey()+" heapArray[rightChild].getKey() "+heapArray[rightChild].getKey());
                smallerChild = rightChild;
            } else {
                smallerChild = leftChild;
            } 
// top >= smallerChild?
            if (top.getKey() <= heapArray.get(smallerChild).getKey()) {
                break;
            }
// shift child up 

            heapArray.set(index, heapArray.get(smallerChild)); 
            index = smallerChild; // go down
        } // end while
         heapArray.set(index, top);  // root to index    
    } // end trickleDown()
//// -------------------------------------------------------------
//
//    public boolean change(int index, int newValue) {
//        if (index < 0 || index >= currentSize) {
//            return false;
//        }
//        int oldValue = heapArray[index].getKey(); // remember old
//        heapArray[index].setKey(newValue); // change to new
//        if (oldValue < newValue) // if raised,
//        {
//            trickleUp(index); // trickle it up
//        } else // if lowered,
//        {
//            trickleDown(index); // trickle it down
//        }
//        return true;
//    } // end change()
//// -------------------------------------------------------------

    public void displayHeap() {
        System.out.print("heapArray: "); // array format
        for (int m = 0; m < currentSize; m++) {
            if (heapArray.get(m) != null) {
                System.out.print(heapArray.get(m).getKey() + " ");
            } else {
                System.out.print("-- ");
            }
        }
        System.out.println();
// heap format
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0; // current item
        String dots = "...............................";
        System.out.println(dots + dots); // dotted top line
        while (currentSize > 0) // for each heap item
        {
            if (column == 0) // first item in row?
            {
                for (int k = 0; k < nBlanks; k++) // preceding blanks
                {
                    System.out.print(" ");
                }
            }
// display item
            System.out.print(heapArray.get(j).getKey());
            if (++j == currentSize) // done?
            {
                break;
            }
            if (++column == itemsPerRow) // end of row?
            {
                nBlanks /= 2; // half the blanks
                itemsPerRow *= 2; // twice the items
                column = 0; // start over on
                System.out.println(); // new row
            } else // next item on row
            {
                for (int k = 0; k < nBlanks * 2 - 2; k++) {
                    System.out.print(" "); // interim blanks
                }
            }
        } // end for
        System.out.println("\n" + dots + dots); // dotted bottom line
    } // end displayHeap()
// -------------------------------------------------------------   
    public void displayArray()
{
for(int j=0; j<maxSize; j++)
System.out.print(heapArray.get(j).getKey() + " ");
System.out.println("");
}
// -------------------------------------------------------------
public void insertAt(int index, Node newNode)
{heapArray.add(index, newNode);  }
// -------------------------------------------------------------
public void incrementSize()
{ currentSize++; }
// -------------------------------------------------------------
} // end class Heap

