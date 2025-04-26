package com.ashish.project.Ecommerce.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {

	private Integer id;
	private String  name;
	private Double  price;
	private String category;
	
	
	public ProductDTO(Integer id, String name, Double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	
	

}
