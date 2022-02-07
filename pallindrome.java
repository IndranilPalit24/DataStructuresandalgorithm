public class pallindrome {
	public static boolean isPallindrome(int pallindromenumber) {
		return pallindromenumber == reversenumber(pallindromenumber);  
	}
	 static int reversenumber(int num) {
		int reversenumber=0;
		while(num>0) {
			reversenumber =reversenumber*10+num%10;
			num/=10;
		}
		return reversenumber;
	}
	public static void main(String[]args) {
		boolean Number2 = isPallindrome(121);
		System.out.println(Number2);
	}
}
