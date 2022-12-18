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
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode currentNode = head;
		int totalNodes = 0;
		while (currentNode != null && totalNodes < k) {
			currentNode = currentNode.next;
			totalNodes++;
		}
		if (totalNodes < k) {
			return head;
		}
		currentNode = head;
		ListNode prevNode = null;
		ListNode nextNode = null;
		int nodeCount = 0;
		while (nodeCount < k) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			nodeCount++;
		}
		head.next = reverseKGroup(nextNode, k);
		return prevNode;

    }
}
