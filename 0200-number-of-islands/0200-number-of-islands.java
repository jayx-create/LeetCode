class Solution {
    public int numIslands(char[][] grid) {
        if( grid == null || grid.length == 0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int counts = 0;
        
        for( int i = 0; i < m; i++){
            for( int j = 0; j < n; j++){
                if( grid[i][j] == '1'){
                    counts++;
                    visitDfs( grid, i, j);
                }
            }
            
        }
        return counts;
        }
    private void visitDfs( char[][] grid, int x, int y){
            if( x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == '0')
                return;
            
            grid[x][y]= '0';
            
            visitDfs( grid, x + 1, y);
            visitDfs( grid, x - 1, y);
            visitDfs( grid, x, y + 1);
            visitDfs(grid, x, y - 1);
    }
}
