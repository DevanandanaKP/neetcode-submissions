class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        if(grid.length==0)
        return 0;
        int row=grid.length;
        int column=grid[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    island(i,j,grid);
                }
                
            }
        }
        return count;
        
    }
    void island(int i, int j,char[][] grid)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0')
        return;
        
            grid[i][j]='0';
            island(i+1,j,grid);
            island(i-1,j,grid);
            island(i,j+1,grid);
            island(i,j-1,grid);
        
    }
}
