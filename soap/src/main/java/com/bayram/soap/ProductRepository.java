package com.bayram.soap;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.soapdeneme.xml.product.Product;

@Component
public class ProductRepository {
	 private static final Map<Integer, Product> products = new HashMap<>();
	 
	 @PostConstruct
	 public void initData() {
		 
		 Product product=new Product();
		 product.setId(1);
		 product.setName("Mobile Phone");
		 product.setCost("1200 TL");
		 products.put(product.getId(), product);
		 
		 product=new Product();
		 product.setId(2);
		 product.setName("Headphone");
		 product.setCost("300 TL");
		 products.put(product.getId(), product);
		 
		 product=new Product();
		 product.setId(3);
		 product.setName("Hair dryer");
		 product.setCost("450 TL");
		 products.put(product.getId(), product);
		 
		 product=new Product();
		 product.setId(4);
		 product.setName("Calculator");
		 product.setCost("200 TL");
		 products.put(product.getId(), product);
		 
		 product=new Product();
		 product.setId(5);
		 product.setName("Mouse");
		 product.setCost("150 TL");
		 products.put(product.getId(), product);
		 
		 product=new Product();
		 product.setId(6);
		 product.setName("Laptop");
		 product.setCost("5300 TL");
		 products.put(product.getId(), product);
		 
	 }

	 public Product findProductById(int id) {
		 return products.get(id);
	 }
}
