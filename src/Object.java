
public class Object {
	int x=20;
static int j=12;
int d;
	public static void main(String[] args) {
		
		Object obj = new Object();
		obj.sum();
		
		System.out.println(obj.x);
		String name1 =obj.data();//video9
		System.out.println("data of local variable " +name1);
	int z =Object.j;
	System.out.println("static  variable " +z);
		String name2 =result();//video9
		System.out.println("data of static globl variable " +name2 );
	}
	
	public void sum() {
		int x=10;
		int b=23;
	int d=x+b;
	
	System.out.println("sum "+d);// video 4 practice
		
	}
	
	
	public String data() {
		
		
	String name ="james";
	System.out.println("Data in method "+name);
		return name;
	}

	
	
public static String result() {
		
	String name ="jino";
	
		return name;
	}
	
	
	
	
	
	
	
	
	
	

}
