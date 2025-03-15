package com.api.base;

import static io.restassured.RestAssured.*;

import java.util.Objects;

import com.api.requestModels.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;  
import com.api.filters.*;

public class BaseService {

	private static final String BASE_URL="http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;
	
	static {
		RestAssured.filters(new LoggingFilter()); //this should run only once hence added to static block
		}
	public BaseService(){
		//request specification is an interface, so object can be created. Only its methods can be called.
		requestSpecification= given().baseUri(BASE_URL);
	}
	
	public Response postRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	public Response getRequest(String endpoint) {
		return requestSpecification.get(endpoint);
	}
	public void SetToken(String token) {
		 requestSpecification.header("Authorization","Bearer "+token);
	}
	
	public Response putRequest(Object payload,String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
	}
	
}
