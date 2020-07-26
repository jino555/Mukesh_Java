
public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum(10.5, 25.5);
		

	}
public void sum(int a,double b) {
		
		double s=a+b;
		System.out.println(s);
	}

public void sum(double  a,int b) {
	
	
}
	
	public void sum(int a,int b) {
		
		
	}
	
	public void sum(double a,double b) {
		
		
	}
}
