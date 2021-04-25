package com.api.tests;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT_API_Call {

	@Test
	public void updateUserWithAPITest() {
		RestAssured.baseURI = "https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		request.header("Authorization", "Bearer f44e51032b4360417dbb77b25899589099c2886060d02fd445748d1d47c57d2e");
		
		request.contentType("application/json");
		
		File file = new File("C:\\Users\\User\\workspace\\APIsTesting\\src\\test\\java\\com\\api\\tests\\updateuser.json");
		request.body(file);
		
		Response response = request.put("public-api/users/123");
		
		System.out.println(response.prettyPrint());
		
	}
}
