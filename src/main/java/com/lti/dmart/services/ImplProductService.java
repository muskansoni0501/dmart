package com.lti.dmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.dmart.dao.*;
import com.lti.dmart.beans.Product;

@Service("service")
public class ImplProductService implements IProductService {
	
	@Autowired
	private ImplProductServiceDao dao;
	
	public ImplProductServiceDao getDao() {
		return dao;
	}

	public void setDao(ImplProductServiceDao dao) {
		this.dao = dao;
	}

	@Override
	public String addProduct(Product p) {
		String message=dao.addProduct(p);
		return message;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list= dao.getAllProducts();
		return list;
	}

	@Override
	public String updateProductCost(int id, double cost) {
		String message=dao.updateProductCost(id, cost);
		return message;
	}

	@Override
	public String updateProductName(int id, String name) {
		String message=dao.updateProductName(id, name);
		return message;
	}

	@Override
	public String deleteProduct(int id) {
		String message=dao.deleteProduct(id);
		return message;
	}


}
