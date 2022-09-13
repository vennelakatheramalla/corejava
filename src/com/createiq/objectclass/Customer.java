package com.createiq.objectclass;

public class Customer implements Cloneable{
	private int id;
	private String name;
	private Adress adress;
	
	public Customer() {
		
	}
	
	public Customer(int id,String name,Adress adress) {
		this.id=id;
		this.name=name;
		this.adress=adress;
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

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	
	

}
