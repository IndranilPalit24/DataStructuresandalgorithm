public class gcd {
	public static int findgcd(int a,int b) {
		if(b==0) {
			return a;
		}else {
			return findgcd(b,a%b);
		}
	}
	
	public static void main(String[]args) {
		int answer = findgcd(0,0);
		System.out.println("The answer is " +answer);
	}
}
