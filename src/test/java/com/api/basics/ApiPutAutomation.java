package com.api.basics;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiPutAutomation {

	public static void main(String[] args) {

		RequestSpecification reqSpec;

		// 1 First to initialize
		reqSpec = RestAssured.given();

		reqSpec = reqSpec.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}");
// here use put
		Response response = reqSpec.put("https://reqres.in/api/users/2");

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
