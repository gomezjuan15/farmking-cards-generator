package com.cardgenerator.projects.model;

abstract class FrontSideCard extends Card {
	
	private String title;

	public FrontSideCard(String title, 
			String imageUrl) {
		
		super(imageUrl);
		setTitle(title);		
	}
	
	private void setTitle(String title) {
		this.title = title;
	}	
	
	public String getTitle() {
		return title;
	}
}
