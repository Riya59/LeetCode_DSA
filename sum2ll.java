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
    public ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        	ListNode head = null;
		ListNode prev = null;
		int carry = 0;
		while(firstList!=null || secondList!=null || carry!=0){
			int val1 = 0;
			if(firstList!=null){
				val1 = firstList.val;
			}
			int val2 = 0;
			if(secondList!=null){
				val2 = secondList.val;
			}
			int sum = carry + val1 + val2;
			int digit = sum%10;
			ListNode ans = new ListNode(digit);
			carry = sum/10;
			if(head == null){
				head = ans;
			}
			if(prev!=null){
				prev.next = ans;
			}
			prev = ans;
			if(firstList != null){
				firstList=firstList.next;
			}
			if(secondList != null){
				secondList = secondList.next;
			}
		}
		if(carry > 0) {
			ListNode extraNode = new ListNode(carry);
			prev.next = extraNode;
		}
		
		return head;
	}
        
    
}
