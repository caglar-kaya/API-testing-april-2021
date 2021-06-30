package com.api.tests;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GET_API_Call {
	
	// BDD (Behaviour Driven Development) Approach Technique
	
	@Test(priority = 1, enabled = false)
	public void getUserListAPItest() {
		
		RestAssured.baseURI = "https://gorest.co.in/";
		given()
			.log().all()
			.contentType("application/json")
			.header("Authorization", "Bearer f44e51032b4360417dbb77b25899589099c2886060d02fd445748d1d47c57d2e")
			.when().log().all()
			.get("public-api/users")
			.then().log().all()
			.statusCode(200)
			.and()
			.header("Server", "nginx");
			
	}
	
	@Test(priority = 2, enabled = false)
	public void getSingleUserAPItest() {
		
		RestAssured.baseURI = "https://gorest.co.in/";
		given()
			.log().all()
			.contentType("application/json")
			.header("Authorization", "Bearer f44e51032b4360417dbb77b25899589099c2886060d02fd445748d1d47c57d2e")
			.when().log().all()
			.get("public-api/users?name=Abani Joshi")
			.then().log().all()
			.statusCode(200)
			.and()
			.header("Server", "nginx");
			
	}
	
	@Test(priority = 3, enabled = true)
	public void getUserWithOneQueryParameterAPItest() {
		
		RestAssured.baseURI = "https://gorest.co.in/";
		given()
			.log().all()
			.contentType("application/json")
			.header("Authorization", "Bearer f44e51032b4360417dbb77b25899589099c2886060d02fd445748d1d47c57d2e")
			.queryParam("name", "Bhaswar Marar")
			.queryParam("gender", "Female")
			.when().log().all()
			.get("public-api/users")
			.then().log().all()
			.statusCode(200)
			.and()
			.header("Server", "nginx");
		
	}

}
