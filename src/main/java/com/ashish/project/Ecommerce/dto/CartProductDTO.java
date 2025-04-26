package com.ashish.project.Ecommerce.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartProductDTO {

	private Integer cartProductId;
	private Integer quantity;
	private ProductDTO product;

}
