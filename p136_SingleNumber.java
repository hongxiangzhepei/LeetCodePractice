/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * 
 * @author Suanlafen
 *
 */
public class p136_SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int singleNumber(int[] nums) {
    	int res=0;
        for(int n:nums)
        	res ^= n;
        return res;
    }
}
