
public class Array {

	public static void main(String[] args) {
		Array ar = new Array();
		ar.array();

	}

	public void array() {
		
		int sum[]= new int[3];
		sum[0]=12;
		sum[1]=14;
		sum[2]=15;
		System.out.println("sum "+sum[1]);
	
	
		for(int i:sum)
		System.out.println("sum "+i);
		
	}
	
	
	}

