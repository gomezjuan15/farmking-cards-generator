package com.cardgenerator.projects.model;

public class PersonalPileCard extends ActionCard {
	
	private String animal;

	public PersonalPileCard(String title, 
			String description, 
			String imageUrl,
			String animal) {
		
		super(title, description, imageUrl);
		setAnimal(animal);
	}

	public String getAnimal() {
		return animal;
	}

	private void setAnimal(String animal) {
		this.animal = animal;
	}

}
