package com.ashish.project.Ecommerce.dto;

import java.util.List;

import com.ashish.project.Ecommerce.entity.Role;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {

	private Integer userId;
	private String username;
	private List<Role> roles;
}
