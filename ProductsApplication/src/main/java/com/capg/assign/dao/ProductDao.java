package com.capg.assign.dao;

import java.util.Map;

import com.capg.assign.bean.Product;

public interface ProductDao
{
	void toSaveDetails(Product p); 
	
	Product toFindProduct(int id);
	
}
