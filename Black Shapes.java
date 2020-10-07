public class Solution {
    
    void dfs(int i, int j, int r,int c,int arr[][])
    {
        if(i<0 || j<0 || i>=r || j>=c) return;
        if(arr[i][j] != 1) return;
        arr[i][j] = 0;
        dfs(i+1,j,r,c,arr);
        dfs(i,j+1,r,c,arr);
        dfs(i-1,j,r,c,arr);
        dfs(i,j-1,r,c,arr);
        
    }
    public int black(ArrayList<String> A) {
        int row = A.size();
        int col = A.get(0).length();
        int r = 0;
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(A.get(i).charAt(j) == 'X')
                {
                    arr[i][j] = 1;
                }
                else arr[i][j] = 0;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j] == 1)
                {
                    dfs(i,j,row,col,arr);
                    r++;
                }
            }
        }
        return r;
    }
}
