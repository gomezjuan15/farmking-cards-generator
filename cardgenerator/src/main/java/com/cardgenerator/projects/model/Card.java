package com.cardgenerator.projects.model;

abstract class Card {
	
	private String imageUrl;	

	public Card(String imageUrl) {
		
		setImageUrl(imageUrl);
	}
	
	private void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}		
}
