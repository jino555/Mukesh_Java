
public class SuperChildClass15 extends SuperParentClass15{
	
	
  
  int a=11;
	public static void main(String [] args) {
		
//	SuperChildClass15 obj = new SuperChildClass15();
	
SuperChildClass15 obj = new SuperChildClass15("Mukewsh");
	
//	SuperParentClass15 obj = new SuperParentClass15();
		
	//SuperParentClass15 obj = new  SuperChildClass15("mukesh");
	//	obj.show();
	
	
	}
	
	public SuperChildClass15() {
		super.show();
System.out.println(" child  constructor default");
	}
	
	
public SuperChildClass15(String name ) {
	super("jino");
	super.show();
	System.out.println(" CHILD constructor name  " +super.a);
	
	}

public void show() {

	System.out.println(super.a);
	System.out.println(" display");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}