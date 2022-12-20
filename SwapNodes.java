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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        ListNode startNode;
        ListNode endNode = head;
        for(int i=0;i<k-1;i++){
            curr = curr.next;
        }
        startNode = curr;
        while(curr.next!=null){
                endNode = endNode.next;
                curr = curr.next;
            }
        
        int temp = startNode.val;
        startNode.val = endNode.val;
        endNode.val = temp;
        return head;
    }
}
