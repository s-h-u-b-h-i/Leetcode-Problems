//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
// class Solution {

// 	public int[] shortestPath(int N,int M, int[][] edges) {
// 		boolean v=new boolean[V];
// 		Stack<Integer> st=new Stack<>();
// 		int d[]=new int[V];
// 		Arrays.fill(d,Integer.MAX_VALUE);
// 		d[0]=0;
// 		for(int i=0;i<V;i++){
// 		    if(!v[i]) topsort(i,v,st,edges);
// 		}
// 		int sort[] = new int[V];
// 		while(!st.isEmpty()){
// 		    int u=st.pop();
// 		    if(d[u]!=Integer.MAX_VALUE){
		        
// 		    }
// 		}
		
// 	}
// 	static void topsort(int i,boolean[] v,Stack<Integer> st,int[][] edges){
// 	    v[i]=true;
// 	    for(int[] j:edges){
// 	        if(!v[j[1]]) topsort(j[1],v,st,edges);
// 	    }
// 	    st.push(i);
// 	}
// }

class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
        int dist[] = new int[N];
        Arrays.fill(dist,Integer.MAX_VALUE);
        //set the 0th element value to 0
        dist[0]=0;
        boolean flag;
        
        //run the loop to M-1 times
        //M-1 because we are updating the dist[dest],
        //meaning when we will be in the M-2 iteration, value for dest node i.e. M-1 node will be updated.
        //There is no harm if we continue the till M but this will include unnecessary iteration.
        for(int i=0;i<M-1;i++)
        {
            flag=true;              //set to true at begginning of each iteration
            for(int [] val:edges)
            {
                int src=val[0];
                int dest=val[1];
                int w = val[2];
                
                //check if distance of source and edge weight is less than destination distance.
                //ignore if source is unreachable or above condition is not satisfied
                if(dist[src]!=Integer.MAX_VALUE && dist[src]+w<dist[dest])
                {
                    flag=false;     //set flag to flase if any update during the iteration
                    dist[dest]=dist[src]+w;     //update destination distance with the lowest value
                }
            }
            if(flag)                //if true, mean that was no update during the previous iteration
                break;              // hence exit from the loop
        }
        
        
        //loop to change the value to -1 for unreachable nodes 
        for(int i=0;i<N;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)dist[i]=-1;
        }
        
        //return  integer array dist
        return dist;
	}
}