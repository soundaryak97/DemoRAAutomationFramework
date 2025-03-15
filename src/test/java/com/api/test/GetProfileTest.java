package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.requestModels.LoginRequest;
import com.api.responseModel.LoginResponse;
import com.api.responseModel.UserProfileResponseModel;

import io.restassured.response.Response;

public class GetProfileTest {
	
	@Test(description="verify if get profile api is working")
	public void GetProfile() {
		AuthService auth= new AuthService();
		Response response=auth.login(new LoginRequest("soundarya","Welcome"));
		LoginResponse deserialization=response.as(LoginResponse.class);
		String token=deserialization.getToken();
		
		
		UserManagementService usermanagement=new UserManagementService();
		Response response1=usermanagement.GetUsers(token);
		System.out.println(response1.asPrettyString());
		System.out.println(response1.as(UserProfileResponseModel.class));
		}
	
}
