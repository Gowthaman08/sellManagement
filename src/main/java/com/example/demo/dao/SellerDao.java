package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Seller;

public interface SellerDao extends CrudRepository<Seller, Long> {
}
