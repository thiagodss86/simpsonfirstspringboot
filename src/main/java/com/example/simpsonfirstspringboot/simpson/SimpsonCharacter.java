package com.example.simpsonfirstspringboot.simpson;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpsonCharacter implements Serializable{	

	private static final long serialVersionUID = 1L;

	private UUID simpsonId;
	
	private String name;
	
	private String surname;
	
	private LocalDate birthday;
	
	private String country;
	
	private String city;

	public SimpsonCharacter(@JsonProperty("simpsonId") UUID simpsonId,
			                @JsonProperty("name") String name, 
			                @JsonProperty("surname") String surname, 
			                @JsonProperty("birthday") LocalDate birthday, 
			                @JsonProperty("country") String country, 
			                @JsonProperty("city") String city) {
		super();
		this.simpsonId = simpsonId;
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.country = country;
		this.city = city;
	}
	
	public UUID getSimpsonId() {
		return simpsonId;
	}
	
	public void setSimpsonId(UUID simpsonId) {
		this.simpsonId = simpsonId;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public LocalDate getBirthday() {	
		return birthday;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}
	

}
