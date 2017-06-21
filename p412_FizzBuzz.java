/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 */

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<String> fizzBuzz(int n) {
    	List<String> list = new LinkedList<>();
        for(int i=1; i<=n; i++){
        	if(i%3==0){
        		if(i%5==0)
        			list.add("FizzBuzz");
        		else
        			list.add("Fizz");
        	}
        	else if(i%5==0)
        		list.add("Buzz");
        	else
        		list.add(""+i);
        }
        return list;
    }
}
