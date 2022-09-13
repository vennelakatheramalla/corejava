package com.createiq.objectclass;

public class GetClassMethod {
	private int id;
	String name;
	
	public GetClassMethod() {
		
	}

	public GetClassMethod(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		GetClassMethod obj=new GetClassMethod();
		GetClassMethod s1=new GetClassMethod(12, "prava");
		System.out.println(s1.getClass());
	}
}
