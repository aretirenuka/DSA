
class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node slow=head;
        Node fast=head;
        Node tmp=null;
        if(head.next==null)
        {
            return null;
        }
        while(fast!=null&&fast.next!=null)
        {
            tmp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(tmp!=null)
        {
            tmp.next=slow.next;
        }
        return head;
        
    }
}
