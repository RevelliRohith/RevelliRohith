package com.collections;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		//object creation for TreeMap
		TreeMap<Integer,String> TM=new TreeMap<Integer,String>();
		//Insertion of the elements 
		TM.put(1011, "Rohith");
		TM.put(1012, "Sai");
		TM.put(1013, "Rahul");
		TM.put(1014, "Karthik");
		TM.put(1015, "Charan");
		TM.put(1016, "Teja");
		TM.put(1017, "Ramu");
		TM.put(1018, "Sriman");
		
		//printing of the elements 
		System.out.println(TM);
	//Adding the element	
		TM.put(1019, "Rajesh");
		
		//printing the element
		System.out.println(TM);
		//printing the elements in the descending order by the key set 
		System.out.println(TM.descendingKeySet());
		TM.put(1020,"Aditya");
		TM.put(1021, "jagadish");
		TM.put(1022, "vaishu");
		TM.put(1023, "Priya");
		//printing 
		System.out.println(TM);
		//removing the element using remove method 
		TM.remove(1021);
		System.out.println(TM);
		
		//getting the wanted elememt using get method 
		System.out.println(TM.get(1015));
		
		//removing the element by remove method 
		System.out.println(TM.remove(1014));
		
		//replacing the element
		System.out.println(TM.replace(1022, "Vyshu"));
		
		System.out.println(TM);
		

		
	}

}
