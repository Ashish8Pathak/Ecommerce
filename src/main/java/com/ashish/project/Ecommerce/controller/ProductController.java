package com.ashish.project.Ecommerce.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashish.project.Ecommerce.dto.ProductDTO;
import com.ashish.project.Ecommerce.service.ProductService;

@Controller
@RequestMapping(path = "/api/v1/public/product/search")
public class ProductController {
	
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping(value = "/byName")
	public ResponseEntity<List<ProductDTO>> getProductByKeyword(@RequestParam(name="name") String name){
		
		if(name.isBlank())
			return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		
		List<ProductDTO> listOfProduct = productService.getProductListByName(name);
		
		return new ResponseEntity<>(listOfProduct,HttpStatus.OK);
	}
	
	@GetMapping(value = "/byCategory")
	public ResponseEntity<List<ProductDTO>> getProductByCategory(@RequestParam(name="category") String category){
		
		if(category.isBlank())
			return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		
		
		List<ProductDTO> listOfProduct = productService.getProductListByCategory(category);
		
		return new ResponseEntity<>(listOfProduct,HttpStatus.OK);
	}

}
