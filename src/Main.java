public class Main {
    public static void main(String[] args) {
        Node<Integer> x1 = new Node<>(7);
        Node<Integer> x2 = new Node<>(4);
        Node<Integer> x3 = new Node<>(17);
        Node<Integer> x4 = new Node<>(5);
        Node<Integer> x5 = new Node<>(6);
        Node<Integer> x6 = new Node<>(4);
        BinarySearchTree<Integer> t= new BinarySearchTree<>();
        t.insert(x1);
        t.insert(x2);
        t.insert(x3);
        t.insert(x4);
        t.insert(x5);
        t.insert(x6);
        t.inorderTraversal();
    }
}
