package com.api.basics;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiPostAutomation {

	public static void main(String[] args) {
		
		
		RequestSpecification reqSpec;

		// 1 First to initialize
		reqSpec = RestAssured.given();

		
		reqSpec = reqSpec.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}");
//here use post
		Response response = reqSpec.post("https://reqres.in/api/users");

		// again the same from Get class
		// Status code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String asString = response.asString();
		System.out.println(asString);

		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);

	}
}
