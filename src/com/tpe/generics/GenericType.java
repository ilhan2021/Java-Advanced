package com.tpe.generics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType <T> {
	private T typeT;
	
	
	
	
	
	
	public T getTypeT() {
		return typeT;
	}

	public void setTypeT(T typeT) {
		this.typeT = typeT;
	}



	public static void main(String[] args) {
	
		GenericType<String> obj1 = new GenericType<>();
		obj1.setTypeT("Generic Types in Java");
		
		GenericType<Integer> obj2 = new GenericType<>();
		obj2.setTypeT(65);
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Generic");
		//list.add(new Point());
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Java");
	//	map.put("Java",1); Compile Time Error
		
		
		
		
		
}

}
