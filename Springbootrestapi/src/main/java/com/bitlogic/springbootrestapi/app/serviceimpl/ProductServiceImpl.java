package com.bitlogic.springbootrestapi.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogic.springbootrestapi.app.model.Product;
import com.bitlogic.springbootrestapi.app.repository.ProductRepository;
import com.bitlogic.springbootrestapi.app.servicei.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI {
	
	@Autowired 
	ProductRepository pr;

	@Override
	public Product saveProductData(Product p) {
		
		return pr.save(p);
	}

	@Override
	public List<Product> getallProductData() {
		
		List<Product> list=pr.findAll();
		return list;
		
		
	}

	@Override
	public Product getoneProductData(Integer pid) {
		
		Optional<Product> op=pr.findById(pid);
		return op.get();
		
		//Direct 
		//return pr.findById(pid).get();
	}

	@Override
	public Product updateProductData(Integer pid, Product p) {
		
		Optional<Product> op=pr.findById(pid);
		
		if (op.isPresent()) {
								Product dummy=op.get();
								dummy.setPname(p.getPname());
								dummy.setPprice(p.getPprice());
								
								return pr.save(dummy);
			
		}
		return null;
	}

	@Override
	public String deleteProductData(Integer pid) {
		
		pr.deleteById(pid);
	
		return "Deleted";
	}

	
	}
	

		
		