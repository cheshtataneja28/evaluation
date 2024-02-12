package org.ncu.spring;

import java.util.List;

public interface InventoryService 
{
	 void addProduct(Product product);
	    void updateProduct(int id, Product updatedProduct);
	    Product getProductById(int id);
	    List<Product> getAllProducts(); 
}