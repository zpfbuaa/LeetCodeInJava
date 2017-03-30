package leetcode_100;

/***
 * 
 * @author pengfei_zheng
 * Maximal Rectangle
 */
public class Solution85 {
    public static int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int []left = new int[col];//records left 
        int []right = new int[col];//records right 
        int []height = new int[col];//records height
        //Initialization
        for(int i = 0 ; i < col ; i++){
        		left[i]=0;
        		right[i]=col;
        		height[i]=0;
        }
        int ans = 0;
        for(int i = 0 ; i < row ; i++){
        		int cur_left = 0, cur_right = col;
        		for(int j = 0 ; j < col ; j++){//split each logical computer in order to make the code more clearly
        			if(matrix[i][j]=='1') height[j]++;
        			else height[j]=0;
        		}
        		for(int j = 0 ; j < col ; j++){
        			if(matrix[i][j]=='1') left[j]=Math.max(left[j], cur_left);
        			else{
        				left[j]=0;
        				cur_left = j+1;//move the pointer of current left
        			}
        		}
        		for(int j = col-1 ; j >= 0 ; j--){
        			if(matrix[i][j]=='1') right[j]=Math.min(right[j], cur_right);
        			else{
        				right[j]=col;
        				cur_right=j;//move the pointer of current right
        			}
        		}
        		for(int j = 0 ; j < col ; j++)
                    ans = Math.max(ans,(right[j]-left[j])*height[j]);
        }
        return ans;
    }
    /***
     * test
     */
//    public static void main(String[]args){
//    	    char[][]matrix={{ '0', '0', '1', '0', '0' },
//    	    				{ '1', '1', '1', '1', '0' },
//    	    				{ '0', '0', '1', '0', '0' },
//    	    				{ '0', '0', '1', '0', '0' },
//    	    				{ '0', '0', '1', '0', '0' }};
//    		System.out.println(maximalRectangle(matrix));
//    }
}
