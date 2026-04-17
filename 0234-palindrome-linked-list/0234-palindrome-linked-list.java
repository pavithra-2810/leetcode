/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode cur=head;
        ListNode next=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head)
    {
        // if(head==null || head.next==null)
        // {
        //     return true;
        // }
        ListNode m=middle(head);
        ListNode s=reverse(m);

        ListNode f=head;

        while(s!=null)
        {
            if(f.val!=s.val)
            {
                return false;
            }
            f=f.next;
            s=s.next;
        }
        return true;
    }
}