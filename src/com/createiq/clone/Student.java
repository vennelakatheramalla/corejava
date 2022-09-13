package com.createiq.clone;

public class Student implements Cloneable{
	
	private int id;
	String name;
	
	public Student() {
		
	}
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//copying of constructor
	public Student(Student copy) {
		this.id=copy.id;
		this.name=copy.name;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args)throws ClassNotFoundException, CloneNotSupportedException {
		Student s1=new Student(12, "venny");
		Student s2=new Student(34, "navya");
		Student s3=new Student(45, "jaggu");
		Student s4=new Student(23, "vishwa");
	//	s1.clone();
	//	System.out.println(s1.clone());
		System.out.println(s1);
		Student cloneddata=(Student)s1.clone();
		System.out.println(cloneddata);
		
		
		
	}
	
	
	

}
