
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args){
		int[] nums = {1,25,3,64,88,27};
		int target=28;
		int[] result = twosum(nums,target); 
		System.out.printf("result: %d, %d", result[0],result[1]);
	}
	public static int[] twosum(int[] nums, int target){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			int diff = target-nums[i];
			if(map.containsKey(diff)){
				return new int[] { map.get(diff), i};
			}
			else{
				map.put(nums[i], i);
			}
		}
		return null;
	}
}
