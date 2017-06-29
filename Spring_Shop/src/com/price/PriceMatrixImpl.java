package com.price;

import org.springframework.stereotype.Repository;

// Dependency Class
@Repository(value="price")
public class PriceMatrixImpl implements PriceMatrix, F2Inter {
	
	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrix Obj created.....");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// code to fetch price from db

		return 100.00;

	}
	
	@Override
	public void f2() {
		
	}

}
