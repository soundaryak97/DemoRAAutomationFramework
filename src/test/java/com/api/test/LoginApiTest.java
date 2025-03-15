package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.requestModels.LoginRequest;
import com.api.requestModels.SignupRequest;
import com.api.responseModel.LoginResponse;

import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(com.api.listners.TestListeners.class)
public class LoginApiTest {

	@Test(description = "verify if login api is working")
	public void loginTest() {
			
		  AuthService auth= new AuthService(); 
		  LoginRequest loginRequest= new LoginRequest("soundarya","Welcome");
		  Response response=auth.login(loginRequest);
		  System.out.println(response.asPrettyString());
		  //Deserialization
		 LoginResponse loginResponse= response.as(LoginResponse.class);
		 System.out.println(loginResponse.getToken());
		 
		 UserManagementService userManagement= new UserManagementService();
		 Response response1=userManagement.GetUsers(loginResponse.getToken());
		 System.out.println(response.asPrettyString());
		 
		 
	}
	
	@Test(description = "verify if login api ")
	public void testall() {
		  System.out.println("testall");
	}

}