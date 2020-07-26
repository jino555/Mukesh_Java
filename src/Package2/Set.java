package defaultpackage2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
	HashSet<String> hs = new HashSet<String>();
		
		//LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
	//	TreeSet<String> hs = new TreeSet<String>();
		
	//	ArrayList<String> hs = new 	ArrayList<String>(ms);//covert set to list
	hs.add("jino");
	hs.add("anju");
	hs.add("hari");
	hs.add("suraj");
	hs.add("binu");
	hs.add("anju");
	System.out.println(""+hs);
	//System.out.println(""+hs.get(2));
	for(String s :hs) {
		
		System.out.println("value "+s);
		
	}
	
	}

}
