package defaultpackage2;

public class ThisKeyword {
int x;
int y;

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(25,16);
obj.sum();
		
	}

	
	public ThisKeyword(int a , int y) {
		x=a;
		this.y=y;
		
		
	}
	
	public void sum() {
		
		System.out.println(x);
		System.out.println(y);
	}
	
public ThisKeyword() {
		this(10);
		System.out.println("Default constructor");
		
	}
	
public ThisKeyword(int i) {
		this("jino");
	System.out.println("int  constructor " +i);
	}
	
public ThisKeyword(String name ) {
	System.out.println("String  constructor");
	
}
}
