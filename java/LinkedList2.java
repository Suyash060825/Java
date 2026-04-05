package Softskills;

class LinkedList2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev= head;
        int count=0;
        ListNode cur=head;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        for(int i=0;i<count-n-1;i++)
        {
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev= head;
        ListNode after=head;
        int count=0;
        ListNode cur=head;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        for(int i=1;i<count-n;i++)
        {
            prev=prev.next;
            after=prev.next;
            prev.next=after.next;
            after.next=null;
        }
        return head;
    }
}