package com.bitlogic.springbootrestapi.app.servicei;

import java.util.List;

import com.bitlogic.springbootrestapi.app.model.Product;

public interface ProductServiceI {

	Product saveProductData(Product p);

	List<Product> getallProductData();

	Product getoneProductData(Integer pid);

	Product updateProductData(Integer pid, Product p);

	String deleteProductData(Integer pid);

	
	
	

	
	

}
