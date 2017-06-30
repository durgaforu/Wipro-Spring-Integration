package com.emp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emp.dao.entities.Product;

@Repository
public class ProductDaoImpl implements ListProductDao {

	@Autowired
	private SessionFactory saessionFactory;

	@Transactional
	public List<Product> listProds() {

		Session ses = saessionFactory.getCurrentSession();

		Query qry = ses.createQuery("from Product");
		List<Product> prods = qry.list();

		return prods;

	}

}
