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
    ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = slow.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode node1 = head;
        ListNode node2 = slow.next;
        slow.next = null;

        node2 = reverse(node2);
        head = new ListNode(0);

        ListNode curr = head;
        while(node1!=null || node2!=null){
            if(node1!=null){
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }

            if(node2!=null){
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }
        head = head.next; 
    }
}
