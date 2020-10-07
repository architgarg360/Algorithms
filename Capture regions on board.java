public class Solution {
    void dfs(boolean[][] visited, int r, int c, int row, int col, ArrayList<ArrayList<Character>> a)
    {
        if(r < 0 || c < 0 || r >= row || c >= col) return;
        if(a.get(r).get(c) == 'O' && visited[r][c] == false)
        {
            a.get(r).set(c, 'Q');
            visited[r][c] = true;
        }
        else
        {
            visited[r][c] = true;
            return;
        }
        dfs(visited, r+1, c, row, col, a);
        dfs(visited, r-1, c, row, col, a);
        dfs(visited, r, c+1, row, col, a);
        dfs(visited, r, c-1, row, col, a);
    }
    public void solve(ArrayList<ArrayList<Character>> a) {
        int row = a.size();
        int col = a.get(0).size();
        boolean visited[][] = new boolean[row][col];
        for(int i=0;i<col;i++)
        {
            if(a.get(0).get(i) == 'O' && visited[0][i] == false) dfs(visited, 0, i, row, col, a);
        }
        for(int i=0;i<row;i++)
        {
            if(a.get(i).get(col-1) == 'O' && visited[i][col-1] == false) dfs(visited, i, col-1, row, col, a);
        }
        for(int i=0;i<col;i++)
        {
            if(a.get(row-1).get(i) == 'O' && visited[row-1][i] == false) dfs(visited, row-1, i, row, col, a);
        }
        for(int i=0;i<row;i++)
        {
            if(a.get(i).get(0) == 'O' && visited[i][0] == false) dfs(visited, i, 0, row, col, a);
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a.get(i).get(j) == 'O') a.get(i).set(j, 'X');
                if(a.get(i).get(j) == 'Q') a.get(i).set(j, 'O');
                
            }
        }
        
    }
}
