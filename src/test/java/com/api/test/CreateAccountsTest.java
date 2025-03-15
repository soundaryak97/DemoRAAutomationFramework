package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.requestModels.SignupRequest;

import io.restassured.response.Response;

public class CreateAccountsTest {

	@Test(description = "verify if create account api is working")
	public void createAccountTest() {
		SignupRequest signup=new SignupRequest.Builder().setUsername("soundarya").setEmail("").setPassword("Welcome").setFirstName("Soundarya")
				.setLastName("K").setMobileNumber("1234567890").build();
		AuthService auth= new AuthService();
		Response response=auth.signup(signup);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), "200");
		
	}
}
