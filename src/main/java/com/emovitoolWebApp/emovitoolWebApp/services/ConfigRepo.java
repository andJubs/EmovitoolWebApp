package com.emovitoolWebApp.emovitoolWebApp.services;

import org.springframework.data.repository.CrudRepository;

import com.emovitoolWebApp.emovitoolWebApp.models.EmotionLabel;

public interface ConfigRepo extends CrudRepository<EmotionLabel, Integer> {
	
}
