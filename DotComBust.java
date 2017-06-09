import java.util.*;
public class DotComBust{
	private GameHelper helper=new GameHelper();
	private ArrayList<DotCom> dotComList=new ArrayList<DotCom>();
    private int numOfGuesses=0;
    private void setUpGame(){
    	DotCom one=new DotCom();
    	one.setName("Pets.com");
        DotCom two=new DotCom();
    	two.setName("eToys.com");
    	DotCom three=new DotCom();
    	three.setName("Go2.com");
    	dotComList.add(one);
    	dotComList.add(two);
    	dotComList.add(three);

    	System.out.println("Your goal is to sink three dot coms");
    	System.out.println("Pet.com,eToys.com,Go2.com");
    	System.out.println("Try to sink them all in the fewest number of guesses");

    	for(DotCom dotComToSet:dotComList){
    		ArrayList<String> newLocation=helper.placeDotCom(3);
    		dotComToSet.setLocationCells(newLocation);

    	}
    }

    private void startPlaying(){
   	while(!dotComList.isEmpty()){
   		String userGuess=helper.getUserInput("Enter a guess");
   		checkUserGuess(userGuess);
   	}
   	finishGame();
   }

}
private void checkUserGuess(String userGuess){
	numOfGuesses++;
	String result="miss";
	for(DotCom dotComTotest:dotComList){
		result=dotComTotest.checkYourself(userGuess);
		if(result.equals("hit")){
			break;
		}
		if (result.equals("kills") {
			dotComList.remove(dotComTotest);
			break;	
		}
     
	}
  System.out.println(result);

}
public void finishGame(){
	  System.out.println("All Dot Coms are dead!Your stock is now worthless.");
	  if(numOfGuesses<=18){
	  	System.out.println("It only took you  "+numOfGuesses+"guesses");
	  	System.out.println("You got out before your option sank");
	  }else{
	  	System.out.println("Took you long enough "+numOfGuesses+"guesses");
	  	System.out.println("Fish are dancing with your option");

	  }

}
public static void main(String[] args){
	DotComBust game=new DotComBust();
	game.setUpGame();
	game.startPlaying();
}


