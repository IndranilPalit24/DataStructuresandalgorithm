public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reversestring("madam"));
	}
	
	public static String reversestring(String s) {
		int i=0,j=s.length();
		int n=s.length();
		char[] m = new char[n];
		m = s.toCharArray();
		if(j>i) {
			return s;
		}
		if(m[i]!=m[j]) {
			i+=1;j-=1;
		}
		return "The string is pallindrome";
	}
	

}
