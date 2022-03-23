package com.lti.dmart.services;

import java.util.List;

import com.lti.dmart.beans.Product;

public interface IProductService {
	
	public abstract String addProduct(Product p);
	public abstract List<Product> getAllProducts();
	public abstract String updateProductCost(int id, double cost);
	public abstract String updateProductName(int id, String name);
	public abstract String deleteProduct(int id);


}
