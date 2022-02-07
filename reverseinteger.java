public class reverseinteger {
	public static int reverseinteger(int number) {
		int reversenumber=0;
		while(number>0) {
			reversenumber = (reversenumber*10+number%10);
			number/=10;
		}
		return -reversenumber;
	}
	
	public static void main(String[]args) {
		int answer = reverseinteger(121);
		System.out.println("The reverse integer is "+answer);
	}
}

