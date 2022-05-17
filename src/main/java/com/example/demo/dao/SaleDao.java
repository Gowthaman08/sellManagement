package com.example.demo.dao;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Sale;
import com.example.demo.models.Seller;

public interface SaleDao extends CrudRepository<Sale, Long> {
	
	Iterable<Sale> findBySeller(Seller seller);
	Iterable<Sale> findByDateBetween(Date startDate, Date endDate);
}
