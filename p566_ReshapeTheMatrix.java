/**
 * In MATLAB, there is a very useful function called 'reshape', 
 * which can reshape a matrix into a new one with different size but keep its original data.
 * You're given a matrix represented by a two-dimensional array, 
 * and two positive integers r and c representing the row number and column number 
 * of the wanted reshaped matrix, respectively.
 * The reshaped matrix need to be filled with all the elements of the original matrix
 * in the same row-traversing order as they were.
 * If the 'reshape' operation with given parameters is possible and legal, 
 * output the new reshaped matrix; Otherwise, output the original matrix
 * 
 * Input: 
 * nums =
 * [[1,2], [3,4]]
 * r = 1, c = 4
 * Output:
 * [[1,2,3,4]]
 * Explanation:
 * The row-traversing of nums is [1,2,3,4]. 
 * The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
 * 
 * @author Suanlafen
 *
 */

public class ReshapeTheMatrix {
	
	public static void main(String[] args){
		int[][] nums = {{1,2},{3,4}};
		int r=1,c=4;
		int[][] result = matrixReshape(nums,r,c);
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.printf("%d ", result[i][j]);
			}
			System.out.println();
		}
	}
	
    public static int[][] matrixReshape(int[][] nums, int r, int c) {

        int rnums = nums.length;
        int cnums = nums[0].length;
        if(rnums*cnums<r*c)
        	return nums;
    	int[][] result = new int[r][c];
    	int nr=0,nc=0;
    	
        for(int i=0; i<r; i++){
        	for(int j=0; j<c; j++){
        		result[i][j] = nums[nr][nc++];
        		if(nc>=cnums){
        			nc=0;
        			nr++;
        		}
        	}
        }
        return result;
    }
}
