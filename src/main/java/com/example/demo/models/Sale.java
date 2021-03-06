package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "sale")
public class Sale {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private Date date;
	
	@NotNull
	private String product;
	
	@NotNull
	private int value;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	public Seller getSeller() {
		return this.seller;
	}
	
	public void setSellerId(long sellerId) {
		if (this.seller == null)
			this.seller = new Seller();
		this.seller.setId(sellerId);
	}
}
