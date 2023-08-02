//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class list{
    int d,x,y;
    list(int d,int x,int y){
        this.d=d;
        this.x=x;
        this.y=y;
    }
}
class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        if(A[0][0]==0) return -1;
        if(X==0 && Y==0) return 0;
        Queue<list> q=new LinkedList<>();
        int[][] dis=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        dis[0][0]=0;
        q.add(new list(0,0,0));
        int dir[]={-1,0,1,0};
        int dic[]={0,1,0,-1};
        while(!q.isEmpty()){
            list e=q.remove();
            int d=e.d;
            int x=e.x;
            int y=e.y;
            if(x==X && y==Y) return d;
                
            for(int i=0;i<4;i++){
                int r=x+dir[i];
                int c=y+dic[i];
                if(r>=0 && c>=0 && r<N && c<M && A[r][c]==1 && d+1<dis[r][c]){
                    dis[r][c]=d+1;
                    if(r==X &&c==Y) return d+1;
                    q.add(new list(d+1,r,c));
                }
            }
        }
        return -1;
    }
}