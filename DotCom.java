import java.util.*;
public class Dotcom{
	private ArrayList<String> locationCells;
	private String name;

    public void setLocationCells(ArrayList<String> loc){
    	setLocationCells=loc;
    }
    public void SetName(String n){
    	name=n;
    }
    public String checkYourself(String userInput){
    	String result="miss";
    	int index=setLocationCells.indexOf(userInput);
    	if (index>=0){
    		locationCells.remove(index);

    		if(locationCells.isEmpty()){
    			result="kill";
    			System.out.println("You sunk "+name+":");
    		}else{
    			result="hit";
    		}
    	}
    	return result;
    }

}