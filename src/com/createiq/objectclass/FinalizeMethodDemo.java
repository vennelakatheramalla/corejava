package com.createiq.objectclass;

public class FinalizeMethodDemo {
	private int id;
	
	public FinalizeMethodDemo(int id) {
		this.id=id;
		System.out.println("instance id is:" +id);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalise method is invoking..........");
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10000000;i++) {
			new FinalizeMethodDemo(i);
		}
	}
	
	
	
	
	

}
