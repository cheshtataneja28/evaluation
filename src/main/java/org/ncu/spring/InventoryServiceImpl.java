package org.ncu.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@Scope("singlrton")
public class InventoryServiceImpl implements InventoryService
{
	@Autowired
	private ProductRepository productrep;
	
	 public void addProduct(Product product)
	 {
		   productrep.save(product);
	 }
	    public void updateProduct(int id, Product updatedProduct) 
	    {
	    	 Product existingProduct = getProductById(id);
	         if (existingProduct != null) {
	             updatedProduct.setId(id);
	             productrep.save(updatedProduct);
	         }
	    	
		}
	    
	    public Product getProductById(int id) {
	        return productrep.findById(id);

		}
		@Override
		public List<Product> getAllProducts() {
			// TODO Auto-generated method stub
			return null;
		}

}