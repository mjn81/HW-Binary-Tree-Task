public class Node {
    private int data;
    public Node right,left;
    public Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    public int getData(){
        return data;
    }
    @Override
    public Node clone(){
        Node n = new Node(this.data);
        if (this.right!=null)
            n.right = this.right.clone();
        if (this.left!=null)
            n.left = this.left.clone();
        return n;
    }
}
