public class BinarySearchTree {
    Node root;
    void insert(Node newNode){
        if (root==null)
            root = newNode;
        else{
            Node tmp = root;
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
    private int compareNode(Node a , Node b){
        return Integer.compare(a.getData(), b.getData());
    }
    void inorderTraversal(Node t){
        if (t!=null){
            inorderTraversal(t.left);
            System.out.println(t.getData());
            inorderTraversal(t.right);
        }
    }
    void inorderTraversal(){
        inorderTraversal(root);
    }
    void preorderTraversal(Node t){
        if (t!=null){
            System.out.println(t.getData());
            preorderTraversal(t.left);
            preorderTraversal(t.right);
        }
    }
    void preorderTraversal(){
        preorderTraversal(root);
    }
    void postorderTraversal(Node t){
        if (t!=null){
            postorderTraversal(t.left);
            postorderTraversal(t.right);
            System.out.println(t.getData());
        }
    }
    void postorderTraversal(){
        postorderTraversal(root);
    }
    public int getHeight(Node t) {
        if(t==null)
            return -1;
        return Math.max(getHeight(t.right) , getHeight(t.left))+1;
    }
    public int getHeight() {
        return getHeight(root);
    }
    Node inorderSearch(Node t, int key){
      if(t==null || t.getData() == key)
        return t;
      if (t.getData() < key){
          return inorderSearch(t.right , key);
      }
      else{
          return inorderSearch(t.left , key);
      }
    }
    Node inorderSearch(int key){
        return inorderSearch(root , key);
    }
    Node mirror(Node t){
        if (t == null)
            return t;

        Node left = mirror(t.left);
        Node right = mirror(t.right);
        t.left = right;
        t.right = left;
        return t;
    }
    Node mirror(){
        return mirror(root);
    }

}
