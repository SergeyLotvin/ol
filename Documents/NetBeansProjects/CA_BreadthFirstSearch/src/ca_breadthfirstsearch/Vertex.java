package ca_breadthfirstsearch;

public class  Vertex<T> {

    public String labelS; // label (e.g. "A")
    public Integer labelInt; // label (e.g. 0, 1, 2 ...)
    public boolean wasVisited;
// -------------------------------------------------------------

    public Vertex(T lab) // constructor
    {
        
        labelInt = (Integer) lab;
        wasVisited = false;
    }
// -------------------------------------------------------------
} // end class Vertex
