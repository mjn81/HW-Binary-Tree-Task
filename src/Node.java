public class Node <T>{
    private T data;
    public Node<T> right,left;
    public Node(T data){
        this.data = data;
        left=null;
        right=null;
    }
    public T getData(){
        return data;
    }
}
