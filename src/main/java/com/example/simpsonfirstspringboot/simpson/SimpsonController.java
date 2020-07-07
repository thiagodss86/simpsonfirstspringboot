package com.example.simpsonfirstspringboot.simpson;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("simpsons")
public class SimpsonController {
	
private final SimpsonService simpsonService;
	
	@Autowired
	public SimpsonController(SimpsonService simpsonService) {
		this.simpsonService = simpsonService;
	}

	@GetMapping
	public List<SimpsonCharacter> getAllSimpsonCharacters(){
		return simpsonService.getAllSimpsons();
	}
	
	@PostMapping
	public void addNewSimpsonCharacter(@RequestBody SimpsonCharacter simpsonCharacter) {
		simpsonService.addNewSimpsonCharacter(simpsonCharacter);
	}
	
	@PutMapping(path = "{simpsonId}")
	public void updateSimpsonCharacter(@PathVariable("simpsonId") UUID simpsonId,
			                           @RequestBody SimpsonCharacter simpsonCharacter) {
		simpsonService.updateSimpsonCharacter(simpsonId, simpsonCharacter);
	}
	
	@DeleteMapping(path = "{simpsonId}")
	public void deleteSimpsonCharacter(@PathVariable("simpsonId") UUID simpsonId) {
		simpsonService.deleteSimpsonCharacter(simpsonId);
	}

}
