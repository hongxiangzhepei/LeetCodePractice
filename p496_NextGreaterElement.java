/**
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. 
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. 
 * If it does not exist, output -1 for this number.
 */
 
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int n:nums){
        	while(!stack.isEmpty() && stack.peek()<n){
        		map.put(stack.pop(), n);
        	}
        	stack.push(n);
        }
        for(int i=0; i<findNums.length; i++){
        	findNums[i] = map.getOrDefault(findNums[i], -1);
        }
        return findNums;
    }
}
