package com.ashish.project.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ashish.project.Ecommerce.dto.ProductDTO;
import com.ashish.project.Ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	public List<Product> findByProductNameContainingIgnoreCase(String name);
	
	
	@Query("Select new com.ashish.project.Ecommerce.dto.ProductDTO(p.productId, p.productName , p.price , c.category)"
			+" FROM Product p JOIN Category c ON p.category.categoryId = c.categoryId "
			+ "WHERE c.category LIKE %:category%")
	public List<ProductDTO> findAllProductsWithCategoryNameContaining(@Param("category") String category);

}
