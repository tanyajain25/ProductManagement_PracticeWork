package com.capg.assign.service;

import com.capg.assign.bean.Product;

public interface ProductService 
{
	public void toSaveDetails(Product p);
	public Product toFindProduct(int pId);
}
