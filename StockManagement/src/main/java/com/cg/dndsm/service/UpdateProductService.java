package com.cg.dndsm.service;

import com.cg.dndsm.exception.ProductException;
import com.cg.dndsm.model.ProductModel;

public interface UpdateProductService {

	
	public ProductModel addExitDate(ProductModel model) throws ProductException;
	public ProductModel updateProductDetails(ProductModel model) throws ProductException;
	
	public boolean exitDateCheck(ProductModel oldDetails);
	
	
	
}
