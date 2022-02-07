
public class trailingzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = trailingzero(5);
		System.out.println("The resulting value has " +answer+ " zeros");
	}
	
	public static int trailingzero(int approvednumber) {
		int result=0;
		for(int number=5;number<=approvednumber;number+=5) {
			result+=approvednumber/number;
		}
		
		return result;
	}

}
