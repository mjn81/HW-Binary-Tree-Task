public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;
    void insert(Node<T> newNode){
        if (root==null)
            root = newNode;
        else{
            Node<T> tmp = root;
            int comp;
            while (true){
                comp = compareNode(newNode , tmp);
                if (comp == 0){
                    return;
                }
                if (comp <0){
                    if (tmp.left!=null){
                        tmp = tmp.left;
                    }
                    else {
                        tmp.left = newNode;
                        return;
                    }
                }
                else{
                    if (tmp.right!=null){
                        tmp = tmp.right;
                    }
                    else {
                        tmp.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    private int compareNode(Node<T> a , Node<T> b){
        return a.getData().compareTo(b.getData());
    }
    void inorderTraversal(Node<T> t){
        if (t!=null){
            inorderTraversal(t.left);
            System.out.println(t.getData());
            inorderTraversal(t.right);
        }
    }
    void inorderTraversal(){
        inorderTraversal(root);
    }
    void preorderTraversal(Node<T> t){
        if (t!=null){
            System.out.println(t.getData());
            preorderTraversal(t.left);
            preorderTraversal(t.right);
        }
    }
    void preorderTraversal(){
        preorderTraversal(root);
    }
    void postorderTraversal(Node<T> t){
        if (t!=null){
            postorderTraversal(t.left);
            postorderTraversal(t.right);
            System.out.println(t.getData());
        }
    }
    void postorderTraversal(){
        postorderTraversal(root);
    }
    public int getHeight(Node<T> t) {
        if(t==null)
            return -1;
        return Math.max(getHeight(t.right) , getHeight(t.left))+1;
    }
    public int getHeight() {
        return getHeight(root);
    }
    Node<T> inorderSearch(Node<T> t, T key){
      if(t==null || t.getData() == key)
        return t;
      if (t.getData().compareTo(key) < 0){
          return inorderSearch(t.right , key);
      }
      else{
          return inorderSearch(t.left , key);
      }
    }
    Node<T> inorderSearch(T key){
        return inorderSearch(root , key);
    }
    Node<T> mirror(Node<T> t){
        if (t == null)
            return t;

        Node<T> left = mirror(t.left);
        Node<T> right = mirror(t.right);
        t.left = right;
        t.right = left;
        return t;
    }
    Node<T> mirror(){
        return mirror(root);
    }

}
