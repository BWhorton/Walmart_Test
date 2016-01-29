package com.interview.model;

import java.util.List;

import com.interview.model.Recomend.Recommendations;

public class Product {
	
	private String itemName = "ipod";
	private int itemId;
	List<Recommendations> recommendations;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public List<Recommendations> getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(List<Recommendations> recommendations) {
		this.recommendations = recommendations;
	}	
}
