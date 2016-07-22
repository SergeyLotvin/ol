
package ca_treebuilder;


public class Node <T1, T2>{
                    T1 key;
                T2 value;
                Node<T1, T2> left, right;
               
                Node(T1 key, T2 value) {
                        this.key = key;
                        this.value = value;
                }

    public T1 getKey() {
        return key;
    }

    public void setKey(T1 key) {
        this.key = key;
    }

    public T2 getValue() {
        return value;
    }

    public void setValue(T2 value) {
        this.value = value;
    }

    public Node<T1, T2> getLeft() {
        return left;
    }

    public void setLeft(Node<T1, T2> left) {
        this.left = left;
    }

    public Node<T1, T2> getRight() {
        return right;
    }

    public void setRight(Node<T1, T2> right) {
        this.right = right;
    }
                
                
    
}
