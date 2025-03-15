package com.api.requestModels;

public class ProfileRequestModel {

	public String firstName;
	public String lastName;
	public String email;
	public String mobileNumber;
	public ProfileRequestModel(String firstName, String lastName, String email, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "ProfileRequestModel [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	//To create a builder design pattern, you need to create a inner class. Inner class should be static in nature.
	public static class Builder{
		public String firstName;
		public String lastName;
		public String email;
		public String mobileNumber;
		
		//Create a method and set the value for the variable and return the current object that is this 
		public Builder setFirstName(String firstName) {
		this.firstName=firstName;
		return this;
		}
		
		public Builder setLastName(String  lastName) {
			this.lastName=lastName;
			return this;
			}
			
		public Builder setEmail(String email) {
			this.email=email;
			return this;
			}
			
		public Builder setMobileNumber(String mobileNumber) {
			this.mobileNumber=mobileNumber;
			return this;
			}
			
		
		//create a build method
		public ProfileRequestModel build() {
			//here we need to create an object of outer class
			ProfileRequestModel profile= new ProfileRequestModel(firstName, lastName, email, mobileNumber);
			return profile;
		}
		
		
	}
}
