//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);

            Solution ob = new Solution();
            System.out.println(ob.sumOfNaturals(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Solution {
//     static int sumOfNaturals(int n) {
//         // double s=(n*(n+1))/2;
        
//         // return (int)(s%1000000007);
//         return (int)(((n*(n+1))/2)%(1000000007));
//     }
// }

class Solution {
    static int sumOfNaturals(int n) {
       int ans=0;
        for(int i=n;i>0;i--)
        {
            ans=ans+i;
            if(ans>1000000007)
            {
                ans=ans%1000000007;
            }
        }
        return ans;
    }
}