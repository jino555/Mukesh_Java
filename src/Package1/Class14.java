
public class Class14  extends Abstract14   {

	public static void main(String[] args) {
		
	/*Class14 obj = new Class14();
		obj.algebra(); //own method
		obj.arithmetic(); //abstract method of abstract class but implemented in normal class
		obj.sub();//coming from interface but implemented in normal class
		obj.sum();//coming from interface but implemented in Abstract class
		obj.div(); //method of abstract class
		obj.percentage();//method of abstract class*/
		
		
	
		Abstract14 obj = new Class14();
		obj.arithmetic();
		obj.div();
		obj.percentage();
		obj.sum();
		obj.sub();
	
	/*	Interface14 obj1 = new Class14();
		obj1.sub();
		obj1.sum();*/

	}
	
	
	public void algebra() {
		System.out.println(" Class algebra");
		
		
	}


	@Override
	public void arithmetic() {
		System.out.println(" Class arithmetic");
		//abstract
	}


	@Override
	public void sub() {
		System.out.println(" Normal Class sub");
		
	}


	




	

}
