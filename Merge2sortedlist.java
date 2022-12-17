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
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(0);
        ListNode ptr = start;
        while(l1!=null&&l2!=null)
        {
            if(l1.val>l2.val)
            {
                ptr.next = new ListNode(l2.val);
                ptr = ptr.next;
                l2 = l2.next;
            }
            else
            {
                ptr.next = new ListNode(l1.val);
                ptr = ptr.next;
                l1 = l1.next;                
            }
        }
        if(l2==null)
            ptr.next = l1;
        else
            ptr.next = l2;
        return start.next;
    }
}
