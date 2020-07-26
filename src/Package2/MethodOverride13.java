package defaultpackage2;

public class MethodOverride13 extends MethodOverriding13 {

	
	public static void main(String[] args) {
	
	//	MethodOverride13 obj = new MethodOverride13 ();
		//MethodOverriding13 obj = new MethodOverriding13();
		MethodOverriding13 obj = new MethodOverride13 ();
		obj.add();
		obj.sub();
		//obj.mul();
		
	}
	
	
		public void mul() {
			
			System.out.println("child mul");
		}
		
		
	public void sub() {
			
			System.out.println("child sub");
		}

	
	
	
	}
	
	
	

