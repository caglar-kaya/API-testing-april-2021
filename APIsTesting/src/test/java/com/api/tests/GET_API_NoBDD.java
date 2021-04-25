package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_API_NoBDD {
	
	@Test(priority = 1, enabled = false)
	public void getUserListAPITest() {
		RestAssured.baseURI = "https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		request.header("Authorization", "Bearer f44e51032b4360417dbb77b25899589099c2886060d02fd445748d1d47c57d2e");
		
		Response response = request.get("public-api/users");
		
		System.out.println(response.asString());
		System.out.println(response.prettyPrint());
		
		int statusCode = response.getStatusCode();
		int expectedStatusCode = 200;
		Assert.assertEquals(statusCode, expectedStatusCode);
		
		String server = response.getHeader("Server");
		String expectedServer = "nginx";
		Assert.assertEquals(server, expectedServer);
		
	}
	
	@Test(priority = 2, enabled = true)
	public void getUserList2APITest() {
		RestAssured.baseURI = "https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		request.header("Authorization", "Bearer f44e51032b4360417dbb77b25899589099c2886060d02fd445748d1d47c57d2e");
		
		request.queryParam("name", "Bharat Bharadwaj");
		request.queryParam("gender", "Female");
		request.queryParam("status", "Inactive");
		
		Response response = request.get("public-api/users");

		System.out.println(response.asString());
		System.out.println(response.prettyPrint());
		
		int statusCode = response.getStatusCode();
		int expectedStatusCode = 200;
		Assert.assertEquals(statusCode, expectedStatusCode);
		
		String server = response.getHeader("Server");
		String expectedServer = "nginx";
		Assert.assertEquals(server, expectedServer);
		
	}

}
