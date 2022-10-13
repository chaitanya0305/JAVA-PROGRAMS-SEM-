
abstract class AB{
	abstract void display();
}

interface ABC{
	void display();
}  

public class display extends AB{
	
	display(){
		System.out.println("I am Abhigyan");
	}
	
	public static void main(String args[]){
	new display();
}
}