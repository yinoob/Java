class GoodDog{
	private int size;
	public int getsize(){
		return size;
	}
	public void setSize(int s){
		size=s;
	}

void bark(){
	if(size>60){
		System.out.println("Wooof!Woof!");
	}else if(size>14){
		System.out.println("Ruff!Ruff");
	}else{
		System.out.println("Yip!Yip1");
	}
	}
	}
class GoodDogTestDrive{
	public static void main(String[] args){
		GoodDog one=new GoodDog();
		one.setSize(70);
		GoodDog two=new GoodDog();
		two.setSize(8);
		System.out.println("Dog one:"+one.getsize());
		System.out.println("Dog two:"+two.getsize());
		one.bark();
		two.bark();
	}
}