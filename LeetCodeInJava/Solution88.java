package leetcode_100;
/***
 * 
 * @author pengfei_zheng
 * Merge Sorted Array
 */
public class Solution88 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0) nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        while(j >= 0) nums1[k--] = nums2[j--];
    }
/**
 * test
 */
//	public static void main(String[]args){
//		int []nums1=new int [10];
//		int []nums2=new int [3];
//		nums1[0]=1;
//		nums1[1]=5;
//		nums2[0]=-1;
//		nums2[1]=3;
//		nums2[2]=7;
//		merge(nums1,2,nums2,3);
//		
//		for(int item:nums1)
//			System.out.print(item+" ");
//	}
	/***
	 * do not miss the '}'
	 */
}
