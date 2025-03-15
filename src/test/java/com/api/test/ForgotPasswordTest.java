package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description="verify if forgot password api is working")
	public void forgotPassword() {
		AuthService auth= new AuthService();
		Response response=auth.forgotPassword("soundaryakkumar7@gmail.com");
		Assert.assertEquals(response.getStatusCode(), "200");
	}

}
