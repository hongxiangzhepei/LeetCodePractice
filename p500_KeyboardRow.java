/**
 * Given a List of words, return the words that can be typed using letters of alphabet 
 * on only one row's of American keyboard like the image below.
 * 
 * @author Suanlafen
 *
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class KeyboardRow {
	
	public static void main(String args[]){
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		String[] result = findWords(words);
		for(int i=0; i<result.length; i++)
			System.out.println(result[i]);
	}
	
    public static String[] findWords(String[] words) {
    	Map<Character, Integer> map = new HashMap<>();
    	String[] Keyboards = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
    	for(int i=0; i<Keyboards.length; i++){
    		for(char c: Keyboards[i].toCharArray())
    			map.put(c, i);
    	}
    	List<String> res = new LinkedList<>();
    	for(String w:words){
    		int row=map.get(w.toUpperCase().charAt(0));
    		for(char c: w.toUpperCase().toCharArray()){
    			if(map.get(c)!=row){
    				row=-1;
    				break;
    			}
    		}
    		if(row!=-1)	res.add(w);
    	}
    	return res.toArray(new String[0]);
    }

}
