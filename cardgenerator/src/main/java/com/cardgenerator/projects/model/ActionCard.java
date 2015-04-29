package com.cardgenerator.projects.model;

abstract class ActionCard extends FrontSideCard {
	
	private String description;	

	public ActionCard(String title, String description, String imageUrl) {
		
		super(title, imageUrl);		
		setDescription(description);		
	}
	
	private void setDescription(String description) {
		this.description = description;
	}	

	public String getDescription() {
		return description;
	}	
}
