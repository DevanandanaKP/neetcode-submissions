class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int column=grid[0].length;
        int island=0;
        
        if(grid.length==0)
        return 0;


        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(grid[i][j]=='1')
                {
                    island++;
                    Island(i,j,grid);
                }
            }
        }
        return island;
        
    }
    void Island(int i, int j, char[][] grid)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length ||grid[i][j]=='0')
        return;
        
        grid[i][j]='0';
        Island(i,j+1,grid);
        Island(i,j-1,grid);
        Island(i+1,j,grid);
        Island(i-1,j,grid);

    }
}
