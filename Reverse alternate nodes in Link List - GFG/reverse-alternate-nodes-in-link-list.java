//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        Node head= odd;
        Node even=odd.next;
        Node e=even;
        while((head.next!=null && head.next.next!=null) && (even.next!=null && even.next.next!=null)){
            if(head.next!=null && head.next.next!=null) {
                head.next=head.next.next;
                head=head.next;
            }
            if(even.next!=null && even.next.next!=null){
                even.next=even.next.next;
                even=even.next;
            }
        }
        Node prev=null;
        Node curr=e;
        even=null;
        while(curr!=null){
            even=curr.next;
            curr.next=prev;
            prev=curr;
            curr=even;
        }
        head.next=prev;
        
    }
}
