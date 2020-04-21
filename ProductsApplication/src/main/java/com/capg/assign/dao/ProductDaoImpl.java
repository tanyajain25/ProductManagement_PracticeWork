package com.capg.assign.dao;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.capg.assign.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao
{
	private Map<Integer, Product> map= new HashMap<Integer,Product>();
	

	public void toSaveDetails(Product p) 
	{
		map.put(p.getpId(),p);
	}

	public Product toFindProduct(int pId) 
	{
		Product p =map.get(pId);
	        return p;
	}
	
	
	
}
