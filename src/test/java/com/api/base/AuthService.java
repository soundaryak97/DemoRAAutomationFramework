package com.api.base;



import java.util.HashMap;

import com.api.requestModels.LoginRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{

	private static final String BASE_PATH= "/api/auth/";
	
	//login endpoint
	public Response login(Object payload) {
		return postRequest(payload,BASE_PATH +"login");
	}
	
	//signup endpoint
	public Response signup(Object payload) {
		return postRequest(payload,BASE_PATH +"signup");
	}
	
	//forgot password
	public Response forgotPassword (String email) {
		HashMap<String,String> payload= new HashMap<String,String>();
	  return postRequest(payload,BASE_PATH +"forgot-password");
	}
}


