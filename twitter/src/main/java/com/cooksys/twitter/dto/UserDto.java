package com.cooksys.twitter.dto;

public class UserDto {
	
	private String username;
	
	public UserDto() {
		
	}

	public UserDto(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
