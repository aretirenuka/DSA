
/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	// Your code here
	if(k==1)
	{
	    return null;
	}
	Node curr=head;
	Node prev=null;
	int c=0;
	while(curr!=null)
	{
	    c++;
	    if(c%k==0)
	    {
	        prev.next=curr.next;
	    }
	    else
	    {
	        prev=curr;
	    }
	    curr=curr.next;
	}
	return head;
    }
}
