package com.victorcarablut.code.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "countries")
public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	// Standard Country Name
	@Column(length = 100, nullable = false)
	private String countryName;
	
	// ISO Alpha-2 code
	@Column(length = 10, name = "country_alpha2_code", nullable = false)
	private String countryAlpha2Code;
	
	// Country Flag (PNG) (BLOB = Up to 64 Kb)
	@Column(columnDefinition = "BLOB", nullable = false)
	private byte[] countryFlag;

	public Country() {
	
	}
	

	public Country(String countryName, String countryAlpha2Code, byte[] countryFlag) {
		this.countryName = countryName;
		this.countryAlpha2Code = countryAlpha2Code;
		this.countryFlag = countryFlag;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryAlpha2Code() {
		return countryAlpha2Code;
	}

	public void setCountryAlpha2Code(String countryAlpha2Code) {
		this.countryAlpha2Code = countryAlpha2Code;
	}

	public byte[] getCountryFlag() {
		return countryFlag;
	}

	public void setCountryFlag(byte[] countryFlag) {
		this.countryFlag = countryFlag;
	}
	
	

}
