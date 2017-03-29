# LeetCodeInJava
---

## List

*	[#88. Merge Sorted Array(Traverse Array From Back to Head)](#88) 

---
## Detail


### <span id="88">#88. Merge Sorted Array</span>


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

>After going through the array from back to head, we also need to verify whether there is left numbers in array `nums2`. If there are some numbers left in array `nums2`, we need to put them all into the array `nums1`

>Because we have to traverse the array, so the time complexity is O(n) and it doesn't need extra space.


