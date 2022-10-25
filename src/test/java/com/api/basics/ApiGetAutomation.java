package com.api.basics;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiGetAutomation {

	public static void main(String[] args) {

RequestSpecification reqSpec;
		
		
		// 1 initialize RestAssured Class
		reqSpec= RestAssured.given();
		
		//2 add the parameters(query or path parameter),header,Auth/..,Body
		reqSpec=reqSpec.header("Content-Type","application json");
		
		// 3 path parameter
		//reqSpec=reqSpec.pathParam("page", "2");
		
		//4 method type 
		//here we give the url to do automate manual post into automate
		//here use get 
		Response response = reqSpec.get("https://reqres.in/api/users?page=2");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		//asString
		String asString = response.asString();
		System.out.println(asString);
		
		//asPretty String
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}

}
