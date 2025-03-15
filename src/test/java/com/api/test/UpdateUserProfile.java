package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.requestModels.LoginRequest;
import com.api.requestModels.ProfileRequestModel;
import com.api.responseModel.LoginResponse;
import com.api.responseModel.UserProfileResponseModel;

import io.restassured.response.Response;

public class UpdateUserProfile {

@Test(description="validate update profile")	
public void UpdateProfile() {
	
	AuthService auth=new AuthService();
	Response response=auth.login(new LoginRequest("soundarya","Welcome"));
	LoginResponse loginResponse=response.as(LoginResponse.class);
	System.out.println(response.asPrettyString());
	
	UserManagementService user= new UserManagementService();
	response=user.GetUsers(loginResponse.getToken());
	UserProfileResponseModel userResponseModel=response.as(UserProfileResponseModel.class);
	System.out.println(response.asPrettyString());
	Assert.assertEquals(userResponseModel.getFirstName(), "soundarya");
	
	ProfileRequestModel profilerequest= new ProfileRequestModel.Builder().setFirstName("sowmi").build();
	response=user.UpdateUsers(loginResponse.getToken(), profilerequest);
	UserProfileResponseModel profileresponse=response.as(UserProfileResponseModel.class);
	System.out.println(response.asPrettyString());
	
	
	
}

}
