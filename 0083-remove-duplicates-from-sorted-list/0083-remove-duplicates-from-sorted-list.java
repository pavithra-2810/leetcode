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
class Solution {
    public ListNode deleteDuplicates(ListNode head)
    {
       ListNode temp=head;
       LinkedHashSet<Integer> set=new LinkedHashSet<>();
       while(temp!=null)
       {
            set.add(temp.val);
            temp=temp.next;
       }
       ListNode l=new ListNode();
       ListNode cur=l;
       for(int c:set)
       {
        cur.next=new ListNode(c);
        cur=cur.next;
       }
       return l.next;
    }
}