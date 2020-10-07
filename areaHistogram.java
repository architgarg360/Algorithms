
public class hist {
    int area_histogram(int a[], int n)
    {
            
    Stack<Integer> s = new Stack<>();
    int i = 0;
    int max_area = 0;
    int area = 0;
    while(i<n)
    {
    if(s.empty() || a[s.peek()] <= a[i])
    {

        s.push(i);
        i++;
    }
    else
    {
        int t = s.peek();
        s.pop();
        area = a[t] * (s.empty() ? i: i - s.peek() - 1);
        if(max_area<area) max_area = area;
    }
}

    while(!s.empty())
    {
       int t = s.peek();
        s.pop();
        area = a[t] * (s.empty() ? i: i - s.peek() - 1);
        if(max_area<area) max_area = area;
    }
    return max_area;
}
    

    public static void main(String[] args) {
        int a[] = {8,2,3,5,6,1,2};
        hist h = new hist();
        System.out.println(h.area_histogram(a, 7));

        
        
        // TODO code application logic here
    }
    
}
