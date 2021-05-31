package com.cg.onlineshopping_application.service;

import java.util.List;

import com.cg.onlineshopping_application.dto.ProductDto;
import com.cg.onlineshopping_application.entity.Product;
import com.cg.onlineshopping_application.exception.CategoryNotFoundException;
import com.cg.onlineshopping_application.exception.ProductIdException;
import com.cg.onlineshopping_application.exception.ValidateProductException;

public interface IProductService {
 public List<Product> viewAllProducts() throws ProductIdException;
 public Product addProduct(ProductDto productDto) throws ValidateProductException, CategoryNotFoundException;
 public Product updateProduct(ProductDto productDto) throws ProductIdException, ValidateProductException, CategoryNotFoundException;
 public Product viewProduct(Integer productId) throws ProductIdException;
 public List<Product> viewProductsByCategory(Integer cat) throws CategoryNotFoundException; 
 public boolean removeProduct(Integer productId) throws ProductIdException;
}
