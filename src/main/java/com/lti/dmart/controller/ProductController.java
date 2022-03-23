package com.lti.dmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dmart.beans.Product;
import com.lti.dmart.services.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/dmart")
public class ProductController {
	
		@Autowired
		private ImplProductService service;			
		
		//http://localhost:8090/api/dmart/addnewprd
		@PostMapping("/addnewprd")
		public String addProduct(@RequestBody Product p) {
			
			String msg = service.addProduct(p);
			return msg;
			
		}
		
		//http://localhost:8090/api/dmart/products
		@GetMapping("/products")
		public List<Product> getPrdList() {
			
			List<Product> myList= service.getAllProducts();
			return myList;
			
		}
		
		//http://localhost:8090/api/dmart/product/costupdate/101, 500
		@GetMapping("/product/costupdate/{id}, {cost}")
		public String updateProductCost(@PathVariable(value="id") int id, @PathVariable(value="cost") double cost){
			
			String message=service.updateProductCost(id, cost);
			return message;
			
		}
		
		//http://localhost:8090/api/dmart/product/nameupdate/101, Bag
		@GetMapping("/product/nameupdate/{id}, {name}")
		public String productNameUpdate(@PathVariable(value="id") int id, @PathVariable(value="name") String name){
			
			String message1=service.updateProductName(id, name);
			return message1;
			
		}
				
		//http://localhost:8090/api/dmart/product/delete/101
		@GetMapping("/product/delete/{id}")
	    public String deleteProduct(@PathVariable(value="id") int id){	
			
			String msg1=service.deleteProduct(id);
			return msg1;
			
		}
		
	}