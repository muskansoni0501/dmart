package com.lti.dmart.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	
@Entity
@Table(name="PRODUCTS")
public class Product {
		
	@Id
	@Column(name="PRD_ID")
	private int prdId;
	
	@Column(name="PRD_NAME")
	private String prdName;
	
	@Column(name="PRD_COST")
	private double prdCost;
	
	public Product() {
		super();
	}
	
	public Product(int prdId, String prdName, double prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}
	
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}
	
	@Override
	public String toString() {
		return "Product \n [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}

}
