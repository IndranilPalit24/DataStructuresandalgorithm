public class string {

	public static void main(String[] args) {
		System.out.println(replaceletters("Computer science"));
	}
	
	public static String replaceletters(String s) {
		s.toLowerCase();
		
		for(int i=0;i<s.length();i++){
			char st=s.charAt(i);
			if(st=='e') {
				st='*';
			}
		}
		return s;
		
	}
}
	
