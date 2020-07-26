package defaultpackage2;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		
		//Hashtable<String, String>hs = new Hashtable<String,String>();
		//LinkedHashMap<String, String>hs = new LinkedHashMap<String,String>();
//	TreeMap<String, String>hs = new TreeMap<String,String>();
		
	HashMap<String, String>hs = new HashMap<String, String>();
		
		hs.put("01", "jino");
		hs.put("600", "suraj");
		hs.put("200", "mukesh");
		hs.put("300", "naveen");
		hs.put("400", "naveen");
	
		
		hs.put("500", "binu");
		
		//hs.put("400", "naveen");
	//	hs.put("800", "sooraj");
		System.out.println(""+hs);
	
		System.out.println(""+hs.get("700"));
		System.out.println(""+hs.get("800"));
		System.out.println(""+hs.get("900"));
		
		
		for (Entry<String, String> data : hs.entrySet()){
			
			System.out.println(data.getKey() + " " +data.getValue());
			
		}
	

}
}
