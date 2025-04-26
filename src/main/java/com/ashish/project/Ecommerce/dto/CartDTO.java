package com.ashish.project.Ecommerce.dto;

import java.util.List;

public class CartDTO {

	private Integer cartId;
	private Double totalAmount;
	private UserDTO user;
	private List<CartProductDTO> cartProducts;
	
	public CartDTO(Builder builder){
		this.cartId = builder.cartId;
		this.totalAmount = builder.totalAmount;
		this.user = builder.user;
		this.cartProducts = builder.cartProducts;
	}
	
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public List<CartProductDTO> getCartProducts() {
		return cartProducts;
	}
	public void setCartProducts(List<CartProductDTO> cartProducts) {
		this.cartProducts = cartProducts;
	}
	
	public static class Builder{
		
		private Integer cartId;
		private Double totalAmount;
		private UserDTO user;
		private List<CartProductDTO> cartProducts;
		
		public Builder cartId(Integer id) {
			this.cartId = id;
			return this;
		}
		
		public Builder totalAmount(Double amount) {
			this.totalAmount = amount;
			return this;
		}
		
		public Builder user(UserDTO user) {
			this.user = user;
			return this;
		}
		
		public Builder product(CartProductDTO product) {
			this.cartProducts.add(product);
			return this;
		}
		
		public Builder products(List<CartProductDTO> products) {
			this.cartProducts.addAll(products);
			return this;
		}
		
		public CartDTO build() {
			return new CartDTO(this);
		}
	}
}
