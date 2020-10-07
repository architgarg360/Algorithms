
import java.util.*;

public class Trie {

    class Node {

        Node[] next = new Node[128];
        Object value;

    }
    Node root = null;

    public void insert(String key, Object value) {
        root = insert(key, value, root, 0);
    }

    private Node insert(String key, Object value, Node x, int d) {
        if (x == null) {
            x = new Node();
        }
        if (key.length() == d) {
            x.value = value;
            return x;
        }
        char c = key.charAt(d);
        x.next[c] = insert(key, value, x.next[c], d + 1);
        return x;
    }

    public void get(String key) {
        System.out.println(get(key, root, 0));
    }

    private Object get(String key, Node x, int d) {
        if(x != null)
        {
        if (d == key.length()) return x.value;
        
        
        char c = key.charAt(d);

        return get(key, x.next[c], d + 1);
    }
       return -1;
    }


    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("hello", "bhaag ja");
        t.insert("dog", "bhow bhow");
        t.insert("number", 9478726);
        t.insert(" ", 76);
        t.get("dog");
        t.get("do");
        t.get("number");
        t.get(" ");

        
    }

}
