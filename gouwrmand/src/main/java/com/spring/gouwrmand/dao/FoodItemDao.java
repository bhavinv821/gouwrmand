package com.spring.gouwrmand.dao;

import java.util.List;

import com.spring.gouwrmand.entity.FoodItem;



public interface FoodItemDao {
	public void addFoodItem(FoodItem fi);
	public void deleteFoodItem(int fi);
	public void updateFoodItem(FoodItem fi);
	public FoodItem getFoodItem(int fid);
	public List<String> getFoodCategories();
	public List<FoodItem> getFoodByCategory(String category);
	
}
