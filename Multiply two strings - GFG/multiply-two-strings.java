//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static String multiply(String s1,String s2){
    if("0".equals(s1)||"0".equals(s2)){
            return "0";
        }
        int[] ans=new int[s1.length()+s2.length()];
        for(int i=s1.length()-1;i>=0;i--){
            for(int j=s2.length()-1;j>=0;j--){
                ans[i+j+1]+=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
                ans[i+j]+=ans[i+j+1]/10;
                ans[i+j+1]%=10;
            }
        }
        int i=0;
        while(i<ans.length&&ans[i]==0){
            i++;
        }
        String s="";
        while(i<ans.length) s+=ans[i++];
        return s;
    }
    public String multiplyStrings(String s1,String s2)
    {
        String res="";
        boolean s=false;
        if(s1.startsWith("-")&&s2.startsWith("-")){
            s1=s1.replaceFirst("-","");
            s2=s2.replaceFirst("-","");
        }else if(s2.startsWith("-")){
            s=true;
            s2=s2.replaceFirst("-","");
        }else if(s1.startsWith("-")){
            s=true;
            s1=s1.replaceFirst("-","");
        }
        if(s1.length()>=s2.length()){
            res=multiply(s1,s2);
        }else{
            res=multiply(s2,s1);
        }
        return s?"-" + res:res;
        
    }
}