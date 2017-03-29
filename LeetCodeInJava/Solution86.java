package leetcode_100;

/***
 * 
 * @author pengfei_zheng
 * Partition List
 */
class Solution86{
	/***
	 * 
	 * @author pengfei_zheng
	 * Following has already given to us 
	 */
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode partition(ListNode head, int x) {
		ListNode less = new ListNode(0);
		ListNode greq = new ListNode(0);
		ListNode l = less;
		ListNode g = greq;
		while(head!=null){
			if(head.val<x){
				l.next = head;
				l = l.next;
				head = head.next;
			}
			else{
				g.next = head;
				g = g.next;
				head = head.next;
			}
		}
		g.next = null;
		l.next = greq.next;// remove the head of greEqNode that means remove the first node which is added by myself
		
		return less.next;//because the head of lessNode is added by myself so return the head.next
	}
	
}