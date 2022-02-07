public class countmatchesintournament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOfMatches(7));
	}
	
	public static int NumberOfMatches(int teams) {
		if(teams<=1) {
			return 0;
		}
		
		if(teams%2==0) {
			return teams/2 + NumberOfMatches(teams/2);
		}else {
			return (teams-1)/2 +NumberOfMatches((teams-1)/2+1);
		}
	}

}
