package com.bayram.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soapdeneme.xml.product.ProductDetailsRequest;
import com.soapdeneme.xml.product.ProductDetailsResponse;

@Endpoint
public class ProductEndpoint {
	
	private static final String NAMESPACE_URI = "http://www.soapdeneme.com/xml/product";
	
	@Autowired
	private ProductRepository productRepository;
	
	 @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ProductDetailsRequest")
	 @ResponsePayload
	 public ProductDetailsResponse getProduct(@RequestPayload ProductDetailsRequest request) {
		 ProductDetailsResponse response=new ProductDetailsResponse();
		 response.setProduct(productRepository.findProductById(request.getId()));
		 
		 return response;
	 }

}
