package leetcode_100;

import java.util.Stack;
/***
 * 
 * @author pengfei_zheng
 * Largest Rectangle in Histogram
 */
public class Solution84 {
    public static int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int ans = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0 ; i <= len ; i++){
        	int h;
        	if(i==len) h=0;
        	else h = heights[i];
        	if(stack.isEmpty()||h>=heights[stack.peek()]){
        		stack.push(i);
        	}
        	else{
        		int index = stack.pop();
        		ans = Math.max(ans, heights[index]*(stack.isEmpty()?i:i-1-stack.peek()));
        		i--;
        	}
        }
        return ans;
    }
    /***
     * test
     */
//    public static void main(String[]args){
//    	int[] heights={2,1,5,6,2,3};
//    	System.out.println(largestRectangleArea(heights));
//    }
    /***
     * do not miss the '}'
     */
}
