package com.example.simpsonfirstspringboot.simpson;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpsonService {
	
	private SimpsonDataAccessService simpsonDataAccessService;

	@Autowired
	public SimpsonService() {
		super();
		simpsonDataAccessService = new SimpsonDataAccessService();
	}

	public List<SimpsonCharacter> getAllSimpsons() {
		return simpsonDataAccessService.getAllSimpsons();
	}

	public void addNewSimpsonCharacter(SimpsonCharacter simpsonCharacter) {
		UUID simponId = UUID.randomUUID();
		simpsonCharacter.setSimpsonId(simponId);
		simpsonDataAccessService.addNewSimpsonCharacter(simponId, simpsonCharacter);
	}

	public void updateSimpsonCharacter(UUID simpsonId, SimpsonCharacter simpsonCharacter) {
		simpsonDataAccessService.updateSimpsonCharacter(simpsonId, simpsonCharacter);
	}

	public void deleteSimpsonCharacter(UUID simpsonId) {
		simpsonDataAccessService.deleteSimpsonCharacter(simpsonId);
	}

}
