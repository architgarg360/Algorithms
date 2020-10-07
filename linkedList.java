
public class LinkedList {
    public Node head;
    public LinkedList()
    {
        head = null;
    }
    public class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
            
        }
    }
    
    public void insertAtLast(int data)
    {
        Node nn = new Node(data);
        if(head == null)
        {
            head = nn;
        }
        else
        {
            Node t = head;
            while(t.next != null)
            {
                t = t.next;
            }
            t.next = nn;
        }
    }
    
    public void insertAtBeginning(int data)
    {
        Node nn = new Node(data);
        nn.next = head;
        head = nn;
    }
    
    public void remove(int d)
    {
        Node temp = head;
        Node prev = null;
        while(temp != null)
        {
            if(temp.data == d)
            {
                break;
            }
            prev = temp;
            temp = temp.next;
            
            
        }
        if(prev == null && head.data == d)
        {
            Node t = head;
            head = head.next;
            t = null;
            
            
        }
        if(prev != null)
        {
            prev.next = temp.next;
            
        }
    }
    public void removeAtLast()
    {
        Node t = head;
        while(t.next.next != null)
        {
            t = t.next;
        }
        t.next = null;
    }
    
    public int size()
    {
        int count = 0;
        Node temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public boolean isEmpty()
    {
        int p = size();
        if(p == 0) return true;
        else return false;
    }
    
    public int get(int d)
    {
        int count = 0;
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == d)
            {
                return count;
            }
            count++;
            temp = temp.next;
            
        }
        return -1;
    }
    
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public int elementAtLast()
    {
        Node t = head;
        while(t.next != null)
        {
            t = t.next;
        }
        return t.data;
    }
    
    public int elementAtBeginning()
    {
        return head.data;
    }

    public static void main(String[] args) {
        
        
        
        
        // TODO code application logic here
        
    }
    
}
