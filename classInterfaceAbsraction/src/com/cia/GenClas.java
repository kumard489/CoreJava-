package com.cia;

//generic class
class F<T>{
	
	T a;
	//constructor
	F(T age) {
		this.a=age;
		
	}
	//method
	public void details(){
		System.out.println(a);
	}
	
}
//main method
public class GenClas{
	public static void main(String[] args) {
		
		//object for generic class
		F <Integer> age=new F<>(26);
		F<String> name=new F<>("kumar");
		
		 System.out.println(age.getClass());
		boolean equals = age.equals(name);
		
		System.out.println(equals);
		age.details();
	    name.details();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
