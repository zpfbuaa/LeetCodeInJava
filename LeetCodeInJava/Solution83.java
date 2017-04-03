package leetcode_100;

/***
 * 
 * @author pengfei_zheng
 * Remove Duplicates from Sorted List
 */
public class Solution83 {
	/***
	 * 
	 * @author pengfei_zheng
	 * Already given to us
	 */
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	};
	public ListNode deleteDuplicates(ListNode head) {// recursion
		if(head==null || head.next ==null) return head;
		head.next = deleteDuplicates(head.next);
		return head.val == head.next.val ? head.next : head;//change the value 
	}
}
