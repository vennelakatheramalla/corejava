package com.createiq.objectclass;

public class CustomerCloningTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Adress adress=new Adress("rdm", "TS");
		
	Customer originalData=new Customer(12, "hyd", adress);
	Customer clonedData=(Customer) originalData.clone();
	System.out.println("original data: "+originalData);
	System.out.println("clone data"+clonedData);
	originalData.getAdress().setCity("vennela");
	originalData.setName("vinny");
	System.out.println("updated data: "+originalData);
	System.out.println("clone 2 data"+clonedData);
		
	}

}
