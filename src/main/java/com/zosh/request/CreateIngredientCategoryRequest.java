package com.zosh.request;

import lombok.Data;

@Data
public class CreateIngredientCategoryRequest {

    public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Long restaurantId;
    private String name;
}
