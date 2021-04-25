package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_CallNoBDD {
	
	@Test
	public void tokenPostAPITest() {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
		RequestSpecification request = RestAssured.given().log().all();

		String payload = "{\"username\" : \"admin\", \"password\" : \"password123\"}";
		
		request.contentType("application/json");
		request.body(payload);
		
		Response response = request.post("auth");
		
		System.out.println(response.prettyPrint());
		System.out.println(response.statusCode());
		
		JsonPath jsonPath = response.jsonPath();
		String tokenID = jsonPath.get("token");
		Assert.assertNotNull(tokenID);
	}


}
