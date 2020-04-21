package com.capg.assign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.assign.bean.Product;
import com.capg.assign.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService
{
		private ProductDao productDao;
		
		public ProductDao getProductDao() {
			return productDao;
		}
		@Autowired
		public void setProductDao(ProductDao productDao) {
			this.productDao = productDao;
		}

		public void toSaveDetails(Product p) 
		{
			productDao.toSaveDetails(p);
		
		}

		public Product toFindProduct(int pId) 
		{
			Product p= productDao.toFindProduct(pId);
			return p;
		}
		
	
}
	

