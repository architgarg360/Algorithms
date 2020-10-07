
public class BST {
    Node root = null;
    class Node
    {
        int key;
        int value;
        Node left, right;
        Node(int k, int v)
        {
            key = k;
            value = v;
            left = null;
            right = null;
        }
        
    }
    
     Node put(Node x, int key, int value)
    {
        if(x == null)
        {
             Node nn = new Node(key, value);
             return nn;
        }
        if(key < x.key) x.left = put(x.left, key, value);
        else x.right = put(x.right, key, value);
        return x;
    }
    
    public void put(int key, int value)
    {
        root = put(root, key, value);
       
    }
    
     int get(Node x, int key)
    {
        if(x != null)
        {
            if(key == x.key) return x.value;
            if(key < x.key) return get(x.left, key);
            else return get(x.right, key);
        }
        return -1;
    }
    
    public int get(int key)
    {
        int value = get(root, key);
        return value;
    }
    
    void inorder(Node x)
    {
        if(x == null) return;
        inorder(x.left);
        System.out.println(x.value);
        inorder(x.right);
    }
    
    void postorder(Node x)
    {
        if(x == null) return;
        postorder(x.left);
        postorder(x.right);
        System.out.println(x.value);
        
    }
    
    void preorder(Node x)
    {
        if(x == null) return;
        System.out.println(x.value);
        preorder(x.left);
        preorder(x.right);
    }
    
    
    public void inorder()
    {
        inorder(root);
    }
    
    public void postorder()
    {
        postorder(root);
    }
    
    public void preorder()
    {
        preorder(root);
    }
    
    public boolean isEmpty()
    {
        if (root == null) return true;
        return false;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
