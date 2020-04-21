package com.capg.assign.bean;

public class Product
{
	private int pId;
	private String pName;
	
	
	public Product() {
		super();
		
	}

	public Product(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + "]";
	}
	
	

	
	
}
