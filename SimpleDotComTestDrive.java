 class SimpleDotCom{
	int[] locationCells;
	int numOFHits=0;

	public void setLocationCells(int[] locs){
		int[] locationsCells = locs;
	}
	public String checkYourself(String stringGuess){
		int guess=Integer.parseInt(stringGuess);
		String result="miss";
		for(int cell:locationCells){
			if(guess==cell){
				result="hit";
				numOFHits++;
				break;
			}
		}
		if(numOFHits==locationCells.length){
			result="kill";
		}
		System.out.println(result);
		return result;
	}
}
public class SimpleDotComTestDrive{
	public static void main(String[] args){
		SimpleDotCom dot=new SimpleDotCom();
		int[] locations={2,3,4};
		dot.setLocationCells(locations);
		String userGuess="2";
		String result=dot.checkYourself(userGuess);
	}
}