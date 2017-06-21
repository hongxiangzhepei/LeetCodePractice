/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * 
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * 
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * 
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * 
 * @author Suanlafen
 *
 */

public class p485_MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int temp=0;
        for(int n:nums){
        	if(n==1)    temp++;
        	else{
        		if(temp>max)	max=temp;
        		temp=0;
        	}
        }
		if(temp>max)
			max=temp;
        return max;
    }

}
