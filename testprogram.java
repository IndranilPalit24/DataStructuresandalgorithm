public class testprogram {
	public static int recursivemethod(int n) {
		if(n<=1) {
			System.out.println("n is less than 1");
		}
		recursivemethod(n-1);
		return n;
		
	}
	
	public static void main(String[]args) {
		int ans = recursivemethod(4);
		System.out.println(ans);
	}

}
