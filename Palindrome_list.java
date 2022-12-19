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
   
        ListNode getMid(ListNode head){
		ListNode slow = head;
		ListNode fast = head.next;
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
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
	
	 public boolean isPalindrome(ListNode list) {
	    // add your logic here
		ListNode middle = getMid(list);
		ListNode temp = middle.next;
		middle.next = reverse(temp);
		ListNode head1 = list;
		ListNode head2 = middle.next;
		while(head2!=null){
			if(head1.val != head2.val){
				return false;
			}
			head1=head1.next;
			head2=head2.next;
		}
		temp = middle.next;
		middle.next = reverse(temp);
		return true;
	}
    
}
