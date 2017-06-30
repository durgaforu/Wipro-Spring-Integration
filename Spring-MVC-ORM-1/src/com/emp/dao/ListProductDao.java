package com.emp.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.emp.dao.entities.Product;

public interface ListProductDao {

	List<Product> listProds();

}