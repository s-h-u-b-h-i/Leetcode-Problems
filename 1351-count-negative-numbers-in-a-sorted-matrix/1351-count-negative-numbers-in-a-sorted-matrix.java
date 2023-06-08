class Solution {
    public int countNegatives(int[][] grid) {
       int n=grid.length-1;
        int m=grid[0].length;
        int c=0;
        int j=0;
        while(n>=0&&j<m){
            if(grid[n][j]<0){
                c+= (m-j);
                n--;
            }
            else j++;
        }
        return c;
    }
}