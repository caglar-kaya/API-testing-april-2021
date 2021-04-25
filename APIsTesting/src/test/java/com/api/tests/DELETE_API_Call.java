package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETE_API_Call {
	
	@Test
	public void deleteUserWithAPITest() {
		RestAssured.baseURI = "https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		request.header("Authorization", "Bearer f44e51032b4360417dbb77b25899589099c2886060d02fd445748d1d47c57d2e");
		
		Response response = request.delete("public-api/users/123");
		
		System.out.println(response.prettyPrint());
		
		int statusCode = response.getStatusCode();
		int expectedStatusCode = 200;
		Assert.assertEquals(statusCode, expectedStatusCode);
		
	}
}
