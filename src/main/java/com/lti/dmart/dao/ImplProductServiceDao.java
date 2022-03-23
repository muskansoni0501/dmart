package com.lti.dmart.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.dmart.beans.Product;

@Repository("dao")
public class ImplProductServiceDao implements IProductDao {
	
	static List<Product> prdList= new ArrayList<>();
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public String addProduct(Product p) {
		
		em.persist(p);
        return "Product Added";
		
	}

	@Override
	@Transactional
	public List<Product> getAllProducts() {

		Query qry = em.createQuery("from Product");
	
		prdList = qry.getResultList();
		return prdList;
	}

	@Override
	@Transactional
	public String updateProductCost(int id, double cost) {
		Product p= em.find(Product.class, id);
		p.setPrdCost(cost);
		
    	em.merge(p);
       
		return "Product Cost Updated";
	}
		
	@Override
	@Transactional
	public String updateProductName(int id, String name) {
		Product p= em.find(Product.class, id);
		p.setPrdName(name);
		
		em.merge(p);
		return "Product Name Updated";
	}
	
	@Override
	@Transactional
	public String deleteProduct(int id) {
		Product p= em.find(Product.class, id);
		em.remove(p);
		return "Record Deleted";
	}

}
