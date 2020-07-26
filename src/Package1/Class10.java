
public class Class10 implements Interface10 {

	public static void main(String[] args) {
		//Class10 obj = new Class10();
		
		Interface10 obj = new Class10();
		
		obj.sum();
		obj.sub();
//		obj.mul();
	//	obj.div();
		
		

	}
	
	public void mul() {
		
		System.out.println("mul");
	}
	
	
public void div() {
		
		System.out.println("div");
	}

@Override
public void sum() {
	System.out.println("sum");
	
}

@Override
public void sub() {
	System.out.println("sub");
	
}
}
