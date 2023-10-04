//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        if(str.length()==0) return 0;
        int n=0;
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int pre=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int curr=mp.get(c);
            if(pre==0) pre=curr;
            if(pre<curr){
                n=n+(curr-pre)-pre;
                pre=curr;
            }
            else{
                n+=curr;
                pre=curr;
            }
        }
        return n;
    }
}