// Tree.java
public interface Tree<E> {
    /** Insert element e into the binary search tree. */
    public boolean insert(E e);

    /** Inorder traversal from the root. */
    public void inorder();

    /** Get the number of nodes in the tree. */
    public int getSize();
}