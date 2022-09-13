package com.createiq.objectclass;

public class Student {

	private int id;
	private String name;
	
	public Student() {
		System.out.println("...........");
	}
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		Student obj=new Student();
		
		String s11="vennela";
		String s22="vennela";
		String s5="vinny";
		String s6="vinny";
		System.out.println(s11.equals(s22));
		System.out.println(s11.hashCode());
		System.out.println(s22.hashCode());
	
		
		
		
		Student s1=new Student(123, null);
		Student s2=new Student(0, null);
		Student s3=new Student(0, " ");
		Student s4=new Student(23, " ");
		

		System.out.println(s1.getClass());
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());
		System.out.println(s1.equals(s4));
		System.out.println(s5.equals(s6));
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
		
		
		
	
		
	}
	
}
