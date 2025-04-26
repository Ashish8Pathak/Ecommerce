package com.ashish.project.Ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ashish.project.Ecommerce.dto.ProductDTO;
import com.ashish.project.Ecommerce.entity.Product;
import com.ashish.project.Ecommerce.repository.ProductRepository;

@Service
public class ProductService {

	private ProductRepository productRepo;

	public ProductService(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}

	/*
	 * Return List of Products where product Name contains keyword 
	 */
	public List<ProductDTO> getProductListByName(String name) {

		List<ProductDTO> responseList = new ArrayList<>();

		List<Product> listOfProductByName = productRepo.findByProductNameContainingIgnoreCase(name);

		for (Product product : listOfProductByName) {
			
			
			ProductDTO productDTO = ProductDTO.builder()
										.id(product.getProductId())
										.name(product.getProductName())
										.price(product.getPrice())
										.category(product.getCategory().getCategory())
										.build();

			responseList.add(productDTO);
		}

		return responseList;
	}

	/*
	 * Return List of Products by Category
	 */
	public List<ProductDTO> getProductListByCategory(String category) {

		List<ProductDTO> listOfProductByCategory = productRepo.findAllProductsWithCategoryNameContaining(category);
		return listOfProductByCategory;
	}

}
