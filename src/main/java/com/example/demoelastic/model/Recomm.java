package com.example.demoelastic.model;

import java.util.List;

public class Recomm{
	private List<RecommedationsItem> recommedations;
	private String category;

	public void setRecommedations(List<RecommedationsItem> recommedations){
		this.recommedations = recommedations;
	}

	public List<RecommedationsItem> getRecommedations(){
		return recommedations;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	@Override
 	public String toString(){
		return 
			"Recomm{" + 
			"recommedations = '" + recommedations + '\'' + 
			",category = '" + category + '\'' + 
			"}";
		}
}