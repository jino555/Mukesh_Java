package defaultpackage2;

public class WrapperClass {
	
	public static void main(String[] args) {
		String name = "10";
		;
		int a =	Integer.parseInt(name);
	System.out.println(a);
	
		//Autoboxing
		
		int b=100;
		Integer c=b;
		System.out.println(c);
		
		//Boxing
		
		int d=111;
		Integer e=Integer.valueOf(d);
		System.out.println(e);
		
		
		//Autounboxing
		Integer n=12;
		int m=n;
		System.out.println(m);
		
		//unboxing
		Integer r=12;
		int s =r.intValue();
		System.out.println(s);
		
	}
	

}
