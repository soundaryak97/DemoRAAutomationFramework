package com.api.requestModels;

public class SignupRequest {
public String username;
public String email;
public String password;
public String firstName;
public String lastName;
public String mobileNumber;
public SignupRequest(String username, String email, String password, String firstName, String lastName,
		String mobileNumber) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobileNumber = mobileNumber;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "SignupRequest [username=" + username + ", email=" + email + ", password=" + password + ", firstName="
			+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
}

// Inner class has to be static ,this is called Builder design pattern
//Builder design pattern doesnt have constructor, it has setter methods
//In builder design pattern, methods will always return something
public static class Builder
{
	public String username;
	public String email;
	public String password;
	public String firstName;
	public String lastName;
	public String mobileNumber;
	
	public Builder setUsername(String username) {
		this.username = username;
		return this;//we are not using builder b=new builder because this will create a new object and constructor will be called.
		//if we use this, it will not create a new object , it will return the current object
	}
	
	public Builder setPassword(String password) {
		this.password = password;
		return this;//we are not using builder b=new builder because this will create a new object and constructor will be called.
		//if we use this, it will not create a new object , it will return the current object
	}
	
	public Builder setEmail(String email) {
		this.email = email;
		return this;//we are not using builder b=new builder because this will create a new object and constructor will be called.
		//if we use this, it will not create a new object , it will return the current object
	}
	
	public Builder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;//we are not using builder b=new builder because this will create a new object and constructor will be called.
		//if we use this, it will not create a new object , it will return the current object
	}
	
	public Builder setLastName(String lastName) {
		this.lastName = lastName;
		return this;//we are not using builder b=new builder because this will create a new object and constructor will be called.
		//if we use this, it will not create a new object , it will return the current object
	}
	
	public Builder setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;//we are not using builder b=new builder because this will create a new object and constructor will be called.
		//if we use this, it will not create a new object , it will return the current object
	}
	
	public SignupRequest build() {
		return new SignupRequest(username, email, password, firstName, lastName, mobileNumber);
	}
	
}
}
