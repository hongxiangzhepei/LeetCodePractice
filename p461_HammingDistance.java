/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note:
 * 0 ≤ x, y < 231.
 *
 */
 
 public class HammingDistance {
	
	public static void main(String[] args){
		System.out.println("十转二："+Integer.toBinaryString(120));
	}
	
    public int hammingDistance(int x, int y) {
    	return Integer.bitCount(x^y);
    }
}
