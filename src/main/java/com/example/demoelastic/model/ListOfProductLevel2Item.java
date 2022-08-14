package com.example.demoelastic.model;


public class ListOfProductLevel2Item{
	private String date;
	private ProductLevel1 productLevel1;

	private int size;

	private String merchantId;

	private String productColor;

	private int rating;

	private String productLevel2Id;

	private int discount;

	private String description;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setProductLevel1(ProductLevel1 productLevel1){
		this.productLevel1 = productLevel1;
	}

	public ProductLevel1 getProductLevel1(){
		return productLevel1;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setMerchantId(String merchantId){
		this.merchantId = merchantId;
	}

	public String getMerchantId(){
		return merchantId;
	}

	public void setProductColor(String productColor){
		this.productColor = productColor;
	}

	public String getProductColor(){
		return productColor;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setProductLevel2Id(String productLevel2Id){
		this.productLevel2Id = productLevel2Id;
	}

	public String getProductLevel2Id(){
		return productLevel2Id;
	}

	public void setDiscount(int discount){
		this.discount = discount;
	}

	public int getDiscount(){
		return discount;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	@Override
 	public String toString(){
		return 
			"ListOfProductLevel2Item{" + 
			"date = '" + date + '\'' + 
			",productLevel1 = '" + productLevel1 + '\'' + 
			",size = '" + size + '\'' + 
			",merchantId = '" + merchantId + '\'' + 
			",productColor = '" + productColor + '\'' + 
			",rating = '" + rating + '\'' + 
			",productLevel2Id = '" + productLevel2Id + '\'' + 
			",discount = '" + discount + '\'' + 
			",description = '" + description + '\'' + 
			"}";
		}
}