# LeetCodeInJava

## List
*	[#87. Scramble String(BackTrack)](#87)
*	[#88. Merge Sorted Array(Traverse Array From Back to Head)](#88) 

## Detail

#### <font color = green><span id="87">87. Scramble String</span></font>


#### LeetCode Link:<br>
[https://leetcode.com/problems/scramble-string/#/description](https://leetcode.com/problems/scramble-string/#/description)
#### Problem description:<br>
>
Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
>
Below is one possible representation of s1 = "great":
<pre>
    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
</pre>
To scramble the string, we may choose any non-leaf node and swap its two children.
>
For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat".
<pre>
    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
</pre>
We say that "rgeat" is a scrambled string of "great".
>
Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae".
<pre>
    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
</pre>
We say that "rgtae" is a scrambled string of "great".
>
Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.'

#### Source code:<br>

#### Analysis:
>First, we just check whether s1 or s2 is equal to null in order to cut branches. If s1 is equal to s2, then s2 is a scrambled string of s1. Besides, if  s2 is a srcamled string of s1, then the length of s2 have to equal with the length of s1. At the same time, s1 and s2 must contain same numbers of letters. That means after sort s1 and s2, s1 is equal to s2. But we can just use a array[26] to solve this problem.
>
> Then, here comes the problem. How to judge s2 is a scrambled string of s1? Accoring to the example given to us, it is easy to think about using back-track.    Following is the core code for back-track:
> <pre>
for(int i = 1; i < len; i++){
	if(isScramble(s1.substring(0,i), s2.substring(0,i)) && isScramble(s1.substring(i), s2.substring(i))) return true;
	if(isScramble(s1.substring(0,i), s2.substring(len-i)) && isScramble(s1.substring(i), s2.substring(0,len-i))) return true;
}   
</pre>
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
#### Analysis:
>
Since array `nums1` is enough larger to hold the numbers from both arrays. Besides, we already know the size of each array(`nums1` holds `n` numbers and `nums2` holds `m` numbers). Therefore, we just use need to compare each element in two arrays from back to head, and always put the larger one to arrays `nums1`.

>After going through the array from back to head, we also need to verify whether there is left numbers in array `nums2`. If there are some numbers left in array `nums2`, we need to put them all into the array `nums1`<br>
>Because we have to traverse the array, so the time complexity is O(n) and it doesn't need extra space.


