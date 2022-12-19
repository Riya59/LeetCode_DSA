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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode prev = null;
        int i;
        for(i=1;i<left;i++){
            prev = curr;
            curr = curr.next;
        }
        ListNode rtail = curr;
        ListNode rhead = null;
        ListNode next = null;
        while(i<=right){
            next = curr.next;
            curr.next = rhead;
            rhead = curr;
            curr= next;
            i++;
        }
        if(prev!=null){
            prev.next = rhead;
        }
        else{
            head = rhead;
        }
        rtail.next = curr;
        return head;
    }
}
