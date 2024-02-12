package org.ncu.spring;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface ProductRepository 
{
	  Product save(Product product);
	    Product findById(int id);
	    List<Product> findAll();
	    void deleteById(int id);

}