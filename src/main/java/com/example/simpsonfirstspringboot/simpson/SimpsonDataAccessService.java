package com.example.simpsonfirstspringboot.simpson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
public class SimpsonDataAccessService {
	
	private Map<UUID, SimpsonCharacter> listSimpsonCharacter;
	
	public SimpsonDataAccessService() {
		super();
		this.listSimpsonCharacter = new HashMap<UUID, SimpsonCharacter>();
	}

	public List<SimpsonCharacter> getAllSimpsons() {
		return new ArrayList<SimpsonCharacter>(listSimpsonCharacter.values());
	}

	public void addNewSimpsonCharacter(UUID simpsonId, SimpsonCharacter simpsonCharacter) {
		listSimpsonCharacter.put(simpsonId, simpsonCharacter);
	}

	public void updateSimpsonCharacter(UUID simpsonId, SimpsonCharacter simpsonCharacter) {
		listSimpsonCharacter.put(simpsonId, simpsonCharacter);
	}

	public void deleteSimpsonCharacter(UUID simpsonId) {
		listSimpsonCharacter.remove(simpsonId);
	}

}
