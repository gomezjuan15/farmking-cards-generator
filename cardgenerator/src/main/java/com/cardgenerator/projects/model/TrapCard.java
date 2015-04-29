package com.cardgenerator.projects.model;

public class TrapCard extends FrontSideCard {
	
	private int threatLevel;
	private String effect;

	public TrapCard(String title, 
			String imageUrl,
			String effect,
			int threatLevel) {
		
		super(title, imageUrl);
		setEffect(effect);
		setThreatLevel(threatLevel);
	}

	public String getEffect() {
		return effect;
	}

	private void setEffect(String effect) {
		this.effect = effect;
	}

	public int getThreatLevel() {
		return threatLevel;
	}

	private void setThreatLevel(int threatLevel) {
		this.threatLevel = threatLevel;
	}

}
