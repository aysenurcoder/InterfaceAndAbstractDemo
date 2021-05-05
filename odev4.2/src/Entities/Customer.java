package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Customer implements Entity {
	private int id;
	private String firtsName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firtsName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	

}
