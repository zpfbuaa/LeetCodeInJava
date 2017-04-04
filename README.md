# LeetCodeInJava

## List
*	[#82. Remove Duplicates from Sorted List II(Only Distinct Left)](#-82-remove-dumplicats-from-sorted-list-ii)
*	[#83. Remove Duplicates from Sorted List(Recursion)](#-83-remove-dumplicats-from-sorted-list)
*	[#84. Largest Rectangle in Histogram(Using Stack)](#84-largest-rectangle-in-histogram)
*	[#85. Maximal Rectangle(DP solution)](#85-maximal-rectangle)
*	[#86. Partition List(Using Two Nodes With Head)](#86-partition-list)
*	[#87. Scramble String(BackTrack)](#87-scramble-string)
*	[#88. Merge Sorted Array(Traverse Array From Back to Head)](#88-merge-sorted-array) 

## Detail
#### <font color = Green> <span id="82">#82. Remove Duplicates from Sorted List II</span></font>


#### LeetCode Link:<br>
[https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/#/description](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/#/description)
#### Problem description:<br>
>Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
>
>For example,
>
>Given 1->2->3->3->4->4->5, return 1->2->5.
>
>Given 1->1->1->2->3, return 2->3.

#### Source code:<br>

#### <font color = Blue size = 5> Analysis:</font>
>This problem is quiet different from the last one #83Remove Duplicates from Sorted List. We need to keep only distinct numbers in the list. However, we still have a already sorted list. To solve this problem, we can use the recursion too. We reverse the whole list, move the node's next to a node which has a different number. 
>
>How to do this? The last problem, we just change the value of each node, but here we need to change the node's next pointer. Going through the whole list, until find a node which's value is different, and move the front node's next pointer to this new node.
>
>That's to say, we don't keep the numbers which apperars more than once. We jump out of every duplicate numbers and hold the only distinct numbers.
>
>Here goes the core code:
><pre>
>if (head == null) return null;
>	if (head.next != null && head.val == head.next.val) {
>	    while (head.next != null && head.val == head.next.val) {
>	        head = head.next;
>	    }
>	    return deleteDuplicates(head.next);
>	   } else {
>	    head.next = deleteDuplicates(head.next);
>	  }
>	return head;
>


#### <font color = Green> <span id="83">#83. Remove Duplicates from Sorted List</span></font>

#### LeetCode Link:<br>
[https://leetcode.com/problems/remove-duplicates-from-sorted-list/#/description](https://leetcode.com/problems/remove-duplicates-from-sorted-list/#/description)
#### Problem description:<br>
>Given a sorted linked list, delete all duplicates such that each element appear only once.
>
>For example,
>
>Given 1->1->2, return 1->2.
>
>Given 1->1->2->3->3, return 1->2->3.

#### Source code:<br>

#### <font color = Blue size = 5> Analysis:</font>
>Before we delete elements from list, we should notic that the list is already sorted. Therefore, we just compare the value of each two adjacent nodes. If they are same, we need change the value and keep each number just appear one time. We can achieve this goal easily.
>
>In order to remove duplicates in list, it is esay to think about recursion by changing each node's next pointer. The recursion code is really short and very intuitive. 
><pre>
>if(head == null || head.next == null) return head;
>head.next = deleteDuplicates(head.next);
>return head.val == head.next.val ? head.next : head;
></code>


#### <font color = Green> <span id="84">#84. Largest Rectangle in Histogram</span></font>


#### LeetCode Link:<br>
[https://leetcode.com/problems/largest-rectangle-in-histogram/#/description](https://leetcode.com/problems/largest-rectangle-in-histogram/#/description)
#### Problem description:<br>
>Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
>
>![#84\_1.histogram](https://github.com/zpfbuaa/LeetCodeInJava/blob/master/images/%2384_1.histogram.png)
>
>Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
>
>![#84\_2.histogram\_area](https://github.com/zpfbuaa/LeetCodeInJava/blob/master/images/%2384_2.histogram_area.png)
>
>The largest rectangle is shown in the shaded area, which has area = 10 unit.
>
>For example, Given heights = [2,1,5,6,2,3],
>
>return 10.

#### Source code:<br>

#### <font color = Blue size = 5> Analysis:</font>
>A great explanation: [https://www.youtube.com/watch?v=VNbkzsnllsU](https://www.youtube.com/watch?v=VNbkzsnllsU)
>
>We traverse the array, and using a stack to keep the index which is heighter than the last one bar. If the stack is empty or we meet a bar is heighter than the last bar, we just push the index into the stack.Others we start to  calculate the rectangle's size until now position. Besides, we need to know the length of this rectangle, (i - 1 - s.peek()) is the length of the rectangle while the stack is not empty and the length is i while the stack is empty.
>


#### <font color = Green> <span id="85">#85. Maximal Rectangle</span></font>

#### LeetCode Link:<br>
[https://leetcode.com/problems/maximal-rectangle/#/description](https://leetcode.com/problems/maximal-rectangle/#/description)
#### Problem description:<br>
>Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
>
>For example, given the following matrix:
><pre>
>1 0 1 0 0
>1 0 1 1 1
>1 1 1 1 1
>1 0 0 1 0
></pre>Return 6.

#### Source code:<br>


#### <font color = Blue size = 5> Analysis:</font>
>The DP solution to this problem is retraver row by ros, starting form the first row. The maximal rectangle area at (i,j) can be computed by right(i,j)-left(i,j)*height(i,j).
>
>All those three varibles left, right, and height can be determined by the information from previous row, and also related to the current row. So it is a DP problem. The transition equations are:
>
>`left(i,j) = max(left(i-1,j),cur_left)`
>
>`right(i,j) = min(right(i-1,j),cur_right)`
>
>`height(i,j) = height(i-1,j)+1 if matrix[i][j] == 1`
>
>`height(i,j) = 0,if matrix[i][j] == '0'`


#### <font color = Green> <span id="86">#86. Partition List</span></font>


#### LeetCode Link:<br>
[https://leetcode.com/problems/partition-list/#/description](https://leetcode.com/problems/partition-list/#/description)
#### Problem description:<br>
>Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

>You should preserve the original relative order of the nodes in each of the two partitions.
>
>For example,
><pre>
>Given 1->4->3->2->5->2 and x = 3,
>return 1->2->2->4->3->5.
></pre>

#### Source code:<br>
[https://github.com/zpfbuaa/LeetCodeInJava/blob/master/LeetCodeInJava/Solution86.java](https://github.com/zpfbuaa/LeetCodeInJava/blob/master/LeetCodeInJava/Solution86.java)
#### <font color = Blue size = 5> Analysis:</font>

>As we can see, we select a pivot to achieve the task, partitioning this list. After partition, the val which is less than `x` is moved before the numbers which are greater or equal to `x`. At the same time, we can't change the original relative order.
>
>Here, we choose a smart way to solve this problem by creating two nodes(`less` && `greq`) with head. One is used to hold the node which are less than `x`, the other one is used to hold the nodes whic are greater or equal to `x`. 
>
>However, before we doing so, the first thing needed to do is to keep the head so when it comes to return value, it is very easy to find the node's head. Therefore we need other two pointers to record the heads.
>
>Then we just need to traverse the list, when meet the node which's val is less than `x` and put it to the `less` node. The same way, when meet the node which's val is greater or equal to `x`,, just move it to the `greq` node.


#### <font color = green><span id="87">87. Scramble String</span></font>


#### LeetCode Link:<br>
[https://leetcode.com/problems/scramble-string/#/description](https://leetcode.com/problems/scramble-string/#/description)
#### Problem description:<br>
>Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
>Below is one possible representation of s1 = "great":
<pre>
    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
</pre>
>To scramble the string, we may choose any non-leaf node and swap its two children.
>For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat".
<pre>
    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
</pre>
>We say that "rgeat" is a scrambled string of "great".
>Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae".
<pre>
    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
</pre>
>We say that "rgtae" is a scrambled string of "great".
>
>Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.'

#### Source code:<br>

#### <font color = Blue size = 5> Analysis:</font>
>First, we just check whether s1 or s2 is equal to null in order to cut branches. If s1 is equal to s2, then s2 is a scrambled string of s1. Besides, if  s2 is a srcamled string of s1, then the length of s2 have to equal with the length of s1. At the same time, s1 and s2 must contain same numbers of letters. That means after sort s1 and s2, s1 is equal to s2. But we can just use a array[26] to solve this problem.
>
> Then, here comes the problem. How to judge s2 is a scrambled string of s1? Accoring to the example given to us, it is easy to think about using back-track.    Following is the core code for back-track:
> 
><pre>
>for(int i = 1; i < len; i++){
>	if(isScramble(s1.substring(0,i), s2.substring(0,i)) && isScramble(s1.substring(i), s2.substring(i))) return true;
>	if(isScramble(s1.substring(0,i), s2.substring(len-i)) && isScramble(s1.substring(i), s2.substring(0,len-i))) return true;
>}   
></pre>
>

#### <font color = green><span id="88">#88. Merge Sorted Array</span></font>


#### LeetCode Link:<br>
[https://leetcode.com/problems/merge-sorted-array/#/description](https://leetcode.com/problems/merge-sorted-array/#/description)

#### Problem description:<br>

>Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.<br>
>Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

#### Source code:<br>
[https://github.com/zpfbuaa/LeetCodeInJava/blob/master/LeetCodeInJava/Solution88.class](https://github.com/zpfbuaa/LeetCodeInJava/blob/master/LeetCodeInJava/Solution88.class)
#### <font color = Blue size = 5> Analysis:</font>

>Since array `nums1` is enough larger to hold the numbers from both arrays. Besides, we already know the size of each array(`nums1` holds `n` numbers and `nums2` holds `m` numbers). Therefore, we just use need to compare each element in two arrays from back to head, and always put the larger one to arrays `nums1`.
>
>After going through the array from back to head, we also need to verify whether there is left numbers in array `nums2`. If there are some numbers left in array `nums2`, we need to put them all into the array `nums1`<br>
>Because we have to traverse the array, so the time complexity is O(n) and it doesn't need extra space.


