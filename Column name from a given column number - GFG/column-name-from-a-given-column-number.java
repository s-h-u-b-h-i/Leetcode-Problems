//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java

class Solution
{
    String colName (long n)
    {
        String s="";
        while(n>0){
            long r=n%26;
            if(r==0){
                s+='Z';
                n=n/26 -1;
            }
            else{
                s+=(char)('A'+r-1);
                n/=26;
            }
        }
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}