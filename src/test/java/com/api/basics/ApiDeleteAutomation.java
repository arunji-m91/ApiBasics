package com.api.basics;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiDeleteAutomation {

	public static void main(String[] args) {

		RequestSpecification reqSpec;

		// 1 First to initialize
		reqSpec = RestAssured.given();

       // here use put
		Response response = reqSpec.delete("https://reqres.in/api/users/2");

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
