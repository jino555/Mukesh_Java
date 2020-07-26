
public class Constructor {
int a;
String s ;


	public static void main(String[] args) {
		
		
	Constructor obj = new Constructor(45, "jino");
		//Constructor obj = new Constructor("jincy", 45);
obj.result();

	}

	
	
	public Constructor(int a, String b) {
		
		
	this.a=a;
		s=b;
	}
	
	
	public Constructor(String a , int b) {
		
		a=a;
	b=b;
	}

	public void result() {
		
		System.out.println(a);
		System.out.println(s);
		
		
	}
	
}
