/**
 * Given a string, you need to reverse the order of characters in each word 
 * within a sentence while still preserving whitespace and initial word order.
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * @author Suanlafen
 *
 */
public class ReversWordsInAString {
	public static void main(String[] args){
		String result=reverseWords("Let's take LeetCode contest");
		System.out.print(result);
	}
    public static String reverseWords(String s) {
    	char[] schar = s.toCharArray();
    	int i=0,j=0;
    	for(i=0,j=0; j<schar.length; j++){
    		if(schar[j]==' '){
    			reverse(schar,i,j-1);
    			i=j+1;
    		}
    	}
    	reverse(schar,i,j-1);
    	return new String(schar);
    }
    public static void reverse(char[] s, int a, int b){
    	
    	for(int i=a,j=b;i<j;i++,j--){
    		char t=s[i];
    		s[i]=s[j];
    		s[j]=t;
    	}
    }
}
