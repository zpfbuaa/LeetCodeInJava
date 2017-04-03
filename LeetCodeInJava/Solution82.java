package leetcode_100;

/***
 * 
 * @author pengfei_zheng
 * 
 */
public class Solution82 {
	/***
	 *  Already given to us 
	 * @author pengfei_zheng
	 *
	 */
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	};
	
	public ListNode deleteDuplicates(ListNode head) {
	    if (head == null) return null;
	    
	    if (head.next != null && head.val == head.next.val) {
	        while (head.next != null && head.val == head.next.val) {//jump the duplicate numbers
	            head = head.next;
	        }
	        return deleteDuplicates(head.next);
	    } else {
	        head.next = deleteDuplicates(head.next);//change the next pointer 
	    }
	    return head;
	}
    
}
