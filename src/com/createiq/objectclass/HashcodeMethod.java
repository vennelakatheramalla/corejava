package com.createiq.objectclass;

public class HashcodeMethod {
	private int id;
	String name;
	
	public HashcodeMethod() {
		
	}
	
	public HashcodeMethod(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		HashcodeMethod obj =new HashcodeMethod();
		String s11="vennela";
		String s22="vennela";
		System.out.println(s11.hashCode());
		System.out.println(s22.hashCode());
		HashcodeMethod s1=new HashcodeMethod(12, "vinny");
		HashcodeMethod s2=new HashcodeMethod(12, "vinny");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
