package com.bitlogic.springbootrestapi.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlogic.springbootrestapi.app.model.Product;
import com.bitlogic.springbootrestapi.app.servicei.ProductServiceI;
@CrossOrigin("*")
@RestController
public class ProductController {
	
	@Autowired
	ProductServiceI psi;
	
@PostMapping("/saveProduct")
public Product saveProduct(@RequestBody Product p) {
	System.out.println("Hello World");
	Product pro=psi.saveProductData(p);
	return pro;
}

@GetMapping("/getallProduct")
public List<Product> getallProduct(){
	System.out.println("Hello World");
	System.out.println("Git Practice");
	List<Product> pro=psi.getallProductData();
	return pro;
}

@GetMapping("/getoneProduct/{pid}")
public Product getoneProduct(@PathVariable Integer pid) {
	
	Product pro=psi.getoneProductData(pid);
	return pro;
}

@PutMapping("/updateProduct/{pid}")
public Product updateProduct(@PathVariable Integer pid, @RequestBody Product p) {
	
	Product pro=psi.updateProductData(pid,p);
	return pro;
}

@DeleteMapping("/deleteProduct/{pid}")
public String deleteProduct(@PathVariable Integer pid) {
	
	psi.deleteProductData(pid);
	return "Data Deleted";
}

}
