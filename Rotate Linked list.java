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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        int count = 0;
        ListNode curr = head;
        while(curr.next!=null){
            count++;
            curr = curr.next;
        }
        count++;
        int rotatePoint = count - k%count;
        curr.next =  head;
        curr = head;
        while(rotatePoint-- > 1){
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}
