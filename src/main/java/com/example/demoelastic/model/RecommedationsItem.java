package com.example.demoelastic.model;

import java.util.List;


public class RecommedationsItem{
	private String productGender;
	private String brandName;
	private String productLevel1Id;
	private int price;
	private List<ListOfProductLevel2Item> listOfProductLevel2;
	private String imageUrl;
	private String productName;
	private String productType;

	public void setProductGender(String productGender){
		this.productGender = productGender;
	}

	public String getProductGender(){
		return productGender;
	}

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setProductLevel1Id(String productLevel1Id){
		this.productLevel1Id = productLevel1Id;
	}

	public String getProductLevel1Id(){
		return productLevel1Id;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setListOfProductLevel2(List<ListOfProductLevel2Item> listOfProductLevel2){
		this.listOfProductLevel2 = listOfProductLevel2;
	}

	public List<ListOfProductLevel2Item> getListOfProductLevel2(){
		return listOfProductLevel2;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return productName;
	}

	public void setProductType(String productType){
		this.productType = productType;
	}

	public String getProductType(){
		return productType;
	}

	@Override
 	public String toString(){
		return 
			"RecommedationsItem{" + 
			"productGender = '" + productGender + '\'' + 
			",brandName = '" + brandName + '\'' + 
			",productLevel1Id = '" + productLevel1Id + '\'' + 
			",price = '" + price + '\'' + 
			",listOfProductLevel2 = '" + listOfProductLevel2 + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",productName = '" + productName + '\'' + 
			",productType = '" + productType + '\'' + 
			"}";
		}
}