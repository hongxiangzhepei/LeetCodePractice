
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello"));
	}

    public static String reverseString(String s) {
        char[] c = new char[s.length()];
        for(int i = 0; i<s.length(); i++){
        	c[s.length()-i-1] = s.charAt(i);
        }
        return new String(c);
    }
}
