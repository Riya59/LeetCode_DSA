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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            int k = curr.val;
            curr.val = curr.next.val;
            curr.next.val = k;
            curr = curr.next.next;
        }
        return head;
    }
}
