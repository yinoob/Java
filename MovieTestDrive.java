class Movie{
	String title;
	String genre;
	int rating;

void PlayIt(){
	System.out.println("Playing the movie");

}
}
public class MovieTestDrive{
	public static void main(String[] args){
		Movie one=new Movie();
		one.title="Gone with the Stock";
		one.genre="Tragic";
		one.rating=-2;
		Movie two=new Movie();
		two.title="Gone with the Stock";
		two.genre="Tragic";
		two.rating=-2;
		two.PlayIt();
		Movie three=new Movie();
		three.title="Gone with the Stock";
		three.genre="Tragic";
		three.rating=-2;
	}
}
