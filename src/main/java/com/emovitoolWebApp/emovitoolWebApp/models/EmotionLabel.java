package com.emovitoolWebApp.emovitoolWebApp.models;

import jakarta.persistence.*;

@Entity
@Table(name="emotion_label")
public class EmotionLabel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	
	private int id;
	
	@Column(name="label")
	private String label;
	
	@Column(name="active")
    private boolean selected;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
