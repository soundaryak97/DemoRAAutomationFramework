package com.api.base;

import com.api.requestModels.ProfileRequestModel;

import io.restassured.response.Response;

public class UserManagementService extends BaseService {
	private static final String BASE_PATH= "/api/users/";
	
	public Response GetUsers(String token) {
		SetToken(token);
		return getRequest(BASE_PATH + "profile");
	}
	
	public Response UpdateUsers(String token, ProfileRequestModel model) {
		SetToken(token);
		return putRequest(model,BASE_PATH + "/profile");
	}

}
