/**
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 */

public class ComplementNumber {
	public static void main(String[] args){
		System.out.printf("The result is %d",findComplement(5));
	}
    public static int findComplement(int num) {
        int i=0,j=0;
        while(i<num){
        	i+= Math.pow(2, j);
        	j++;
        }
        return i-num;
    }
}
